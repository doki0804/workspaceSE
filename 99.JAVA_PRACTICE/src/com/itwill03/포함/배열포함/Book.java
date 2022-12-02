package com.itwill03.포함.배열포함;

public class Book {
	/*
	 * 책번호
	 * 책제목
	 * 책분류
	 * 책설명
	 */
	private int no;
	private String title;
	private String category;
	private String desc;
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int no, String title, String category, String desc) {
		super();
		this.no = no;
		this.title = title;
		this.category = category;
		this.desc = desc;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public void print() {
		System.out.println("\t"+no+"\t"+title+"\t"+category+"\t"+desc+"\t");
		
	}
	
	
}