package wrapper;
/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WrapperClassMain {
	
	public static void main(String[] args) {
		System.out.println("--------------Boxing,UnBoxing--------------");
		/*
		 * Boxing[기본형 --> Wrapper객체]
		 */
		Character wc = new Character('김');
		Integer wi = new Integer(1231);
		Double wd = new Double(3.141592);
		Boolean wb = new Boolean(true);
		/*
		 * UnBoxing[Wrapper객체 --> 기본형]
		 */
		char c1 = wc.charValue();
		int i1 = wi.intValue();
		double d1 = wd.doubleValue();
		boolean b1 = wb.booleanValue();
		System.out.println("--------------AutoBoxing,AutoUnBoxing--------------");
		/*
		 * AutoBoxing[기본형 --> Wrapper객체]
		 */
		Character wc2 = '김';
		Integer wi2 = 1231;
		Double wd2 = 3.141592;
		Boolean wb2 = false;
		/*
		 * AutoUnBoxing[Wrapper객체 --> 기본형]
		 */
		char c2 = wc2;
		int i2 = wi2;
		double d2 = wd2;
		boolean b2 = wb2;
		
		System.out.println("****************AUTO BOXING****************");
		int a = 89;
		int b = 45;
		int c = 78;
		int d = 90;
		int e = 99;
		
		Integer ia = a;
		Integer ib = b;
		Integer ic = c;
		Integer id = d;
		Integer ie = e;
		
		System.out.println("****************자동형변환****************");
		Object oa = ia;
		Object ob = ib;
		Object oc = ic;
		Object od = id;
		Object oe = ie;
		
		System.out.println("****************AUTO BOXING,자동형변환****************");
		
		Object ooa=89;
		Object oob=45;
		Object ooc=78;
		Object ood=90;
		Object ooe=99;
		System.out.println("****************Object[]****************");
		
		Object[] scoreArray = new Object[5];
		scoreArray[0] = 89;
		scoreArray[1] = 45;
		scoreArray[2] = 78;
		scoreArray[3] = 90;
		scoreArray[4] = 99;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempScore = (Integer)scoreArray[i];
			int score = tempScore;
			*/
			int score = (Integer)scoreArray[i];
			System.out.print(score+" ");
		} 
			
		for (Object sa : scoreArray) {
			/*
			Integer tempScore = (Integer)sa;
			int score = tempScore;
			*/
			int score = (Integer)sa;
			System.out.print(score+" ");
		}
		
		/**********************************************/
		System.out.println();
		Integer wi11 = new Integer(123);
		Integer wi22 = new Integer(123);
		
		System.out.println(wi11==wi22);
		System.out.println(wi11.equals(wi22));
		System.out.println(wi11 > wi22);
		System.out.println(wi11 < wi22);
		System.out.println(wi11 <= wi22);
		System.out.println(wi11 == 123);
		System.out.println(wi11 + wi22);
		// Wrapper객체끼리의 비교, 연산은 하지않는게 좋다. 언박싱후 해야함
		
		
		
		
		
		
		
	}
}
