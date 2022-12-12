package client;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EchoClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField echoTF;
	private JScrollPane scrollPane;
	private JTextArea displayTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EchoClientFrame frame = new EchoClientFrame();
					frame.setVisible(true);
					frame.echoTF.requestFocus();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EchoClientFrame() {
		setTitle("EchoClientFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		echoTF = new JTextField();
		echoTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("text filed event");
				/**************************************/
				try {
					String echoStr = echoTF.getText();
					if(echoStr==null || echoStr.trim().equals("")) {
						echoTF.setText("");
						echoTF.requestFocus();
						return;
					}
					echoTF.setText("");
					echoTF.requestFocus();
				/*
				 * 1.Socket생성
				 */
					Socket socket = new Socket("192.168.15.31",9999);
				/*
				 * 2.서버로문자데이타쓰기
				 * 		- OutputStream 얻기
				 * 		- OutputStream(byte) --> Writer(char)로 변경
				 */
					OutputStream out = socket.getOutputStream();
					OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
					PrintWriter pw = new PrintWriter(osw);
					pw.println(echoStr);
					pw.flush();
				/*
				 * 3.서버에서 전송되는 데이타 읽기
				 * 		- InputStream 얻기
				 * 		- InputStream(byte) --> Reader(char)로 변경
				 */
					InputStream in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in,"UTF-8");
					BufferedReader br = new BufferedReader(isr);
					String serverEchoStr = br.readLine();
					displayTA.append(serverEchoStr+"\n");
					System.out.println(serverEchoStr);
					
				}catch (Exception e1) {
					System.out.println(e1.getMessage());
				}
				/*************************************/
			}
		});
		echoTF.setFont(new Font("D2Coding", Font.BOLD, 18));
		
		contentPane.add(echoTF, BorderLayout.SOUTH);
		echoTF.setColumns(10);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		displayTA = new JTextArea();
		displayTA.setFont(new Font("D2Coding", Font.BOLD, 17));
		displayTA.setEditable(false);
		scrollPane.setViewportView(displayTA);
		echoTF.requestFocus();
		
		
		
	}
	
	

}
