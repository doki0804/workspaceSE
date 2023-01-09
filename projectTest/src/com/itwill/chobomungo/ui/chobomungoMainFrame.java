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
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class chobomungoMainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField topSearchTF;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JPasswordField passwordField_3;
	private JPasswordField passwordField_4;

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
		setPreferredSize(new Dimension(340, 720));
		setTitle("CHOBO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 594);
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
		productMainPanel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane bookMainScrollPane = new JScrollPane();
		bookMainScrollPane.setBackground(Color.WHITE);
		productMainPanel.add(bookMainScrollPane, BorderLayout.CENTER);
		
		JPanel BookMainPanel = new JPanel();
		BookMainPanel.setPreferredSize(new Dimension(360, 720));
		BookMainPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		BookMainPanel.setBackground(Color.WHITE);
		bookMainScrollPane.setViewportView(BookMainPanel);
		
		JPanel productPanel_1 = new JPanel();
		productPanel_1.setLayout(null);
		productPanel_1.setSize(new Dimension(120, 120));
		productPanel_1.setPreferredSize(new Dimension(170, 190));
		productPanel_1.setMinimumSize(new Dimension(150, 150));
		productPanel_1.setMaximumSize(new Dimension(200, 200));
		productPanel_1.setBounds(new Rectangle(0, 0, 120, 120));
		productPanel_1.setBorder(null);
		productPanel_1.setBackground(Color.WHITE);
		productPanel_1.setAlignmentY(1.0f);
		productPanel_1.setAlignmentX(1.0f);
		BookMainPanel.add(productPanel_1);
		
		JLabel productImageLabel = new JLabel("");
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setBounds(3, 1, 162, 116);
		productPanel_1.add(productImageLabel);
		
		JLabel productDescLabel = new JLabel("<html>\r\n\t<font size='3'>\r\n\t\t\r\n\t\t\t제목: 난중일기<br>\r\n\t\t\t가격: 24,000<br>\r\n\t\t\t설명: 임진왜란에...\r\n\t\t\r\n </font></html>");
		productDescLabel.setVerticalAlignment(SwingConstants.TOP);
		productDescLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		productDescLabel.setHorizontalAlignment(SwingConstants.LEFT);
		productDescLabel.setBounds(3, 143, 164, 47);
		productPanel_1.add(productDescLabel);
		
		JButton cartAddButton = new JButton("");
		cartAddButton.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/smallcart.png")));
		cartAddButton.setOpaque(false);
		cartAddButton.setForeground(Color.WHITE);
		cartAddButton.setBorder(null);
		cartAddButton.setBackground(Color.WHITE);
		cartAddButton.setBounds(136, 119, 31, 23);
		productPanel_1.add(cartAddButton);
		
		JComboBox cartQtyComboBox = new JComboBox();
		cartQtyComboBox.setOpaque(false);
		cartQtyComboBox.setMaximumRowCount(10);
		cartQtyComboBox.setBorder(null);
		cartQtyComboBox.setBackground(Color.WHITE);
		cartQtyComboBox.setAutoscrolls(true);
		cartQtyComboBox.setBounds(99, 119, 33, 23);
		productPanel_1.add(cartQtyComboBox);
		
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
		loginPanel.setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		loginPanel.add(layeredPane, BorderLayout.CENTER);
		
		JButton loginBTN = new JButton("로그인");
		loginBTN.setBounds(76, 283, 97, 23);
		layeredPane.add(loginBTN);
		
		JButton joinBTN = new JButton("회원가입");
		joinBTN.setBounds(208, 283, 97, 23);
		layeredPane.add(joinBTN);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(139, 187, 147, 29);
		layeredPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_1.setBounds(76, 194, 57, 15);
		layeredPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel.setBounds(76, 133, 57, 15);
		layeredPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(139, 126, 147, 29);
		layeredPane.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/login-.png")));
		lblNewLabel_4.setBounds(151, 25, 72, 91);
		layeredPane.add(lblNewLabel_4);
		
		JPanel joinPanel = new JPanel();
		joinPanel.setBackground(SystemColor.window);
		tabbedPane.addTab("회원가입", null, joinPanel, null);
		joinPanel.setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		joinPanel.add(layeredPane_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2.setBounds(76, 95, 95, 15);
		layeredPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("비밀번호");
		lblNewLabel_2_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(76, 130, 95, 15);
		layeredPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("비밀번호확인");
		lblNewLabel_2_2.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(76, 166, 95, 15);
		layeredPane_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("전화번호");
		lblNewLabel_2_2_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBounds(76, 234, 95, 15);
		layeredPane_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("주소");
		lblNewLabel_2_2_2.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_2.setBounds(76, 267, 95, 15);
		layeredPane_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("e-mail");
		lblNewLabel_2_2_2_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_2_1.setBounds(76, 301, 95, 15);
		layeredPane_1.add(lblNewLabel_2_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("이름");
		lblNewLabel_2_2_1_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_1_1.setBounds(76, 203, 95, 15);
		layeredPane_1.add(lblNewLabel_2_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 92, 138, 21);
		layeredPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 200, 138, 21);
		layeredPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 231, 138, 21);
		layeredPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(169, 264, 138, 21);
		layeredPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(169, 298, 138, 21);
		layeredPane_1.add(textField_5);
		
		JButton joinJoinBTN = new JButton("회원가입");
		joinJoinBTN.setBounds(76, 333, 97, 23);
		layeredPane_1.add(joinJoinBTN);
		
		JButton joinCancleBTN = new JButton("취소");
		joinCancleBTN.setBounds(210, 333, 97, 23);
		layeredPane_1.add(joinCancleBTN);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(169, 127, 138, 21);
		layeredPane_1.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(169, 163, 138, 21);
		layeredPane_1.add(passwordField_2);
		
		JLabel lblNewLabel_3 = new JLabel("      회원 가입");
		lblNewLabel_3.setFont(new Font("D2Coding", Font.BOLD, 16));
		lblNewLabel_3.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/link.png")));
		lblNewLabel_3.setBounds(81, 10, 226, 58);
		layeredPane_1.add(lblNewLabel_3);
		
		JPanel userInfoPanel = new JPanel();
		userInfoPanel.setBackground(SystemColor.window);
		tabbedPane.addTab("회원정보", null, userInfoPanel, null);
		userInfoPanel.setLayout(new BorderLayout(0, 0));
		
		JLayeredPane layeredPane_1_1 = new JLayeredPane();
		userInfoPanel.add(layeredPane_1_1, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2_3 = new JLabel("아이디");
		lblNewLabel_2_3.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_3.setBounds(74, 63, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("비밀번호");
		lblNewLabel_2_1_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(74, 98, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("비밀번호확인");
		lblNewLabel_2_2_3.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_3.setBounds(74, 134, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("전화번호");
		lblNewLabel_2_2_1_2.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_1_2.setBounds(74, 202, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_2_1_2);
		
		JLabel lblNewLabel_2_2_2_2 = new JLabel("주소");
		lblNewLabel_2_2_2_2.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_2_2.setBounds(74, 235, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("e-mail");
		lblNewLabel_2_2_2_1_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_2_1_1.setBounds(74, 269, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_2_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("이름");
		lblNewLabel_2_2_1_1_1.setFont(new Font("D2Coding", Font.BOLD, 14));
		lblNewLabel_2_2_1_1_1.setBounds(74, 171, 95, 15);
		layeredPane_1_1.add(lblNewLabel_2_2_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(167, 60, 138, 21);
		layeredPane_1_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(167, 168, 138, 21);
		layeredPane_1_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(167, 199, 138, 21);
		layeredPane_1_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(167, 232, 138, 21);
		layeredPane_1_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(167, 266, 138, 21);
		layeredPane_1_1.add(textField_10);
		
		JButton joinJoinBTN_1 = new JButton("정보수정");
		joinJoinBTN_1.setBounds(74, 331, 97, 23);
		layeredPane_1_1.add(joinJoinBTN_1);
		
		JButton joinCancleBTN_1 = new JButton("회원탈퇴");
		joinCancleBTN_1.setBounds(208, 331, 97, 23);
		layeredPane_1_1.add(joinCancleBTN_1);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(167, 95, 138, 21);
		layeredPane_1_1.add(passwordField_3);
		
		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(167, 131, 138, 21);
		layeredPane_1_1.add(passwordField_4);
		
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
		topPanel.setPreferredSize(new Dimension(10, 45));
		contentPane.add(topPanel, BorderLayout.NORTH);
		topPanel.setLayout(null);
		
		topSearchTF = new JTextField();
		topSearchTF.setBounds(97, 9, 182, 25);
		topPanel.add(topSearchTF);
		topSearchTF.setColumns(10);
		
		JButton topSearchBTN = new JButton("");
		topSearchBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		topSearchBTN.setBounds(277, 8, 53, 29);
		topSearchBTN.setOpaque(false);
		topSearchBTN.setBorderPainted(false);
		topSearchBTN.setForeground(Color.WHITE);
		topSearchBTN.setBackground(Color.WHITE);
		topSearchBTN.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/search_image.png")));
		topPanel.add(topSearchBTN);
		
		JButton topCartBTN = new JButton("");
		topCartBTN.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/trolley.png")));
		topCartBTN.setOpaque(false);
		topCartBTN.setForeground(Color.WHITE);
		topCartBTN.setBorderPainted(false);
		topCartBTN.setBackground(Color.WHITE);
		topCartBTN.setBounds(331, 3, 53, 42);
		topPanel.add(topCartBTN);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.WHITE);
		bottomPanel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(null);
		
		JButton btOrderBTN = new JButton("");
		btOrderBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btOrderBTN.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/order-now.png")));
		btOrderBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btOrderBTN.setBackground(Color.WHITE);
		btOrderBTN.setBorderPainted(false);
		btOrderBTN.setOpaque(false);
		btOrderBTN.setBounds(47, 0, 62, 50);
		bottomPanel.add(btOrderBTN);
		
		JButton btHomeBTN = new JButton("");
		btHomeBTN.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/house.png")));
		btHomeBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btHomeBTN.setOpaque(false);
		btHomeBTN.setBorderPainted(false);
		btHomeBTN.setBackground(Color.WHITE);
		btHomeBTN.setBounds(163, 0, 62, 50);
		bottomPanel.add(btHomeBTN);
		
		JButton btUserBTN = new JButton("");
		btUserBTN.setIcon(new ImageIcon(chobomungoMainFrame.class.getResource("/image/user.png")));
		btUserBTN.setOpaque(false);
		btUserBTN.setBorderPainted(false);
		btUserBTN.setBackground(Color.WHITE);
		btUserBTN.setBounds(280, 0, 62, 50);
		bottomPanel.add(btUserBTN);
	}
}
