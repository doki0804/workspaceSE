package com.itwill01.method;
/*
 * 4개의 멤버메쏘드를 가짐
 */
public class Calculator {
	
	/*
	 * - add( 두개의 정수를 매개변수로 받아서 더한 결과값을 반환)
	 * - sub( 두개의 정수를 매개변수로 받아서 뺀   결과값을 반환)
	 * - div( 두개의 정수를 매개변수로 받아서 나눈 결과값을 반환)
	 * - mul( 두개의 정수를 매개변수로 받아서 곱한 결과값을 반환)
	 */
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static double div(double a, double b) {
		return a/b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	
	
}