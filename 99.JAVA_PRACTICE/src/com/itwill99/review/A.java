package com.itwill99.review;

/*
1.A 라는 이름의 클래스작성
	1-1. A 클래스안에 멤버변수 2개선언(정의) 
        

2.AMain 이라는 이름의 클래스작성
	2-1.AMain 클래스에 메인메쏘드 작성(생성)
		2-1-1.메인메쏘드에 코드작성
                      - A객체생성
		      - A객체멤버변수에 값대입
                      - A객체멤버변수의 값출력

3.객체그래프를 그리고 주실행흐름을 표시하세요
*/
public class A {
	int i;
	boolean b;

	public A() {
	}

	public A(int i, boolean b) {
		this.i = i;
		this.b = b;
		System.out.println(i+", "+b);
	}
}
