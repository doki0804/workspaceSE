
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.outer_member_field = 909090;
		oc.outer_member_method();
		oc.outer_inner_class_use();
		/*
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		System.out.println(ic);
		*/
	}
}
