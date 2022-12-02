package com.itwill99.review;
/*
2.멤버메쏘드 선언    
 *        접근제한자 리턴타입 메쏘드이름(매개변수){
 *           -매개변수: 나를 호출한클래스(객체) 가 데이타를 넣어줄 통로
 *        	 -리턴타입: 나를 호출한클래스(객체) 에게 반환할 데이타타입 
 *               void --> 줄데이타가 없는경우
 *        }
 *        ex> public int test(int a){
 *        	  	
 *            }
 */
public class MemberMethod {

	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method1
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 없음 
	 *   - 구현내용  : System.out.println("public void method1()실행");
	 */
	public void method1() {
		System.out.println("public void method1()실행");
	}
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method2
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 없음 
	 *   - 구현내용  : System.out.println("public void method2()실행");   
	 */
	public void method2() {
		System.out.println("public void method2()실행");
		
	}
	
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method3
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 정수(1개) 
	 *   - 구현내용  : 인자로받은데이타 1개출력 
	 */
	public void method3(int i) {
		System.out.println(i);
	}
	
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method4
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 문자열,정수(2개) 
	 	 - 구현내용  : 인자로받은데이타 2개출력 
	 */
	public void method4(String s, int i) {
		System.out.printf("%s, %d\n",s,i);
	}
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method5
	 *   - 반환타입  : 없음
	 *   - 매개변수  : 문자열,문자열,정수(3개) 
	 *   - 구현내용  : 인자로받은데이타 3개출력 
	 */
	public void method5(String s1, String s2, int i) {
		System.out.printf("%s, %s, %d\n",s1,s2,i);
	}
	
}