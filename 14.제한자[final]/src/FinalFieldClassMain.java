
public class FinalFieldClassMain {

	public static void main(String[] args) {
		System.out.println("-----------ffc1-----------");
		FinalFieldClass ffc1= new FinalFieldClass();
		/*
		<< The final field FinalFieldClass.XXX cannot be assigned >>
		ffc1.PORT_NUMBER=99;
		ffc1.INCENTIVE_RATE=2.4;
		FinalFieldClass.PI=4.5;
		FinalFieldClass.EARTH_RADIUS=7800;
		Math.PI=2.3434;
		ffc1.product=new Product(2,"양파링");
		FinalFieldClass.product=new Product(2,"양파링");
		*/
		System.out.println(FinalFieldClass.product.toString());
		System.out.println(ffc1.PORT_NUMBER);
		System.out.println(ffc1.INCENTIVE_RATE);
		System.out.println(FinalFieldClass.PI);
		System.out.println(FinalFieldClass.EARTH_RADIUS);
		System.out.println(Math.PI);
		System.out.println("-----------ffc2-----------");
		FinalFieldClass ffc2 = new FinalFieldClass();
		System.out.println(ffc2.PORT_NUMBER);
		System.out.println(ffc2.INCENTIVE_RATE);
		
	}
}
