package com.itwill99.review;

public class MemberMethodReturn {

	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method1
	 *   - 반환타입  : int
	 *   - 매개변수  : 없음
	 *   - 구현내용  : 정수데이타 반환 
	 */

	public int method1() {
		System.out.println("---public int method1()---");
		/*
		 return  <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의결과)>>
		  	- 호출한곳으로 실행 흐름(쓰레드) 반환
		  	- 호출한곳으로 데이타반환
		  	- 반환할 데이타가없는 경우에는(void) return문 생략가능하다. 
		  	- 반환할 데이타가있는 경우에는 		 return문 반드시기술하여야 한다. 
		*/
		
		return 56;
	}
	/*
	 * 메쏘드선언
	 *   - 메쏘드이름: method2
	 *   - 반환타입  : boolean
	 *   - 매개변수  : 없음
	 *   - 구현내용  : 논리형데이타 반환 
	 */
	public boolean method2() {
		return false;
	}
	/*
	* << 두개의 정수를 매개변수 받아서 더한후 결과값을 반환하는메쏘드 >>
	* 메쏘드선언
	*   - 메쏘드이름: add
	*   - 반환타입  : int
	*   - 매개변수  : 정수,정수(2개)
	*   - 구현내용  : 매개변수두개를 더한결과를 반환
	*/
	public int add (int i, int j) {
		int add = i+j;
		return add;
	}
	/*
	*  << 이름(문자열)을 매개변수로입력받아서 인사말을 만들어 문자열로반환>>
	 * 메쏘드선언
	 *   - 메쏘드이름: hello
	 *   - 반환타입  : String
	 *   - 매개변수  : 문자열(1개)
	 *   - 구현내용  : 매개변수문자열에 "님 안녕하세요" 를 붙여서 문자열을반환
	 */
	public String hello(String s) {
		String msg = s+"님 안녕하세요";
		return msg;
	}

}