package com.itwill.chobomungo.product;

public class Product {
	private int p_no;
	private String p_title;
	private int p_price;
	private String p_image;
	private String p_desc;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int p_no, String p_title, int p_price, String p_image, String p_desc) {
		super();
		this.p_no = p_no;
		this.p_title = p_title;
		this.p_price = p_price;
		this.p_image = p_image;
		this.p_desc = p_desc;
	}

	public int getP_no() {
		return p_no;
	}

	public String getP_title() {
		return p_title;
	}

	public int getP_price() {
		return p_price;
	}

	public String getP_image() {
		return p_image;
	}

	public String getP_desc() {
		return p_desc;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public void setP_title(String p_title) {
		this.p_title = p_title;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_title=" + p_title + ", p_price=" + p_price + ", p_image=" + p_image
				+ ", p_desc=" + p_desc + "]\n";
	}
	
	
}
