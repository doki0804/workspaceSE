
public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("----------Child1---------");
		Child1 child1 = new Child1();
		child1.member1=1;
		child1.member2=2;
		child1.member3=3;
		child1.member4=4;
		child1.method1();
		child1.method2();
		child1.method3();
		child1.method4();
		System.out.println(">> child1 주소:"+child1);
		
		System.out.println("------------Child2------------");
		Child2 child2 = new Child2();
		child2.member1=1;
		child2.member2=2;
		child2.member5=5;
		child2.member6=6;
		child2.method1();
		child2.method2();
		child2.method5();
		child2.method6();
		
		System.out.println("------------Parent-------------");
		Parent parent = new Parent();
		parent.member1=1111;
		parent.member2=2222;
		parent.method1();
		parent.method2();
		
	}

}
