package chat.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ChatClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JScrollPane scrollPane;
	private JTextArea displayTA;
	
	/***********ClientClientThread**************/
	private ClientClientThread client;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatClientFrame frame = new ChatClientFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 * @throws UnknownHostException
	 */
	public ChatClientFrame() throws Exception{
		setTitle("\uCC44\uD305\uD074\uB77C\uC774\uC5B8\uD2B8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 17));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.SOUTH);

		chatTF = new JTextField();
		chatTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************/
				System.out.println("TF action event!!!");
				String chatStr = chatTF.getText();
				if(chatStr == null || chatStr.trim().equals("")) {
					JOptionPane.showInternalMessageDialog(null, "메시지를 입력하세요.");
					
					chatTF.setText("");
					chatTF.requestFocus();
					return;
				}
				client.send("["+client.getUserId()+"]"+chatStr);
				chatTF.setText("");
				chatTF.requestFocus();
				
				/***********************/
			}
		});
		chatTF.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(chatTF);
		chatTF.setColumns(38);

		JButton sendB = new JButton("\uC804\uC1A1");
		sendB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***********************/
				String msg = chatTF.getText();
				client.send(msg);
				/***********************/
			}
		});
		panel.add(sendB);
		/***********ClientClientThread객체생성***********/
		client = new ClientClientThread();
		client.start();
		setTitle(client.getUserId()+"님 안녕하세요");
	}//생성자

	private void displayMessage(String msg) {
		displayTA.append(msg + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/*****************************************************
	 * 클라이언트쪽소켓을 사용하여 서버와 통신을 담당하는 클래스(VO) - 서버와연결된 소켓1개를 가지고있는클래스 - 클라이언트의 정보를
	 * 가지고있는 클래스 - 클라이언트당 1개의객체가생성
	 ****************************************************/
	public class ClientClientThread extends Thread {
		private Socket socket;
		private String id;
		private BufferedReader in;
		private PrintWriter out;
		
		public ClientClientThread() throws Exception {
			this.socket = new Socket("192.168.15.31",8888);
			this.id = socket.getLocalAddress().getHostAddress()+"["+socket.getLocalPort()+"]";
			this.in = new BufferedReader(
							new InputStreamReader(
								socket.getInputStream(),"UTF-8"));
			this.out = new PrintWriter(
							new OutputStreamWriter(
								socket.getOutputStream(),"UTF-8"));
		}
		public String getUserId() {
			return id;
		}
		
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		/*
		 * 서버에서 보내는 데이터 읽기
		 */
		@Override
		public void run() {
			while(true) {
				try {
					System.out.println("A.ClientClientThread: 서버로부터오는 데이타를 읽기위해 쓰레드 대기");
					String receiveStr = in.readLine();
					System.out.println("B.ClientClientThread: 서버로부터 읽은 데이타를 displayTA에 보여준다");
					displayMessage(receiveStr);
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		
		
		
	}
	

}