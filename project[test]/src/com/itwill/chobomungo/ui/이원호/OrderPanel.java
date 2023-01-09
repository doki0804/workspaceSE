package com.itwill.chobomungo.ui.이원호;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class OrderPanel extends JPanel {
	private JTextField orderDeliveryAddressTF;
	private JTextField orderDeliveryNameTF;
	private JPanel orderDetailPanel;
	private JPanel orderListPanel;

	/**
	 * Create the panel.
	 */
	public OrderPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel orderPanel = new JPanel();
		orderPanel.setLayout(null);
		orderPanel.setBackground(Color.WHITE);
		add(orderPanel, BorderLayout.CENTER);
		
		JPanel orderDeliveryPanel = new JPanel();
		orderDeliveryPanel.setLayout(null);
		orderDeliveryPanel.setBorder(null);
		orderDeliveryPanel.setBackground(new Color(226, 226, 226));
		orderDeliveryPanel.setBounds(12, 10, 348, 102);
		orderPanel.add(orderDeliveryPanel);
		
		JLabel orderDeliveryInfoLB = new JLabel("배송정보");
		orderDeliveryInfoLB.setFont(new Font("D2Coding ligature", Font.PLAIN, 14));
		orderDeliveryInfoLB.setBounds(12, 10, 68, 15);
		orderDeliveryPanel.add(orderDeliveryInfoLB);
		
		JCheckBox orderDeliveryCB = new JCheckBox("기본 배송지");
		orderDeliveryCB.setHorizontalTextPosition(SwingConstants.LEADING);
		orderDeliveryCB.setHorizontalAlignment(SwingConstants.CENTER);
		orderDeliveryCB.setFont(new Font("D2Coding", Font.PLAIN, 14));
		orderDeliveryCB.setBorder(null);
		orderDeliveryCB.setBackground(new Color(226, 226, 226));
		orderDeliveryCB.setBounds(238, 6, 102, 23);
		orderDeliveryPanel.add(orderDeliveryCB);
		
		orderDeliveryAddressTF = new JTextField();
		orderDeliveryAddressTF.setColumns(10);
		orderDeliveryAddressTF.setBounds(92, 36, 229, 21);
		orderDeliveryPanel.add(orderDeliveryAddressTF);
		
		orderDeliveryNameTF = new JTextField();
		orderDeliveryNameTF.setColumns(10);
		orderDeliveryNameTF.setBounds(92, 67, 229, 21);
		orderDeliveryPanel.add(orderDeliveryNameTF);
		
		JLabel orderDeliveryAddressLB = new JLabel("주소");
		orderDeliveryAddressLB.setFont(new Font("D2Coding ligature", Font.PLAIN, 14));
		orderDeliveryAddressLB.setBounds(12, 39, 57, 15);
		orderDeliveryPanel.add(orderDeliveryAddressLB);
		
		JLabel orderDeliveryNameLB = new JLabel("받는 사람");
		orderDeliveryNameLB.setFont(new Font("D2Coding ligature", Font.PLAIN, 14));
		orderDeliveryNameLB.setBounds(12, 69, 68, 15);
		orderDeliveryPanel.add(orderDeliveryNameLB);
		
		JPanel orderNumberOfItemPanel = new JPanel();
		orderNumberOfItemPanel.setLayout(null);
		orderNumberOfItemPanel.setBounds(12, 148, 348, 30);
		orderPanel.add(orderNumberOfItemPanel);
		
		JLabel orderNumberOfItemtLB = new JLabel("");
		orderNumberOfItemtLB.setBounds(12, 0, 75, 30);
		orderNumberOfItemPanel.add(orderNumberOfItemtLB);
		
		JButton orderBTN = new JButton("주문 하기");
		orderBTN.setBounds(12, 429, 348, 43);
		orderPanel.add(orderBTN);
		
		JPanel orderTotalPricePanel = new JPanel();
		orderTotalPricePanel.setLayout(null);
		orderTotalPricePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		orderTotalPricePanel.setBackground(Color.WHITE);
		orderTotalPricePanel.setBounds(12, 376, 348, 30);
		orderPanel.add(orderTotalPricePanel);
		
		JLabel orderTotalNameLB = new JLabel("최종 결제 금액");
		orderTotalNameLB.setFont(new Font("D2Coding ligature", Font.BOLD, 14));
		orderTotalNameLB.setBounds(12, 0, 99, 26);
		orderTotalPricePanel.add(orderTotalNameLB);
		
		JLabel orderTotalPriceLB = new JLabel("200,000원");
		orderTotalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderTotalPriceLB.setFont(new Font("D2Coding ligature", Font.BOLD, 14));
		orderTotalPriceLB.setBounds(237, 0, 99, 26);
		orderTotalPricePanel.add(orderTotalPriceLB);
		
		JScrollPane orderListScrollPane = new JScrollPane();
		orderListScrollPane.setBounds(12, 178, 348, 188);
		orderPanel.add(orderListScrollPane);
		
		orderListPanel = new JPanel();
		orderListPanel.setPreferredSize(new Dimension(320, 200));
		orderListScrollPane.setViewportView(orderListPanel);
		
		orderDetailPanel = new JPanel();
		orderDetailPanel.setLayout(null);
		orderDetailPanel.setPreferredSize(new Dimension(320, 60));
		orderListPanel.add(orderDetailPanel);
		
		JLabel orderDetailLB = new JLabel("New label");
		orderDetailLB.setBounds(0, 0, 320, 60);
		orderDetailPanel.add(orderDetailLB);
		
		displayOrderList();
	}

	public void displayOrderList() {
		orderDetailPanel.removeAll();
		for(int i = 0 ; i<5 ; i++) {
			
			JPanel orderDetailPanel = new JPanel();
			orderDetailPanel.setLayout(null);
			orderDetailPanel.setPreferredSize(new Dimension(320, 60));
			orderListPanel.add(orderDetailPanel);
			
			JLabel orderDetailLB = new JLabel("New label");
			orderDetailLB.setBounds(0, 0, 320, 60);
			orderDetailPanel.add(orderDetailLB);
		}
	}
}
