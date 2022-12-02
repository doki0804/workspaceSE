package com.itwill03.포함.배열포함;

public class BookLibraryMain {
	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember1 = new BookMember(1, "KIM", "010-1111-1111");
		/*
		 * 책객체들생성
		 */
		Book book1=new Book(46372, "책제목1", "문학", "좋은책1");
		Book book2=new Book(46372, "책제목2", "문학", "좋은책2");
		
		Book[] rent1 = {book1, book2};
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		bookMember1.setBooks(rent1);
		bookMember1.print();
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		
		
	}
}