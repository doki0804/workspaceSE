package com.itwill.chobomungo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

import com.itwill.chobomungo.cart.CartService;
import com.itwill.chobomungo.order.OrderService;
import com.itwill.chobomungo.product.ProductService;
import com.itwill.chobomungo.ui.이원호.OrderPanel;
import com.itwill.chobomungo.user.User;
import com.itwill.chobomungo.user.UserService;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChobomungoMainFrame extends JFrame {
	
	/**************서비스객체선언*****************/
	private ProductService productService;
	private OrderService orderService;
	private CartService cartService;
	private UserService userService;
	/*********************************************/
	/*****로그인 user 객체 저장할 user객체*****/
	private User loginUser = new User("book1","1111","강감찬","","서울","111");
	/******************************************/
	
	private JPanel contentPane;
	private JTextField globalSerchTF;
	
	private JTabbedPane productTabbedPane;
	private JTabbedPane userTabbedPane;
	private JTabbedPane chobomungoTabbedPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChobomungoMainFrame frame = new ChobomungoMainFrame();
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
	public ChobomungoMainFrame() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		chobomungoTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(chobomungoTabbedPane, BorderLayout.CENTER);
		
		productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		chobomungoTabbedPane.addTab("상품", null, productTabbedPane, null);
		
		userTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		chobomungoTabbedPane.addTab("유저", null, userTabbedPane, null);
		
		OrderPanel orderPanel = new OrderPanel(loginUser);
		chobomungoTabbedPane.addTab("주문", null, orderPanel, null);
		
		JPanel globalNorthPanel = new JPanel();
		globalNorthPanel.setPreferredSize(new Dimension(10, 50));
		contentPane.add(globalNorthPanel, BorderLayout.NORTH);
		
		globalSerchTF = new JTextField();
		globalSerchTF.setDisabledTextColor(Color.WHITE);
		globalNorthPanel.add(globalSerchTF);
		globalSerchTF.setColumns(10);
		
		JButton globalSerchBTN = new JButton("검색");
		globalNorthPanel.add(globalSerchBTN);
		
		JButton globalCartBTN = new JButton("카트");
		globalCartBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chobomungoTabbedPane.setSelectedIndex(3);
			}
		});
		globalNorthPanel.add(globalCartBTN);
		
		JPanel globalSouthPanel = new JPanel();
		globalSouthPanel.setPreferredSize(new Dimension(10, 70));
		contentPane.add(globalSouthPanel, BorderLayout.SOUTH);
		
		JButton globalOrderBTN = new JButton("주문");
		globalOrderBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chobomungoTabbedPane.setSelectedIndex(2);
			}
		});
		globalSouthPanel.add(globalOrderBTN);
		
		JButton globalHomeBTN = new JButton("홈");
		globalHomeBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chobomungoTabbedPane.setSelectedIndex(0);
			}
		});
		globalSouthPanel.add(globalHomeBTN);
		
		JButton globalUserBTN = new JButton("유저");
		globalUserBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(loginUser==null) {
					chobomungoTabbedPane.setSelectedIndex(0);
					//login_idTF.requestFocus();
				}else {
					//chobomungoTabbedPane.setSelectedIndex(1);
					
				}
			}
		});
		globalSouthPanel.add(globalUserBTN);
		
		loginUser = new User();
	}

}
