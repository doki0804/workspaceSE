package com.itwill03.포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		/*
		 * 책객체생성
		 */
		BookMember member1 = new BookMember(1, "이황", "010-1111-1111");
		BookMember member2 = new BookMember(2, "이이", "010-2222-2222");
		BookMember member3 = new BookMember(3, "정약용", "010-3333-3333");
		
		
		Book book1 = new Book(1111, "성학십도", "상소문", "조선시대 군왕의 도리");
		Book book2 = new Book(2222, "동호문답", "문답서", "조선시대 유교책");
		Book book3 = new Book(3333, "목민심서", "실학서", "조선시대 관리의 마음가짐");
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		member1.setRentBook(book1);
		member2.setRentBook(book2);
		member3.setRentBook(book3);
		
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		BookMember.header();
		member1.print();
		member2.print();
		member3.print();
		
		
	}
}