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
	private JTextField textField;
	private JTextField textField_1;
	private JLabel orderNumberOfItemtLB;

	/**
	 * Create the panel.
	 */
	public OrderPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel orderPanel = new JPanel();
		add(orderPanel, BorderLayout.CENTER);
		orderPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel orderPanel_1 = new JPanel();
		orderPanel_1.setLayout(null);
		orderPanel_1.setBackground(Color.WHITE);
		orderPanel.add(orderPanel_1, BorderLayout.CENTER);
		
		JPanel orderDeliveryPanel = new JPanel();
		orderDeliveryPanel.setLayout(null);
		orderDeliveryPanel.setBorder(null);
		orderDeliveryPanel.setBackground(new Color(226, 226, 226));
		orderDeliveryPanel.setBounds(12, 10, 348, 102);
		orderPanel_1.add(orderDeliveryPanel);
		
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
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(92, 36, 229, 21);
		orderDeliveryPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 67, 229, 21);
		orderDeliveryPanel.add(textField_1);
		
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
		orderPanel_1.add(orderNumberOfItemPanel);
		
		orderNumberOfItemtLB = new JLabel("");
		orderNumberOfItemtLB.setBounds(12, 0, 75, 30);
		orderNumberOfItemPanel.add(orderNumberOfItemtLB);
		
		JButton orderBTN = new JButton("주문 하기");
		orderBTN.setBounds(12, 429, 348, 43);
		orderPanel_1.add(orderBTN);
		
		JPanel orderTotalPricePanel = new JPanel();
		orderTotalPricePanel.setLayout(null);
		orderTotalPricePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		orderTotalPricePanel.setBackground(Color.WHITE);
		orderTotalPricePanel.setBounds(12, 376, 348, 30);
		orderPanel_1.add(orderTotalPricePanel);
		
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
		orderPanel_1.add(orderListScrollPane);
		
		JPanel orderListPanel = new JPanel();
		orderListPanel.setPreferredSize(new Dimension(320, 200));
		orderListScrollPane.setViewportView(orderListPanel);
		
		JPanel orderDetailPanel = new JPanel();
		orderDetailPanel.setPreferredSize(new Dimension(320, 60));
		orderListPanel.add(orderDetailPanel);
		orderDetailPanel.setLayout(null);
		
		JLabel orderDetailLB = new JLabel("New label");
		orderDetailLB.setBounds(0, 0, 320, 60);
		orderDetailPanel.add(orderDetailLB);

	}
}
