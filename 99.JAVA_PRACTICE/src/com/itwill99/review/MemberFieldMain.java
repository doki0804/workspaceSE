package com.itwill99.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField memberField = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		memberField.i = 1000;
		memberField.c = 'A';
		memberField.s = "안녕하세요";
		memberField.d = 3.14159;
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		int i = memberField.i;
		char c = memberField.c;
		String s = memberField.s;
		double d = memberField.d;
		
		System.out.printf("%d, %c, %s, %f\n",i,c,s,d);
	}

}