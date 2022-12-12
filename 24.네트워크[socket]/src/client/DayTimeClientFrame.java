package client;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class DayTimeClientFrame extends JFrame {

	private JPanel contentPane;
	private JButton requestServerTimeButton;
	private JLabel timeDisplayLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DayTimeClientFrame frame = new DayTimeClientFrame();
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
	public DayTimeClientFrame() {
		setTitle("DayTimeClient");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		requestServerTimeButton = new JButton("Request Server Time");
		requestServerTimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**************************************/
				try {
					/*
					 * 1.Socket생성
					 */
					Socket socket = new Socket("192.168.15.18",8000);
					/*
					 * 2.Socket으로부터 InputStream얻기
					 */
					/*
					 * InputStream[byte stream] --> Reader[character stream]으로 변경하는
					 * 브릿지스트림(InputStreamReader)을 사용해서 변경 
					 */
					InputStream in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in,"UTF-8");
					BufferedReader br = new BufferedReader(isr);
					String serverTime = br.readLine();
					System.out.println(serverTime);
					timeDisplayLabel.setText(serverTime);
					socket.close();
					
					
					
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				}			
				/**************************************/
			}
		});
		contentPane.add(requestServerTimeButton, BorderLayout.SOUTH);
		
		timeDisplayLabel = new JLabel("02:00");
		timeDisplayLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeDisplayLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		contentPane.add(timeDisplayLabel, BorderLayout.CENTER);
		
	}
	

}
