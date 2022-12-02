package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 * << Object >>
		 * Object 클래스는 클래스 계층 루트입니다.
		 * 모든 클래스는 슈퍼 클래스로서 Object를 가집니다.
		 * 배열을 포함한 모든 객체는 이 클래스의 메서드를 구현합니다.
		 */
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		/*
		 * << Object >>
		 * public String  toString();
		 * 객체의 캐릭터 라인 표현을 리턴합니다.
		 */
		
		System.out.println(o1.toString());
		System.out.println(o2);
		
		/*
		 * public boolean equals(Object  obj)
		 *  이 객체와 다른 객체가 동일한지 어떤지를 나타냅니다.(주소가 동일한지 비교)
		 *  return : obj 인수로 지정된 객체와 이 객체가 동일한 경우는 true, 그렇지 않은 경우는 false
		 *  pram : 비교 대상의 참조 객체
		 */
		if(o1.equals(o2)) {
			System.out.println("o1과o2의 주소가 같다");
		}else {
			System.out.println("o1과02의 주소가 같지않다");
		}
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = oc1;
		System.out.println("---상속받은 Object.equels---");
		if(oc1.equals(oc3)) {
			System.out.println("oc1과 oc3의 주소가 동일하다.");
		}
		System.out.println("---상송받은 toString 재정의---");
		System.out.println(oc1.toString());
		System.out.println(oc2);
		System.out.println(oc3);
		
		
	}

}
