
public class ControlPriorityMain {

	public static void main(String[] args) {
		/*
		 * priority(우선순위)
		 */
		ConCurrentBeepThread bt = new ConCurrentBeepThread();
		ConCurrentPrintThread pt = new ConCurrentPrintThread();
		System.out.println("ConCurrentBeepThread priority : "+bt.getPriority());
		System.out.println("ConCurrentPrintThread priority : "+pt.getPriority());
		bt.setPriority(10);
		pt.setPriority(1);
		bt.start();
		pt.start();
		
	}
}
