	/*
		 값(데이타)
			- 문자  : 김 , A , z
			- 문자열: "김경호", "JAMES" , "Student"
			- 숫자  : 1, 2 , 3 , 3.14159
		 */
		/*
		변수의선언
           	   - 의미:JVM 에게메모리를할당해달라고 요청하는작업
		   - 형태:
		        데이타타입 이름(식별자);
		         ex> int number;


		   - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$ 는 사용가능)
			   - 키워드 사용금지
		*/

public class VariableDeclare {
	public static void main(String[] args) {
		int score1; // 변수선언
		score1=99; // 변수에 값 (정수형리터럴)
		System.out.println(score1); // 변수값 출력
		score1=89;// 변수에 값 대입
		System.out.println(score1); // 변수값 출력
		
		int score2 = 90; // 두번째 변수선언
		System.out.println(score2); // 변수값 출력
		score2=100; // 변수에 값 대입
		System.out.println(score2);
		
		int _number=333; 
		int $number=444;
		int 숫자=555; // 변수 3가지 선언 및 리터럴 대입
		System.out.println(_number);
		System.out.println($number);
		System.out.println(숫자); // 출력
		
		int kor,eng,math;
		kor=90;
		eng=89;
		math=99;
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		/*
		int kor=99; (Duplicate local variable) 변수가 두번쓰임
		history=100; (cannot be resolved to a variable) 변수가 선언이 안됨
		
		int 7up;
		int my-score;
		int your#score; 식별자 룰 준수 X
		 */
		
		String name;
		name="이원호";
		System.out.println(name);
		
		int score = kor+eng+math;
		System.out.println(score);
	}

}
