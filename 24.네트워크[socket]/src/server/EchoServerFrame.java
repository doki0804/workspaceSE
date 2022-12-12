package server;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class EchoServerFrame extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTextArea displayTA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EchoServerFrame frame = new EchoServerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EchoServerFrame() {
		setTitle("EchoServer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		displayTA = new JTextArea();
		displayTA.setFont(new Font("나눔고딕코딩", Font.BOLD, 16));
		scrollPane.setViewportView(displayTA);
		/********* EchoServerThread start ********/
		EchoServerThread echoServerThread = new EchoServerThread();
		echoServerThread.start();
		/*****************************************/
		
	}
	/******************** EchoServerThread **************************/
	/*
	 0.EchoServerThread:ServerSocket생성(9999)
     1.EchoServerThread:클라이언드연결요청쓰레드가대기
	 2.EchoServerThread:클라이언드와연결된 서버쪽소켓
	 3.EchoServerThread:서버쪽소켓으로부터 입력,출력스트림생성
	 4.EchoServerThread:입력스트림을사용해서 클라이언트전송데이타읽기
	 5.EchoServerThread:클라이언트로부터읽은데이타
	 6.EchoServerThread:클라이언트에 데이타쓰기
	 7.EchoServerThread:클라이언드와연결된 서버쪽소켓닫기
	*/ 
	public class EchoServerThread extends Thread {
		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(9999);
				while(true) {
					Socket socket = serverSocket.accept();
					BufferedReader in = new BufferedReader
							(new InputStreamReader(socket.getInputStream(),"UTF-8"));
					String clientMessage = in.readLine();
					displayTA.append(clientMessage+"\n");
					PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
					out.println(clientMessage);
					out.flush();
					in.close();
					out.close();
					socket.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	/********************EchoServerThread**************************/	
	
}