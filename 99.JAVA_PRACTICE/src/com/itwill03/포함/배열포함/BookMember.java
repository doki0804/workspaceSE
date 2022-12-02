package com.itwill03.포함.배열포함;


public class BookMember {
	//회원번호
	private int no;
	//회원이름
	private String name;
	//전화번호
	private String phoneNumber;
	//빌린책들
	private Book[] books;
	
	public BookMember() {
		
	}
	
	public BookMember(int no, String name, String phoneNumber) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void print() {
		System.out.println(no+"\t"+name+"\t"+phoneNumber+"\t");
		System.out.println("-------------빌린책--------------");
		for (Book book : books) {
			book.print();
		}
	}
	
	
}