package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class BorderLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutJFrame frame = new BorderLayoutJFrame();
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
	public BorderLayoutJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		btnNewButton = new JButton("NORTH");
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("WEST");
		contentPane.add(btnNewButton_1, BorderLayout.WEST);
		
		btnNewButton_2 = new JButton("CENTER");
		contentPane.add(btnNewButton_2, BorderLayout.CENTER);
		
		btnNewButton_3 = new JButton("EAST");
		contentPane.add(btnNewButton_3, BorderLayout.EAST);
		
		btnNewButton_4 = new JButton("SOUTH");
		contentPane.add(btnNewButton_4, BorderLayout.SOUTH);
	}

}
