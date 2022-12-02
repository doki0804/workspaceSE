/*
 객체의 형변환
   1. 부모자식관계에있는 클래스 들에서만 가능하다.
      ex> 자식타입객체의주소를 부모타입객체의 주소로 형변환(주소변경절대안됨,타입만변경)
      ex> 부모타입객체의주소를 자식타입객체의 주소로 형변환(주소변경절대안됨,타입만변경)
        
   2. 자식객체타입의주소를 부모클래스타입으로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent p = c; 
       Parent p = new Child();
       
   3. 부모 객체를 자식클래스타입으로 형변환
   	   - 자동으로 이루어지지않는다.(명시적)
       - 원칙적으로는 불가능하다.
       - 부모의 탈을쓴 자식객체는 가능하다.
       Parent p=new Parent();
       Child c = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */

class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
	public void method4() {
		System.out.println("Parent.method4()");
	}
}

class Child extends Parent{
	@Override
	public void method4() {
		System.out.println("Child.method4()-->Parent.method4()를 재정의[Overriding]");
	}
	public void method5() {
		System.out.println("Child.method5()");
	}
}


public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("------------------<<Child>>------------------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		c1.method4();
		c1.method5();
		/*
		 	2. 자식객체타입의주소를 부모클래스타입으로 형변환
       		- 자동으로 이루어진다(묵시적)
		 */
		System.out.println("---------------<<Child -->Parent>>---------------");
		Parent p1 = c1; 
		if(p1==c1) {
			System.out.println(p1+"=="+c1+"p1과 c1의 주소가동일");
		}
		p1.method1();
		p1.method2();
		p1.method3();
		p1.method4();
		//p1.method5();
		
		/*
		 3. 부모 객체를 자식클래스타입으로 형변환
   	   		- 자동으로 이루어지지않는다.(명시적)
       		- 원칙적으로는 불가능하다.
       		- 부모의 탈을쓴 자식객체는 가능하다.
		 */
		Parent p2 = new Parent() ;
		/* 
		 * 1. compile시
		 *  <<Type mismatch: cannot convert from Parent to Child>>
		 * 2. runtime시
		 *  <<java.lang.ClassCastException: Parent cannot be cast to Child>>
		 *	Child c2 =(Child)p2;
		 */
		System.out.println("----------------<<Parent-->Child>>----------------");
		/*
		 * - 부모의탈을 쓴 자식객체는 가능하다
		 */
		Parent p3 = new Child();
		System.out.println("--Child객체를 Parent타입변수로 호출--");
		p3.method1();
		p3.method2();
		p3.method3();
		p3.method4();
		//p3.method5();
		Child c3 = (Child)p3;
		System.out.println("--Child객체를 Child타입변수로 호출--");
		c3.method1();
		c3.method2();
		c3.method3();
		c3.method4();
		c3.method5();
		
		
	}

}
 