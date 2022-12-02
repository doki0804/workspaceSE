
public class OperatorArithmatic {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int result = 0;

		result = a + b;
		System.out.println("a+b-->" + result);
		result = a - b;
		System.out.println("a-b-->" + result);
		result = a * b;
		System.out.println("a*b-->" + result);
		result = a / b; // integer의 연산이므로 double값이 나올수가 없음
		System.out.println("a/b-->" + result);// integer 타입은 소수점데이터를 저장할수 없음으로 형변환을 해줘야함
		double dresult = (double)a/b;//하나의 변수만 double로 변경해주면 큰 바이트로 형변환되어 계산
		System.out.println("double dresult = a/b-->" + dresult); 
		

		/*
		 * 나머지연산자 - %
		 */
		result = a % b;
		System.out.println("a%b-->" + result);

		int year = 2022;
		result = year % 4;// 0~3
		System.out.println("2022%4-->" + result);
		result = year % 100;// 0~99
		System.out.println("2022%100-->" + result);
		result = year % 400;// 0~399
		System.out.println("2022%400-->" + result);

		int no = 16;
		result = no % 4;
		System.out.println("result변수의값이 0이면 4의배수 : " + result);

		/*
		 * 비트연산자 <<,>> int d = 1; ==>00000000|00000000|00000000|00000001 result = d <<
		 * 1; ==>00000000|00000000|00000000|00000010 result = d << 2;
		 * ==>00000000|00000000|00000000|00000100 result = d << 3;
		 * ==>00000000|00000000|00000000|00001000 result = d << 4;
		 * ==>00000000|00000000|00000000|00010000
		 */

		int d = 1;
		System.out.println(d);
		result = d << 1;
		System.out.println(result);
		result = d << 2;
		System.out.println(result);
		result = d << 3;
		System.out.println(result);
		result = d << 4;
		System.out.println(result);

		/*
		 * 
		 */
		d = 128;
		System.out.println(d);
		result = d >> 1;
		System.out.println(result);
		result = d >> 2;
		System.out.println(result);
		result = d >> 3;
		System.out.println(result);
		result = d >> 4;
		System.out.println(result);

		System.out.println("-------------문자연산-------------");
		char ca = 'A';
		char cz = 'Z';
		int numOfAlphabet = cz - ca + 1;
		System.out.println("알파벳 대문자수 : " + numOfAlphabet);
		char c = 'a';
		System.out.println(c);
		c = 'a'+1;
		System.out.println(c);
		c = 'a'+2;
		System.out.println(c);
		
		
		
		
		
		
		
		
		
		

	}
}
