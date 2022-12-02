
public class FinalMethodClassChild extends FinalMethodClass{

	@Override
	public void method1() {
		System.out.println("FinalMethodClassChild에서"
				+ " FinalMethodClass.method1()재정의");
	}
	/*
	 * << Cannot override the final method from FinalMethodClass >>
	 * public void method2() {
	 *	
	 * }
	 */
}
