package wb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setFont(new Font("D2Coding", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\01.JAVA_DEVELOPER\\01.JAVA_FUNDMENTAL\\image\\android_logo.gif"));
		setTitle("test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 306);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new LineBorder(null));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBackground(new Color(255, 255, 240));
		lblNewLabel.setBounds(41, 59, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(41, 113, 57, 15);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setToolTipText("아이디를 입력하세요.");
		textField.setBounds(174, 56, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 110, 116, 21);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(41, 185, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(174, 185, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("아이디저장");
		chckbxNewCheckBox.setFont(new Font("D2Coding", Font.PLAIN, 12));
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(41, 148, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("D2Coding", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"로그인방법선택", "카카오", "네이버", "구글", "애플"}));
		comboBox.setBounds(174, 148, 116, 27);
		contentPane.add(comboBox);
	}
}
