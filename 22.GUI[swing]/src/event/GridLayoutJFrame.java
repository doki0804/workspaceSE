package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton bSlash;
	private JButton bResult;
	private JButton bMultiple;
	private JButton bDot;
	private JButton bMinus;
	private JButton bPlus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.setLayout(new GridLayout(0, 4, 0, 0));
		contentPane.add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b9);
		
		bMinus = new JButton("-");
		bMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(bMinus);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b4);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b5);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b6);
		
		bPlus = new JButton("+");
		bPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(bPlus);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(b3);
		
		bMultiple = new JButton("*");
		bMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(bMultiple);
		
		JButton b0 = new JButton("0");
		b0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
				setTitle("0");
			}
		});
		contentPane.add(b0);
		
		bDot = new JButton(".");
		bDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(bDot);
		
		bSlash = new JButton("/");
		bSlash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
				System.out.print(sourceBtn.getText());
			}
		});
		contentPane.add(bSlash);
		
		bResult = new JButton("enter");
		bResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton sourceBtn = (JButton)e.getSource();
			}
		});
		contentPane.add(bResult);
	}

}
