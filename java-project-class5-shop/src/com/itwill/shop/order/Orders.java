package com.itwill.shop.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orders {
	private int o_no;
	private String o_desc;
	private Date o_date;
	private int o_price;
	/********FK********/
	private String user_id;
	
	/********List<OrderItem>********/
	private List<OrderItem> orderItemList;
	
	public Orders() {
		orderItemList = new ArrayList<OrderItem>();
	}

	public Orders(int o_no, String o_desc, Date o_date, int o_price, String user_id) {
		super();
		this.o_no = o_no;
		this.o_desc = o_desc;
		this.o_date = o_date;
		this.o_price = o_price;
		this.user_id = user_id;
		this.orderItemList = new ArrayList<OrderItem>();
	}

	public int getO_no() {
		return o_no;
	}

	public String getO_desc() {
		return o_desc;
	}

	public Date getO_date() {
		return o_date;
	}

	public int getO_price() {
		return o_price;
	}

	public String getUser_id() {
		return user_id;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}

	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}

	public void setO_price(int o_price) {
		this.o_price = o_price;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

	@Override
	public String toString() {
		return "Orders [o_no=" + o_no + ", o_desc=" + o_desc + ", o_date=" + o_date + ", o_price=" + o_price
				+ ", user_id=" + user_id + ", orderItemList=" + orderItemList + "]";
	}
	
	
}
