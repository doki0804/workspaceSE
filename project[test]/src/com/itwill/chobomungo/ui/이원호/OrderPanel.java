package com.itwill.chobomungo.ui.이원호;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.itwill.chobomungo.order.OrderService;
import com.itwill.chobomungo.order.Orders;
import com.itwill.chobomungo.ui.ChobomungoMainFrame;
import com.itwill.chobomungo.user.User;

import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class OrderPanel extends JPanel {
	private JTextField orderDeliveryAddressTF;
	private JTextField orderDeliveryNameTF;
	private JPanel orderDetailPanel;
	private JPanel orderListPanel;
	private JCheckBox orderDeliveryCKB;
	private JButton orderBTN;
	private JLabel orderTotalPriceLB;
	private JPanel orderTotalPricePanel;
	
	/**
	 * Create the panel.
	 * @throws Exception 
	 */
	public OrderPanel(User loginUser) throws Exception {
		setPreferredSize(new Dimension(400, 620));

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
		
		orderDeliveryCKB = new JCheckBox("기본 배송지");
		orderDeliveryCKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(orderDeliveryCKB.isSelected()) {
					orderDeliveryAddressTF.setText(loginUser.getUserAddress());
					orderDeliveryNameTF.setText(loginUser.getUserName());
				}else {
					orderDeliveryAddressTF.setText("");
					orderDeliveryNameTF.setText("");
					orderDeliveryAddressTF.requestFocus();
				}
			}
		});
		orderDeliveryCKB.setHorizontalTextPosition(SwingConstants.LEADING);
		orderDeliveryCKB.setHorizontalAlignment(SwingConstants.CENTER);
		orderDeliveryCKB.setFont(new Font("D2Coding", Font.PLAIN, 14));
		orderDeliveryCKB.setBorder(null);
		orderDeliveryCKB.setBackground(new Color(226, 226, 226));
		orderDeliveryCKB.setBounds(238, 6, 102, 23);
		orderDeliveryPanel.add(orderDeliveryCKB);
		
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
		orderNumberOfItemPanel.setBounds(12, 116, 348, 30);
		orderPanel.add(orderNumberOfItemPanel);
		
		JLabel orderNumberOfItemtLB = new JLabel("");
		orderNumberOfItemtLB.setBounds(12, 0, 75, 30);
		orderNumberOfItemPanel.add(orderNumberOfItemtLB);
		
		orderBTN = new JButton("주문 하기");
		orderBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		orderBTN.setBounds(12, 376, 348, 43);
		orderPanel.add(orderBTN);
		
		orderTotalPricePanel = new JPanel();
		orderTotalPricePanel.setLayout(null);
		orderTotalPricePanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		orderTotalPricePanel.setBackground(Color.WHITE);
		orderTotalPricePanel.setBounds(12, 339, 348, 30);
		orderPanel.add(orderTotalPricePanel);
		
		JLabel orderTotalNameLB = new JLabel("최종 결제 금액");
		orderTotalNameLB.setFont(new Font("D2Coding ligature", Font.BOLD, 14));
		orderTotalNameLB.setBounds(12, 0, 99, 26);
		orderTotalPricePanel.add(orderTotalNameLB);
		
		orderTotalPriceLB = new JLabel("200,000원");
		orderTotalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
		orderTotalPriceLB.setFont(new Font("D2Coding ligature", Font.BOLD, 14));
		orderTotalPriceLB.setBounds(237, 0, 99, 26);
		orderTotalPricePanel.add(orderTotalPriceLB);
		
		JScrollPane orderListScrollPane = new JScrollPane();
		orderListScrollPane.setBounds(12, 146, 348, 188);
		orderPanel.add(orderListScrollPane);
		
		orderListPanel = new JPanel();
		orderListPanel.setBackground(Color.WHITE);
		orderListPanel.setPreferredSize(new Dimension(320, 500));
		orderListScrollPane.setViewportView(orderListPanel);
		orderListPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		orderDetailPanel = new JPanel();
		orderDetailPanel.setLayout(null);
		orderDetailPanel.setPreferredSize(new Dimension(320, 80));
		orderListPanel.add(orderDetailPanel);
		
		JLabel orderDetailLB = new JLabel("New label");
		orderDetailLB.setBounds(12, 10, 250, 21);
		orderDetailPanel.add(orderDetailLB);
		
		JLabel orderDetailPriceLB = new JLabel("New label");
		orderDetailPriceLB.setBounds(12, 49, 250, 21);
		orderDetailPanel.add(orderDetailPriceLB);
		
		JButton orderDetailDeleteBTN = new JButton("x");
		orderDetailDeleteBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		orderDetailDeleteBTN.setBounds(274, 9, 39, 23);
		orderDetailPanel.add(orderDetailDeleteBTN);
	
		displayOrderList(loginUser);
		
	}
	public void displayOrderList(User loginUser) throws Exception {
		OrderService orderService = new OrderService();
		orderListPanel.removeAll();
		orderTotalPricePanel.removeAll();
		List<Orders> orderList = orderService.orderList(loginUser.getUserId());
		int totPrice = 0;
		for(Orders order : orderList) {
			totPrice += order.getO_price();
			orderDetailPanel = new JPanel();
			orderDetailPanel.setLayout(null);
			orderDetailPanel.setPreferredSize(new Dimension(320, 80));
			
			JLabel orderDetailLB = new JLabel(order.getO_desc());
			orderDetailLB.setBounds(12, 10, 250, 21);
			orderDetailPanel.add(orderDetailLB);
			
			JLabel orderDetailPriceLB = new JLabel("가격 : "+new DecimalFormat("#,###원").format(order.getO_price()));
			orderDetailPriceLB.setBounds(12, 49, 250, 21);
			orderDetailPanel.add(orderDetailPriceLB);
			
			JButton orderDetailDeleteBTN = new JButton("x");
			orderDetailDeleteBTN.setBounds(274, 9, 39, 23);
			orderDetailPanel.add(orderDetailDeleteBTN);
			orderDetailDeleteBTN.addActionListener(new ActionListener() {
				private Orders o = order;
				public void actionPerformed(ActionEvent e) {
					// 오더리스트 1개 삭제
					try {
						int deleteOrderListCount = orderService.deleteOrderNo(loginUser.getUserId(), o.getO_no());
						JOptionPane.showMessageDialog(null, deleteOrderListCount + "개의 주문이 삭제되었습니다.");
						displayOrderList(loginUser);
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			});
			
			JLabel orderTotalNameLB = new JLabel("최종 결제 금액");
			orderTotalNameLB.setFont(new Font("D2Coding ligature", Font.BOLD, 14));
			orderTotalNameLB.setBounds(12, 0, 99, 26);
			orderTotalPricePanel.add(orderTotalNameLB);
			
			orderTotalPriceLB = new JLabel(new DecimalFormat("#,###원").format(totPrice));
			orderTotalPriceLB.setHorizontalAlignment(SwingConstants.RIGHT);
			orderTotalPriceLB.setFont(new Font("D2Coding ligature", Font.BOLD, 14));
			orderTotalPriceLB.setBounds(237, 0, 99, 26);
			orderTotalPricePanel.add(orderTotalPriceLB);
			
			orderListPanel.add(orderDetailPanel);
			
		}
	}


}
