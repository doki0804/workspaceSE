
public class InterfaceABImpl implements InterfaceA,InterfaceB{

	@Override
	public void method1() {
		System.out.println("InterfaceA.method1()");
	}
	@Override
	public void method2() {
		System.out.println("InterfaceA.method2()");
	}
	@Override
	public void method3() {
		System.out.println("InterfaceB.method3()");
	}
	@Override
	public void method4() {
		System.out.println("InterfaceB.method4()");
	}
	
}
