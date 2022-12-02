
public class OverLoadingMain {

	public static void main(String[] args) {
		OverLoading test = new OverLoading();
		
		test.method();
		test.method(0);
		test.method(0, null);
		test.method(0, 0, 0);

	}

}
