package lang;

public class StringCompareMain {
	
	public static void main(String[] args) {
		/*
		 * String 객체의 생성
		 *  1. 생성자호출(명시적 생성)
		 *  2. ""로 생성 (암시적 생성)
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		
		System.out.println("--------------String 객체내용비교는 equals메쏘드를 사용하여야합니다-----------------");
		/*
		 << public boolean equals(String otherString)
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일하다.");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name3객체의 문자열이 동일하다.");
		}
		if(name3.equals(name4)) {
			System.out.println("name3객체의 문자열과 name4객체의 문자열이 동일하다.");
		}
		/*
		 * ""을 사용하는순간 String 객체가 생성됨 : "" == new String("")
		 */
		if(name1.equals("KIM")) { 
			System.out.println("name1객체의 문자열과 \"KIM\"객체의 문자열이 동일하다.");
		}
		if("KIM".equals("KIM")) {
			System.out.println("KIM".equals("KIM"));
		}
		
	}
	
}
