package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 * 
	 * <<기능>>
	 *   책정보출력
	 *   
	 */
	private int bookNo;
	private String title;
	private String classification;
	private String bookDescription;
	
	public Book() {
	}

	public Book(int bookNo, String bookName, String classification, String bookDescription) {
		super();
		this.bookNo = bookNo;
		this.title = bookName;
		this.classification = classification;
		this.bookDescription = bookDescription;
	}
	
	public void print() {
		System.out.println("-----------------------------------------------");
		System.out.println("책번호      제목         분류         설명");
		System.out.println("-----------------------------------------------");
		System.out.printf("%6d %10s %8s %16s\n",bookNo,title,classification,bookDescription);
	}
	
	public void rentBookPrint() {
		System.out.printf("%10d %10s %8s | %12s\n",bookNo,title,classification,bookDescription);
	}
	
}