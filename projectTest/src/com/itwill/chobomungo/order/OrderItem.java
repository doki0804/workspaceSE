package com.itwill.chobomungo.order;

import com.itwill.chobomungo.product.Product;

public class OrderItem {
	private int oi_no;
	private int oi_qty;
	private int o_no;
	private Product product;
	
	public OrderItem() {
		
		product = new Product();
	}

	public OrderItem(int oi_no, int oi_qty, int o_no, Product product) {
		super();
		this.oi_no = oi_no;
		this.oi_qty = oi_qty;
		this.o_no = o_no;
		this.product = product;
	}

	public int getOi_no() {
		return oi_no;
	}

	public void setOi_no(int oi_no) {
		this.oi_no = oi_no;
	}

	public int getOi_qty() {
		return oi_qty;
	}

	public void setOi_qty(int oi_qty) {
		this.oi_qty = oi_qty;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItem [oi_no=" + oi_no + ", oi_qty=" + oi_qty + ", o_no=" + o_no + ", product=" + product + "]\n";
	}
	
	
	
	
}
