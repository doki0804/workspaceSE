
public class MemberMethodReturn {
	/*
	 * 멤버필드
	 *  - 멤버필드선언시 값을 대입할 수 있다.
	 */
	int memberField1=10;
	int memberField2=20;
	int memberField3=30;
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}
	
	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}
	
	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}
	
	/*
	 * getter method
	 */
	int getMemberField1() {
		return memberField1;
	}

	int getMemberField2() {
		return memberField2;
	}

	int getMemberField3() {
		return memberField3;
	}


	/*
	 * 멤버메쏘드
	 */
	int method1() {
		System.out.println("\t---int method1()실행---");
		int result = 134+2222;
		System.out.println("\t---int method1()종료후 int 데이타반환---");
		/*
		 return <<호출한 클래스(객체)에게 반환할값(변수,리터럴,연산의 결과)>>;
		   - 호출한곳으로 실행흐름 반환
		   - 호출한곳으로 데이타도 반환
		   - 반환할 데이타가 없는경우에는(void) return문생략이 가능
		   - 반환할 데이타가 있는경우에는(int,객체주소,...) return문 반드시 필요
		*/
		return result;
	} 
	
	boolean method2() {
		System.out.println("\t--boolean method2()실행--");
		boolean isMarried = false;
		System.out.println("\t--boolean method2()실행종료후 boolean 데이타반환--");
		return isMarried;
	}
	/*
	 * 두개의 정수를 파라메타로 받아서 더한결과(정수)를 반환하는 메쏘드
	 */
	int add(int a, int b) {
		System.out.println("\t---int add(int a,int b)---실행");
		int result = a + b;
		System.out.println("\t---int add(int a,int b)---종료후 int 데이타반환");
		return result;
	}
	
	String hello(String name) {
		String msg = null;
		msg = name+"님 안녕하세요";
		return msg;
	}
	
	
}
