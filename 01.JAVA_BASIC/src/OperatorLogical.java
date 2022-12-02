/*
		논리연산자
		   - 형태:   ||(Logical OR , 논리 합) , && (Logical AND , 논리 곱) ( |,& )
		   - 좌우측의항이 논리형변수(데이타)이다.
           - 결과도 논리형변수(데이타)이다.
		    ex> true || false, false && false

*/
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1, b2, b3, b4;
		boolean result;
		b1 = true;
		b2 = true;
		b3 = false;
		b4 = false;

		/*
		 * 논리합(logical OR) || --> false || false 인경우에만 false를 반환
		 */
		result = b1 || b2;
		System.out.println("true || true --> " + result);
		result = b1 || b3;
		System.out.println("true || false --> " + result);
		result = b3 || b1;
		System.out.println("false || true --> " + result);
		result = b3 || b4;
		System.out.println("false || false --> " + result);

		/*
		 * 논리곱(logical AND) && --> true && true 인 경우에만 true를 반환
		 */
		result = b1 && b2;
		System.out.println("true && true --> " + result);
		result = b1 && b3;
		System.out.println("true && false --> " + result);
		result = b3 && b2;
		System.out.println("false && true --> " + result);
		result = b3 && b4;
		System.out.println("false && false --> " + result);

		int kor = 99;
		int eng = 67;

		/*
		 * kor 점수의 유효성체크[0~100사이의정수]
		 */
		boolean condition1 = kor >= 0;
		boolean condition2 = kor <= 100;

		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수의 유효여부 = " + isValidScore);
		boolean condition3 = eng >= 90;
		boolean condition4 = kor >= 90;
		System.out.println("---A대학 국어점수가 90점이상이거나 영어점수가 90점 이상이면 합격");
		boolean isPass1 = condition3 || condition4;
		System.out.println("A대학합격여부 : " + isPass1);
		System.out.println("---B대학 국어,영어점수가 90점 이상이면 합격");
		boolean isPass2 = condition3 && condition4;
		System.out.println("B대학합격여부 : " + isPass2);

		int math = 89;

		boolean isValidMathScore = (math >= 0) && (math <= 100);
		System.out.println("수학점수의 유효여부 = " + isValidMathScore);
		boolean isInvalidMathScore = math < 0 || math > 100;
		System.out.println("수학점수의 유효하지않은지여부 = " + isInvalidMathScore);
		System.out.println("------배수판별-------");

		int number = 12;

		boolean isMultiple3 = (number % 3) == 0;
		System.out.println("3의배수여부 : " + isMultiple3);
		boolean isMultiple4 = (number % 4) == 0;
		System.out.println("4의배수여부 : " + isMultiple4);
		boolean isMultiple34 = isMultiple3 && isMultiple4;
		System.out.println("3의배수이면서 4의배수인지(공배수) = " + isMultiple34);
		/*
		 * Quiz : 윤년여부판단 - 4의배수 이면서 100의 배수가 아니고 - 400의 배수
		 */
		System.out.println("------윤년판단------");
		int year = 2022;
		boolean isLeapYear = true;
		isMultiple4 = year % 4 == 0;
		boolean isMultiple100 = year % 100 != 0;
		System.out.println(isMultiple100);
		boolean isMultiple400 = year % 400 == 0;

		isLeapYear = (isMultiple4 && isMultiple100) || isMultiple400;
		System.out.println(year + "의 윤년여부 : " + isLeapYear);
		System.out.println("----------문자연산-----------");
		char c = '가';

		boolean isHangeul = (c >= '가') && (c <= '힣');
		System.out.println(c+"의 한글여부 : "+isHangeul);
		
		
	}

}
