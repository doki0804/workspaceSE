import java.awt.Toolkit;

public class ConCurrentBeepThread extends Thread{

	@Override
	public void run() {
			Toolkit toolKit = Toolkit.getDefaultToolkit();
			for(int i=0;i<10;i++) {
				try {
					toolKit.beep();
					System.out.println("Beep!!");
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
			}
		}
	}
}
