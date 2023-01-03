package com.itwill.member.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.Member;
import com.itwill.member.MemberService;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class MemberMainFrame extends JFrame {
	/********1.MemberService멤버필드선언*********/
	private MemberService memberService;
	/*
	ProductService productService;
	...
	 */
	/***************************/
	private Member loginMember=null;
	
	private JPanel contentPane;
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JPasswordField passwordField;
	private JLabel idMsgLB;
	private JComboBox ageCB;
	private JCheckBox marriedCK;
	private JPasswordField login_pwTF;
	private JTextField login_idTF;
	private JTextField info_idTF;
	private JPasswordField info_pwTF;
	private JTextField info_nameTF;
	private JTextField info_addressTF;
	private JTabbedPane memberTabbedPane;
	private JComboBox info_ageCB;
	private JCheckBox info_marriedCK;
	private JMenuItem loginMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public MemberMainFrame() throws Exception {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 542);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu memberMenu = new JMenu("회원");
		menuBar.add(memberMenu);
		
		loginMenuItem = new JMenuItem("로그인");
		memberMenu.add(loginMenuItem);
		
		JMenuItem joinMenuItem_2 = new JMenuItem("가입");
		memberMenu.add(joinMenuItem_2);
		
		JMenuItem logoutMenuItem_1 = new JMenuItem("로그아웃");
		memberMenu.add(logoutMenuItem_1);
		
		JSeparator separator = new JSeparator();
		memberMenu.add(separator);
		
		JMenuItem exitMenuItem_3 = new JMenuItem("종료");
		memberMenu.add(exitMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel memberLoginPanel = new JPanel();
		memberLoginPanel.setBackground(Color.PINK);
		memberLoginPanel.setForeground(Color.BLACK);
		memberTabbedPane.addTab("로그인", null, memberLoginPanel, null);
		memberLoginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(72, 139, 57, 15);
		memberLoginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setBounds(72, 196, 57, 15);
		memberLoginPanel.add(lblNewLabel_1);
		
		login_idTF = new JTextField();
		login_idTF.setBounds(141, 136, 116, 21);
		memberLoginPanel.add(login_idTF);
		login_idTF.setColumns(10);
		
		login_pwTF = new JPasswordField();
		login_pwTF.setBounds(141, 193, 116, 21);
		memberLoginPanel.add(login_pwTF);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*******회원로그인********/
				try {
					String id = login_idTF.getText();
					String pw = new String(login_pwTF.getPassword());
					
					int result = memberService.login(id, pw);
					if(result==0) {
						//로그인성공
						loginProcess(id);
											
					}else {
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀립니다.");
						login_idTF.setSelectionStart(0);
						login_idTF.setSelectionEnd(id.length());
						login_idTF.requestFocus();
					}
					
				} catch (Exception e1) {
					
				}
			}
		});
		loginBtn.setBounds(72, 282, 97, 23);
		memberLoginPanel.add(loginBtn);
		
		JButton joinBtn = new JButton("회원가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memberTabbedPane.setSelectedIndex(1);
			}
		});
		joinBtn.setBounds(224, 282, 97, 23);
		memberLoginPanel.add(joinBtn);
		
		JPanel memberJoinPanel = new JPanel();
		memberJoinPanel.setBackground(Color.LIGHT_GRAY);
		memberTabbedPane.addTab("회원가입", null, memberJoinPanel, null);
		memberJoinPanel.setLayout(null);
		
		idTF = new JTextField();
		idTF.setBounds(124, 62, 116, 21);
		memberJoinPanel.add(idTF);
		idTF.setColumns(10);
		
		JLabel 아이디 = new JLabel("아이디");
		아이디.setBounds(65, 65, 57, 15);
		memberJoinPanel.add(아이디);
		
		JLabel 비밀번호 = new JLabel("비밀번호");
		비밀번호.setBounds(65, 96, 57, 15);
		memberJoinPanel.add(비밀번호);
		
		nameTF = new JTextField();
		nameTF.setColumns(10);
		nameTF.setBounds(124, 124, 116, 21);
		memberJoinPanel.add(nameTF);
		
		JLabel 이름 = new JLabel("이름");
		이름.setBounds(65, 127, 57, 15);
		memberJoinPanel.add(이름);
		
		addressTF = new JTextField();
		addressTF.setColumns(10);
		addressTF.setBounds(124, 155, 116, 21);
		memberJoinPanel.add(addressTF);
		
		JLabel 주소 = new JLabel("주소");
		주소.setBounds(65, 158, 57, 15);
		memberJoinPanel.add(주소);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("나이");
		lblNewLabel_1_1_1_1.setBounds(65, 189, 57, 15);
		memberJoinPanel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("결혼여부");
		lblNewLabel_1_1_1_1_1.setBounds(65, 220, 57, 15);
		memberJoinPanel.add(lblNewLabel_1_1_1_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 93, 116, 21);
		memberJoinPanel.add(passwordField);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"나이를 선택하세요", "20", "21", "22", "23", "24"}));
		ageCB.setBackground(Color.WHITE);
		ageCB.setBounds(124, 185, 116, 23);
		memberJoinPanel.add(ageCB);
		
		marriedCK = new JCheckBox("");
		marriedCK.setBounds(125, 216, 21, 23);
		memberJoinPanel.add(marriedCK);
		
		JButton memberJoinBtn = new JButton("가입");
		memberJoinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/********회원가입*********/
				try {
					/************TextField로 부터 데이타 얻기*************/
					String id = idTF.getText();
					String pw = new String(passwordField.getPassword());
					String name = nameTF.getText();
					String address = addressTF.getText();
					
					/******유효성체크******/
					if(id.equals("")) {
						idMsgLB.setText("아이디를 입력하세요.");
						idTF.requestFocus();
						return;
					}
					String ageStr = (String)ageCB.getSelectedItem();
					//if(ageStr.equals("나이를 선택하세요")){
					//}
					int age = Integer.parseInt(ageStr);
					String married = "";
					if(marriedCK.isSelected()) {
						married = "T";
					}else {
						married = "F";
					}
					
					Member newMember = new Member(id,pw,name,address,age,married,null);
					boolean isAdd = memberService.addMember(newMember);
					if(isAdd) {
						//로그인 화면전환
						memberTabbedPane.setSelectedIndex(0);
					}else {
						JOptionPane.showMessageDialog(null, "이미 사용하고있는 아이디입니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());
					}
					memberService.addMember(newMember);
				} catch (Exception e1) {
					System.out.println("회원가입 --> "+e1.getMessage());
				}
			}
		});
		memberJoinBtn.setBounds(65, 311, 97, 23);
		memberJoinPanel.add(memberJoinBtn);
		
		JButton memberCancleBtn = new JButton("취소");
		memberCancleBtn.setBounds(233, 311, 97, 23);
		memberJoinPanel.add(memberCancleBtn);
		
		idMsgLB = new JLabel("");
		idMsgLB.setForeground(Color.RED);
		idMsgLB.setBounds(252, 65, 138, 15);
		memberJoinPanel.add(idMsgLB);
		
		JPanel memberInfoPanel = new JPanel();
		memberInfoPanel.setBackground(Color.LIGHT_GRAY);
		memberTabbedPane.addTab("회원정보", null, memberInfoPanel, null);
		memberInfoPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(149, 323, 97, 23);
		memberInfoPanel.add(btnNewButton);
		
		JLabel 아이디_1 = new JLabel("아이디");
		아이디_1.setBounds(94, 106, 57, 15);
		memberInfoPanel.add(아이디_1);
		
		info_idTF = new JTextField();
		info_idTF.setEnabled(false);
		info_idTF.setColumns(10);
		info_idTF.setBounds(153, 103, 116, 21);
		memberInfoPanel.add(info_idTF);
		
		JLabel 비밀번호_1 = new JLabel("비밀번호");
		비밀번호_1.setBounds(94, 137, 57, 15);
		memberInfoPanel.add(비밀번호_1);
		
		info_pwTF = new JPasswordField();
		info_pwTF.setEditable(false);
		info_pwTF.setBounds(153, 134, 116, 21);
		memberInfoPanel.add(info_pwTF);
		
		JLabel 이름_1 = new JLabel("이름");
		이름_1.setBounds(94, 168, 57, 15);
		memberInfoPanel.add(이름_1);
		
		info_nameTF = new JTextField();
		info_nameTF.setEditable(false);
		info_nameTF.setColumns(10);
		info_nameTF.setBounds(153, 165, 116, 21);
		memberInfoPanel.add(info_nameTF);
		
		JLabel 주소_1 = new JLabel("주소");
		주소_1.setBounds(94, 199, 57, 15);
		memberInfoPanel.add(주소_1);
		
		info_addressTF = new JTextField();
		info_addressTF.setEditable(false);
		info_addressTF.setColumns(10);
		info_addressTF.setBounds(153, 196, 116, 21);
		memberInfoPanel.add(info_addressTF);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("나이");
		lblNewLabel_1_1_1_1_2.setBounds(94, 230, 57, 15);
		memberInfoPanel.add(lblNewLabel_1_1_1_1_2);
		
		info_ageCB = new JComboBox();
		info_ageCB.setBackground(Color.WHITE);
		info_ageCB.setBounds(153, 226, 116, 23);
		memberInfoPanel.add(info_ageCB);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("결혼여부");
		lblNewLabel_1_1_1_1_1_1.setBounds(94, 261, 57, 15);
		memberInfoPanel.add(lblNewLabel_1_1_1_1_1_1);
		
		info_marriedCK = new JCheckBox("");
		info_marriedCK.setEnabled(false);
		info_marriedCK.setBounds(154, 257, 21, 23);
		memberInfoPanel.add(info_marriedCK);
		
		/********2.MemberService멤버필드객체생성*********/
		memberService = new MemberService();
		
		
	}//생성자 끝
	
	private void loginProcess(String id) throws Exception {
		/**********로그인성공시 해야할일***********
		 1.로그인 성공한 맴버객체 멤버필드에 저장
		 2.MemberMainFrame타이틀 변경
		 3.로그인,회원가입탭 불활성화
		 4.회원정보보기 화면전환
		 ******************************************/
		//1.로그인성공한 멤버객체 멤버필드에 저장
		this.loginMember = memberService.memberDetail(id);
		
		//2.MemberMainFrame타이틀 변경
		setTitle(id+"님 로그인");
		
		//3.로그인화면,회원가입화면 불활성화
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		
		//4.회원정보보기화면
		memberTabbedPane.setSelectedIndex(2);
		
		/*****회원상세데이터보여주기*****/
		info_idTF.setText(loginMember.getM_id());
		info_pwTF.setText(loginMember.getM_password());
		info_nameTF.setText(loginMember.getM_name());
		info_addressTF.setText(loginMember.getM_address());
		
		//info_ageCB.setS
		
	}
	
	private void infoProcess() {
		
	}
}
