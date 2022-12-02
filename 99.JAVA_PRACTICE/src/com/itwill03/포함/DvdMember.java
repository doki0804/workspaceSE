package com.itwill03.포함;


public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int no;
	private String name;
	private String phoneNum;
	private Dvd rentDvd;//빌린dvd
	/*
	<<기능>>
	  회원정보출력 
	 */
	public DvdMember() {
	}
	
	public DvdMember(int no, String name, String phoneNum) {
		this.no = no;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public void print() {
		System.out.printf("%4d %8s %16s",no,name,phoneNum);
		rentDvd.rentPrint();
	}

	public Dvd getRentDvd() {
		return rentDvd;
	}

	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	public static void header() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("회원번호   이름      전화번호      DVD번호      제목       장르");
		System.out.println("-------------------------------------------------------------------");
	}
	
}