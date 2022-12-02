
public class StaticMain {

	public static void main(String[] args) {
		System.out.println("-----static member access-----");
		/*
		 * 정적멤버 접근
		 *  - 클래스이름.정적멤버이름
		 */		
		System.out.println(Static.static_field);
		Static.static_field=10;
		System.out.println(Static.static_field);
		Static.static_method();
		
		System.out.println("-----instance member access-----");
		Static static1 = new Static();
		System.out.println("Static1객체의 주소값 : "+static1);
		static1.instance_field = 1111;
		static1.instance_method();
		System.out.println("static1.instance_field : "+static1.instance_field);
		
		Static static2 = new Static();
		System.out.println("Static1객체의 주소값 : "+static2);
		static2.instance_field = 2222;
		static2.instance_method();
		System.out.println(static2.instance_field);
		System.out.println("static2.instance_field : "+static2.instance_field);
		/**
		System.out.println("--객체주소를 통해서 static member access--");
		System.out.println(static1.static_field);
		static1.static_method(); // 객체 주소를 통해서 static 접근도 가능하긴함
		*/
		System.out.println("--올바른 static member access--");
		Static.static_field=9999;
		System.out.println(Static.static_field);
		Static.static_method();
	}

}
