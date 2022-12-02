
public class PrintOverLoadingMain {

	public static void main(String[] args) {
		Print test = new Print();
		
		test.print(1);
		test.print(1,2);
		test.print(1,2,3);
		
		test.print(false);
		test.print(213);
		test.print(3.1);
		test.print("식사하시죠");
		test.print(121345);
		

	}

}
