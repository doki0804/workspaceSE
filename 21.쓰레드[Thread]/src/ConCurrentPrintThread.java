
public class ConCurrentPrintThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<10 ; i++) {
			try {
				System.out.println("띵!");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
