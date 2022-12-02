package com.itwill99.review;

/*
1.B 라는 이름의 클래스작성
	 1-1. B 클래스안에 멤버변수 2개선언(정의): 이름 x,y 
	 1-2. B 클래스안에 멤버메쏘드 m1,m2 2개선언(정의)
   	- 멤버메쏘드내용은 
       	System.out.println("m1호출");	 
       	System.out.println("m2호출");	
	
2.BMain 이라는 이름의 클래스작성
2-1.BMain 클래스에 메인메쏘드 작성(생성)
	2-1-1.메인메쏘드에 코드작성
         		- B객체생성
	      	- B객체멤버변수2개(x,y)에 값대입
         		- B객체멤버변수2개의 값출력
	      	- B객체멤버메쏘드2개호출(m1,m2)	


3.객체그래프를 그리고 주실행흐름을 표시하세요
*/
public class B {
	int x;
	int y;

	public void method1() {
		System.out.println("m2호출");
	}

	public void method2() {
		System.out.println("m1호출");
	}
	
}
