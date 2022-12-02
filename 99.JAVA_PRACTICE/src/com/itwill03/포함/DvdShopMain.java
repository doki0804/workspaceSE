package com.itwill03.포함;


public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember member1 = new DvdMember(1, "정우성", "010-1111-1111");
		DvdMember member2 = new DvdMember(2, "유해진", "010-2222-2222");
		DvdMember member3 = new DvdMember(3, "황정민", "010-3333-3333");
		/*
		 * Dvd객체생성
		 */
		Dvd dvd1 = new Dvd(1, "헌트", "액션");
		Dvd dvd2 = new Dvd(2, "타짜", "드라마");
		Dvd dvd3 = new Dvd(3, "신세계", "느와르");
		Dvd dvd4 = new Dvd(4, "광해", "시대물");
		Dvd dvd5 = new Dvd(5, "탑건", "전쟁");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		member1.setRentDvd(dvd1);
		member2.setRentDvd(dvd5);
		member3.setRentDvd(dvd3);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		DvdMember.header();
		member1.print();
		member2.print();
		member3.print();
		
	}

}