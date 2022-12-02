 
public class MemberFieldMain {

	public static void main(String[] args) {
		System.out.println("---main start---");
		/*
		 * MemberField 사용자정의타입 객체의 주소값을 저장할 변수 선언(참조변수)
		 */
		MemberField mf1;
		/*
		 * MemberField클래스(틀)로 객체생성한 후 객체의 참조변수mf1에 생성된 객체의 주소값이 대입(#100)
		 */
		mf1 = new MemberField();
		
		
		/*
		 * mf1(#100)주소에있는 객체의 int타입의 멤버변수 member1에 77값을 대입
		 * mf1(#100)주소에있는 객체의 double타입의 멤버변수 member2에 .315459값을 대입
		 * mf1(#100)주소에있는 객체의 char타입의 멤버변수 member3에 'B'값을 대입
		 * mf1(#100)주소에있는 객체의 String타입의 멤버변수 member1에 "거북이"값을 대입
		 * 
		 * - 객체의 참조(주소)변수가 가지고 있는 객체의 주소값 #100를 사용해 멤버필드에 데이타대입
		 * - 객체의 멤버필드 접근방법
		 *   - 참조(주소)변수.멤버필드이름 = 값;
		 *   - mf1.member1=77;
		 */
		mf1.member1 = 77;
		mf1.member2 = 3.14159;
		mf1.member3 = 'B';
		mf1.member4 = "거북이";
		
		/*
		 * mf1객체의 멤버변수 member1,2,3,4의 값을 출력
		 * 
		 *  mf1(#100)주소에 있는 멤버변수의 값을 출력
		 *  - 객체의 참조(주소)가 가지고있는 객체의 주소값 #100을 사용해서 멤버필드의 값출력
		 *    1. system.out.println(mf1.member1);
		 *    
		 *    2. int tempMember1 = mf.member1;
		 *    	 system.out.println(tempMember);
		 * 
		 */
		System.out.println("mf1의주소값:"+mf1);
		System.out.printf("%d %f %c %s\n",mf1.member1,mf1.member2,mf1.member3,mf1.member4);
		
		MemberField mf2 = new MemberField(); // 멤버필드타입의 객체 주소값을 저장하는 변수 mf2
		
		mf2.member1 = 87;
		mf2.member2 = 1.22564;
		mf2.member3 = 'A';
		mf2.member4 = "토끼";
		System.out.printf("%d %f %c %s\n",mf2.member1,mf2.member2,mf2.member3,mf2.member4);
		
		System.out.println("---main end---");
		
	}

}