
public class ControlSleepThreadMain {

	public static void main(String[] args) {
		System.out.println("1.main");
		ControlSleepThread cst = new ControlSleepThread();
		cst.start();
		System.out.println("9.main return");
		
		
	}
}
