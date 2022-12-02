package com.itwill99.review;

public class BMain {

	public static void main(String[] args) {
		B b = new B();
		
		b.x = 100;
		b.y = 200;
		int x = b.x;
		int y = b.y;
		System.out.println("b객체 x,y : "+x+","+y);
		b.method1();
		b.method2();

	}

}
