package com.itwill.chobomungo.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;

public class ShopMainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopMainFrame frame = new ShopMainFrame();
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
	public ShopMainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));


		
		
		JPanel globalSouthMenuPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) globalSouthMenuPanel.getLayout();
		flowLayout.setHgap(40);
		globalSouthMenuPanel.setPreferredSize(new Dimension(10, 70));
		globalSouthMenuPanel.setBackground(Color.WHITE);
		contentPane.add(globalSouthMenuPanel, BorderLayout.SOUTH);
		
		JButton globalOrderBTN = new JButton("");
		globalOrderBTN.setBackground(Color.WHITE);
		globalOrderBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalOrderBTN.setBorder(null);
		globalOrderBTN.setOpaque(false);
		globalOrderBTN.setBorderPainted(false);
		globalOrderBTN.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/image/order-now.png")));
		globalSouthMenuPanel.add(globalOrderBTN);
		
		JButton globalHomeBTN = new JButton("");
		globalHomeBTN.setBorder(null);
		globalHomeBTN.setBorderPainted(false);
		globalHomeBTN.setBackground(Color.WHITE);
		globalHomeBTN.setOpaque(false);
		globalHomeBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalHomeBTN.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/image/house.png")));
		globalSouthMenuPanel.add(globalHomeBTN);
		
		JButton globalMemberMenuBTN = new JButton("");
		globalMemberMenuBTN.setBackground(Color.WHITE);
		globalMemberMenuBTN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		globalMemberMenuBTN.setBorder(null);
		globalMemberMenuBTN.setBorderPainted(false);
		globalMemberMenuBTN.setOpaque(false);
		globalMemberMenuBTN.setIcon(new ImageIcon(ShopMainFrame.class.getResource("/image/user.png")));
		globalSouthMenuPanel.add(globalMemberMenuBTN);
		
		JTabbedPane shopTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(shopTabbedPane, BorderLayout.CENTER);
		
		JTabbedPane productTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("제품", null, productTabbedPane, null);
		
		PopularProductPanel popularProductPanel = new PopularProductPanel();
		productTabbedPane.addTab("New tab", null, popularProductPanel, null);
		
		JTabbedPane memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		shopTabbedPane.addTab("회원", null, memberTabbedPane, null);
		
		MemberJoinPanel memberJoinPanel = new MemberJoinPanel();
		memberTabbedPane.addTab("New tab", null, memberJoinPanel, null);
	}

}
