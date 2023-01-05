package com.itwill.shop.cart;

import com.itwill.shop.product.Product;

public class Cart {
	private int cart_no;
	private int cart_qty;
	/*********FK**********/
	private String userid;//FK
	/*********FK**********/
	//private int product_no;
	private Product product;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	} 
		
	public Cart(int cart_no, int cart_qty, String userid, Product product) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.userid = userid;
		this.product = product;
	}

	public int getCart_no() {
		return cart_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public String getUserid() {
		return userid;
	}

	public Product getProduct() {
		return product;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", userid=" + userid + ", product=" + product
				+ "]";
	}
	
	
	
}
