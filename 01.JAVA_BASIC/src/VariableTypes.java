
public class VariableTypes {
	public static void main(String[] args) {
		/*
		 논리형(1byte)
		  - 논리형 변수
		  - 논리형 리터럴(값,데이터): true,false
		*/
		boolean bool1;
		boolean bool2;
		boolean bool3;
		boolean bool4;
		bool1 = true;
		bool2 = false;
		bool3 = true;
		bool4 = bool3;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(bool3);
		System.out.println(bool4);
		/*
		 * 문자형(한개문자)(2byte)
		 *  - 문자형변수
		 *  - 문자형 리터럴 : 'A','힣','a','1'
		 */
		char munja1,munja2,munja3,munja4,munja5,munja6;
		munja1 = 'A';
		munja2 = 'B';
		munja3 = '김';
		munja4 = '경';
		munja5 = '1';
		munja6 = munja3;
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		/*
		 * 숫자형
		 *  1. 정수형변수(byte,short,int,long)
		 *     - 정수형리터럴 : 1,2,4,56,-9000,2341123 등등 (int)
		 *  2. 실수형변수(float,double)
		 *     - 실수형리터럴 : 0.1,.1,3.141592,10000.0
		 */
		
		byte b1 = 3;
		byte b2 = -128;
		byte b3 = 127; // 정수형 리터럴의 경우 범위를 넘지않는다면 앞의 bit를 잘라서 넣어줌 but 범위를 넘어서면 오류남
		byte b4 = 0b1111111; // 2진으로 리터럴 대입
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
 
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 767;
		short s4 = 0b111111111111111;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		
		int i1,i2,i3,i4,i5,i6;
		i1 = 90;
		i2 = 90;
		i3 = -2147483648;
		i4 = 2147483647;
		i5 = 0b1111111111111111111111111111111;
		i6 = i1;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
		long l1 = 232; // 4byte 타입의 integer가 들어가도 리터럴의 짤림이 발생하지 않고 같은 타입이므로 들어감
		long l2 = 214748364800L; // 2147483648처럼 4byte가 넘는 리터럴은 불가능 integer의 범위를 벗어나기때문, 그러므로 L을 붙여 long 타입으로 대입해야함
		System.out.println(l1);
		System.out.println(l2);
		
		
		float f1,f2,f3;
		f1 = 0.1F;
		f2 = 3.14F;
		f3 = 10000.0F;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		
		double d1,d2,d3;
		d1 = 3.141592;
		d2 = 12345678912345678912345678.0; // 정밀함을 표현 바이트를 넘어가면 짤림 => 넘어갈수록 정밀도가 떨어짐
		d3 = 1.2345678912345678912345678;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("-------------문자열형----------------");
		String str1 = "오늘은";
		String str2 = "수요일";
		String str3 = "변수를 공부합니다."; // 메모리가 허락하는 한까지 저장가능
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3); // println -> ln 제어문자 라인을 내려줌
		System.out.print(str1);
		System.out.print(str2);
		System.out.println(str3);

		/*
		 * 문자열접합연산자( + )
		 */
		String str4 = str1+str2+str3;
		System.out.println(str4);
		String str5 = str1+" "+str2+" "+str3;
		System.out.println(str5);
		
		String name="이원호";
		int age = 33;
		char gender = 'M';
		double height = 182.3;
		double weight = 72.5;
		
		String myInfo = name+" "+age+" "+gender+" "+height+" "+weight;
		System.out.println(myInfo);
		
	}

}
