package com.itwill.chobomungo.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.chobomungo.user.User;

public class Orders {
	private int o_no;
	private String o_desc;
	private int o_price;
	private Date o_date;
	private String userId;
	
	private List<OrderItem> orderItemList;
	
	public Orders() {
		orderItemList = new ArrayList<OrderItem>();
	}

	public Orders(int o_no, String o_desc, int o_price, Date o_date, String userId) {
		super();
		this.o_no = o_no;
		this.o_desc = o_desc;
		this.o_price = o_price;
		this.o_date = o_date;
		this.userId = userId;
		this.orderItemList = new ArrayList<OrderItem>();
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public String getO_desc() {
		return o_desc;
	}

	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}

	public int getO_price() {
		return o_price;
	}

	public void setO_price(int o_price) {
		this.o_price = o_price;
	}

	public Date getO_date() {
		return o_date;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public String getUserId() {
		return userId;
	}

	public void setUser(String userId) {
		this.userId = userId;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public String toString() {
		return "Orders [o_no=" + o_no + ", o_desc=" + o_desc + ", o_price=" + o_price + ", o_date=" + o_date + ", user="
				+ userId + ", orderItemList=" + orderItemList + "]";
	}

	
	
	
	
}
