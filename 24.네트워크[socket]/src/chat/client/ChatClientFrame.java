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

import chat.common.ChatProtocol;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

public class ChatClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField chatTF;
	private JScrollPane scrollPane;
	private JTextArea displayTA;
	
	/***********ClientClientThread**************/
	private ClientClientThread client;
	private JScrollPane westScrollPane;
	private JList chatList;
	private JComboBox comboBox;

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
		displayTA.setFont(new Font("??????????????????", Font.BOLD, 17));
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
					JOptionPane.showInternalMessageDialog(null, "???????????? ???????????????.");
					
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
		chatTF.setColumns(28);

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
		
		comboBox = new JComboBox();
		panel.add(comboBox);
		
		westScrollPane = new JScrollPane();
		contentPane.add(westScrollPane, BorderLayout.WEST);
		
		chatList = new JList();
		
		westScrollPane.setViewportView(chatList);
		/***********ClientClientThread????????????***********/
		client = new ClientClientThread();
		client.start();
		setTitle(client.getUserId()+"??? ???????????????");
	}//?????????

	private void displayMessage(String msg) {
		displayTA.append(msg + "\n");
		int maxSize = scrollPane.getVerticalScrollBar().getMaximum();
		scrollPane.getVerticalScrollBar().setValue(maxSize);
	}

	/*****************************************************
	 * ??????????????????????????? ???????????? ????????? ????????? ???????????? ?????????(VO) - ?????????????????? ??????1?????? ???????????????????????? - ?????????????????? ?????????
	 * ??????????????? ????????? - ?????????????????? 1?????????????????????
	 ****************************************************/
	public class ClientClientThread extends Thread {
		private Socket socket;
		private String id;
		private BufferedReader in;
		private PrintWriter out;
		
		public ClientClientThread() throws Exception {
			this.socket = new Socket("192.168.15.18",8888);
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
		 * ???????????? ????????? ????????? ??????
		 */
		@Override
		public void run() {
			while(true) {
				try {
					System.out.println("A.ClientClientThread: ????????????????????? ???????????? ???????????? ????????? ??????");
					
					String chatStr = in.readLine();
					String[] chatArray = chatStr.split("#");
					System.out.println(chatArray[0]);
					if(chatArray[0].equals(ChatProtocol.PLAIN_MSG)) {
						System.out.println("B.ClientClientThread: ??????????????? ?????? ???????????? displayTA??? ????????????");
						displayMessage(chatArray[1]);
					}else if(chatArray[0].equals(ChatProtocol.LIST_MSG)) {
						System.out.println("C.ClientClientThread:??????????????? ?????? LIST_MSG ???????????? ??????????????? LIST??????");
						String[] idArray = chatArray[1].split("%");
						DefaultListModel model = new DefaultListModel();
						for (String id : idArray) {
							model.addElement(id);
						}
						chatList.setModel(model);
					}
				} catch (IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
	}
}