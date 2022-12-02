package com.itwill03.포함;


public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;
	private String name;
	private String phoneNum;
	private Book rentBook;
	/*
	<<기능>>
	  회원정보출력 
	 */
	public BookMember() {
	}
	public BookMember(int no, String name, String phoneNum) {
		super();
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public void print() {
		System.out.printf("%4d %8s %16s",no,name,phoneNum);
		rentBook.rentBookPrint();
	}
	
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
	public static void header() {
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("회원번호   이름       전화번호      빌린책번호      제목         분류         설명");
		System.out.println("----------------------------------------------------------------------------------");
	}

}