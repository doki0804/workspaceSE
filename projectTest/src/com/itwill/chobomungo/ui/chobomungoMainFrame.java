package com.itwill.chobomungo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

public class chobomungoMainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField loginIdTF;
	private JButton loginBTN;
	private JButton joinBTN;
	private JTextField joinNameTF;
	private JTextField joinPhoneTF;
	private JTextField joinAddressTF;
	private JTextField joinEmailTF;
	private JTextField userInfoId;
	private JTextField uesrInfoPasswordTF;
	private JTextField userInfoPasswordCKTF;
	private JTextField userInfoName;
	private JTextField userinfoPhone;
	private JTextField userinfoaddres;
	private JTextField userInfoEmailTF;
	private JTextField searchTF;
	private JTextField joinIdTF;
	private JPasswordField joinPasswordField;
	private JPasswordField joinPasswordCKField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chobomungoMainFrame frame = new chobomungoMainFrame();
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
	public chobomungoMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 594);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainTabbedPane.setBackground(Color.WHITE);
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);
		
		JPanel productPanel = new JPanel();
		mainTabbedPane.addTab("상품", null, productPanel, null);
		productPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		productPanel.add(productTabbedPane, BorderLayout.CENTER);
		
		JPanel productMainPanel = new JPanel();
		productMainPanel.setBackground(Color.WHITE);
		productTabbedPane.addTab("메인", null, productMainPanel, null);
		
		JPanel pNo_1_panel = new JPanel();
		pNo_1_panel.setBackground(Color.WHITE);
		productTabbedPane.addTab("New tab", null, pNo_1_panel, null);
		
		JPanel userPanel = new JPanel();
		mainTabbedPane.addTab("유저", null, userPanel, null);
		userPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		userPanel.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(SystemColor.window);
		tabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		loginIdTF = new JTextField();
		loginIdTF.setBounds(148, 126, 147, 29);
		loginPanel.add(loginIdTF);
		loginIdTF.setColumns(10);
		
		loginBTN = new JButton("로그인");
		loginBTN.setBounds(85, 283, 97, 23);
		loginPanel.add(loginBTN);
		
		joinBTN = new JButton("회원가입");
		joinBTN.setBounds(217, 283, 97, 23);
		loginPanel.add(joinBTN);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("D2Coding", Font.PLAIN, 14));
		lblNewLabel.setBounds(85, 133, 57, 15);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("D2Coding", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(85, 194, 57, 15);
		loginPanel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 187, 147, 29);
		loginPanel.add(passwordField);
		
		JPanel joinPanel = new JPanel();
		joinPanel.setBackground(SystemColor.window);
		tabbedPane.addTab("회원가입", null, joinPanel, null);
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(67, 79, 57, 15);
		joinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("비밀번호");
		lblNewLabel_2_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(67, 114, 57, 15);
		joinPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("비밀번호확인");
		lblNewLabel_2_2.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(67, 150, 72, 15);
		joinPanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("전화번호");
		lblNewLabel_2_2_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(67, 218, 57, 15);
		joinPanel.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("주소");
		lblNewLabel_2_2_2.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(67, 251, 57, 15);
		joinPanel.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("e-mail");
		lblNewLabel_2_2_2_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_2_1.setBounds(67, 285, 57, 15);
		joinPanel.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("이름");
		lblNewLabel_2_2_1_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_1_1.setBounds(67, 187, 57, 15);
		joinPanel.add(lblNewLabel_2_2_1_1);
		
		joinIdTF = new JTextField();
		joinIdTF.setBounds(160, 76, 138, 21);
		joinPanel.add(joinIdTF);
		joinIdTF.setColumns(10);
		
		joinNameTF = new JTextField();
		joinNameTF.setColumns(10);
		joinNameTF.setBounds(160, 184, 138, 21);
		joinPanel.add(joinNameTF);
		
		joinPhoneTF = new JTextField();
		joinPhoneTF.setColumns(10);
		joinPhoneTF.setBounds(160, 215, 138, 21);
		joinPanel.add(joinPhoneTF);
		
		joinAddressTF = new JTextField();
		joinAddressTF.setColumns(10);
		joinAddressTF.setBounds(160, 248, 138, 21);
		joinPanel.add(joinAddressTF);
		
		joinEmailTF = new JTextField();
		joinEmailTF.setColumns(10);
		joinEmailTF.setBounds(160, 282, 138, 21);
		joinPanel.add(joinEmailTF);
		
		JButton joinJoinBTN = new JButton("회원가입");
		joinJoinBTN.setBounds(90, 347, 97, 23);
		joinPanel.add(joinJoinBTN);
		
		JButton joinCancleBTN = new JButton("취소");
		joinCancleBTN.setBounds(224, 347, 97, 23);
		joinPanel.add(joinCancleBTN);
		
		joinPasswordField = new JPasswordField();
		joinPasswordField.setBounds(160, 111, 138, 21);
		joinPanel.add(joinPasswordField);
		
		joinPasswordCKField = new JPasswordField();
		joinPasswordCKField.setBounds(160, 147, 138, 21);
		joinPanel.add(joinPasswordCKField);
		
		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setBackground(SystemColor.window);
		tabbedPane.addTab("회원정보", null, userInfoPanel, null);
		userInfoPanel.setLayout(null);
		
		JButton infoUpdateBTN = new JButton("정보수정");
		infoUpdateBTN.setBounds(91, 338, 97, 23);
		userInfoPanel.add(infoUpdateBTN);
		
		JLabel lblNewLabel_2_3 = new JLabel("아이디");
		lblNewLabel_2_3.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(91, 70, 57, 15);
		userInfoPanel.add(lblNewLabel_2_3);
		
		userInfoId = new JTextField();
		userInfoId.setColumns(10);
		userInfoId.setBounds(184, 67, 138, 21);
		userInfoPanel.add(userInfoId);
		
		uesrInfoPasswordTF = new JTextField();
		uesrInfoPasswordTF.setColumns(10);
		uesrInfoPasswordTF.setBounds(184, 102, 138, 21);
		userInfoPanel.add(uesrInfoPasswordTF);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("비밀번호");
		lblNewLabel_2_1_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(91, 105, 57, 15);
		userInfoPanel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("비밀번호확인");
		lblNewLabel_2_2_3.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_3.setBounds(91, 141, 72, 15);
		userInfoPanel.add(lblNewLabel_2_2_3);
		
		userInfoPasswordCKTF = new JTextField();
		userInfoPasswordCKTF.setColumns(10);
		userInfoPasswordCKTF.setBounds(184, 138, 138, 21);
		userInfoPanel.add(userInfoPasswordCKTF);
		
		userInfoName = new JTextField();
		userInfoName.setColumns(10);
		userInfoName.setBounds(184, 175, 138, 21);
		userInfoPanel.add(userInfoName);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("이름");
		lblNewLabel_2_2_1_1_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_1_1_1.setBounds(91, 178, 57, 15);
		userInfoPanel.add(lblNewLabel_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("전화번호");
		lblNewLabel_2_2_1_2.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_1_2.setBounds(91, 209, 57, 15);
		userInfoPanel.add(lblNewLabel_2_2_1_2);
		
		userinfoPhone = new JTextField();
		userinfoPhone.setColumns(10);
		userinfoPhone.setBounds(184, 206, 138, 21);
		userInfoPanel.add(userinfoPhone);
		
		userinfoaddres = new JTextField();
		userinfoaddres.setColumns(10);
		userinfoaddres.setBounds(184, 239, 138, 21);
		userInfoPanel.add(userinfoaddres);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("주소");
		lblNewLabel_2_2_2_2.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_2_2.setBounds(91, 242, 57, 15);
		userInfoPanel.add(lblNewLabel_2_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("e-mail");
		lblNewLabel_2_2_2_1_1.setFont(new Font("D2Coding", Font.PLAIN, 12));
		lblNewLabel_2_2_2_1_1.setBounds(91, 276, 57, 15);
		userInfoPanel.add(lblNewLabel_2_2_2_1_1);
		
		userInfoEmailTF = new JTextField();
		userInfoEmailTF.setColumns(10);
		userInfoEmailTF.setBounds(184, 273, 138, 21);
		userInfoPanel.add(userInfoEmailTF);
		
		JButton infoDeleteBTN = new JButton("회원가입");
		infoDeleteBTN.setBounds(225, 338, 97, 23);
		userInfoPanel.add(infoDeleteBTN);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setBackground(Color.WHITE);
		mainTabbedPane.addTab("카트", null, cartPanel, null);
		
		JPanel orderPanel = new JPanel();
		mainTabbedPane.addTab("주문", null, orderPanel, null);
		orderPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		orderPanel.add(tabbedPane_1, BorderLayout.CENTER);
		
		JPanel orderListMain = new JPanel();
		orderListMain.setBackground(Color.WHITE);
		tabbedPane_1.addTab("주문목록", null, orderListMain, null);
		
		JPanel orderDetailPanel = new JPanel();
		orderDetailPanel.setBackground(Color.WHITE);
		tabbedPane_1.addTab("주문상세", null, orderDetailPanel, null);
		
		JPanel topPanel = new JPanel();
		topPanel.setBackground(Color.WHITE);
		topPanel.setPreferredSize(new Dimension(10, 35));
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(null);
		
		searchTF = new JTextField();
		searchTF.setBounds(91, 8, 182, 21);
		topPanel.add(searchTF);
		searchTF.setColumns(10);
		
		JButton searchBTN = new JButton("");
		searchBTN.setBounds(266, 3, 53, 29);
		searchBTN.setOpaque(false);
		searchBTN.setBorderPainted(false);
		searchBTN.setForeground(Color.WHITE);
		searchBTN.setBackground(Color.WHITE);
		searchBTN.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/com/itwill/chobomungo/image/search_image20.png")));
		topPanel.add(searchBTN);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(318, 8, 97, 23);
		topPanel.add(btnNewButton_1);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(null);
		
		JButton orderBTN = new JButton("New button");
		orderBTN.setBounds(59, 17, 97, 23);
		bottomPanel.add(orderBTN);
		
		JButton mainBTN = new JButton("New button");
		mainBTN.setBounds(171, 17, 97, 23);
		bottomPanel.add(mainBTN);
		
		JButton userInfoBTN = new JButton("New button");
		userInfoBTN.setBounds(280, 17, 97, 23);
		bottomPanel.add(userInfoBTN);
	}
}
