
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stmt1");
		MemberMethod mm1 = new MemberMethod();
		/*
		 * 멤버메쏘드 실행(호출)
		 *   - 형식 : 참조변수.메쏘드식별자();
		 *   - main실행흐름을 mm1주소에 있는 객체의 
		 *     method1이라는 이름의 메쏘드(실행코드 블록)로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		System.out.println("***********매게변수가 있는 메쏘드호출************");
		System.out.println("main block end");
		mm1.method3(2);
		System.out.println("main stmt4");
		mm1.method3(4);
		System.out.println("main stmt5");
		mm1.method4("안녕하세요!!",3);
		System.out.println("main stmt6");
		mm1.method4("수업끝!!!!!!!!!!!!!!!!!!!!!",10);
		System.out.println("main stmt7");		
		mm1.method5("이원호","누구세요",3);
		System.out.println("main stmt8");
		mm1.method5("짱구","울라울라", 2);
		
		return;
	}

}
