
public class VariableCharType {

	public static void main(String[] args) {
		char munja1, munja2, munja3, munja4, munja5, munja6, munja7, munja8;
		munja1 = 'A';
		/*
		 * 'A' ==> 00000000|01000001 https://charset.org/utf-8
		 * 
		 */
		munja2 = 65;
		/*
		 * '65' ==> 00000000|00000000|00000000|01000001
		 */
		munja3 = '가';
		munja4 = 44032;
		munja5 = '힣';
		munja6 = 55203;
		munja7 = '7';
		munja8 = 55;
				
		System.out.println(munja1);
		System.out.println(munja2);
		System.out.println(munja3);
		System.out.println(munja4);
		System.out.println(munja5);
		System.out.println(munja6);
		System.out.println("한글글자수 : "+(munja5-munja3+1));
		System.out.println(munja7);
		System.out.println(munja8);

	}

}
