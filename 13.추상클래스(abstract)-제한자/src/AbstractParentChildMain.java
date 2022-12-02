
public class AbstractParentChildMain {

	public static void main(String[] args) {
		/*
		 * //<<Cannot instantiate the type AbstractClassParent>> AbstractClassParent acp
		 * = new AbstractClassParent();
		 */	
		AbstractClassChild acc1 = new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		AbstractClassParent acc2 = new AbstractClassChild();
		acc2.method1();
		acc2.method2();
		
	}

}
