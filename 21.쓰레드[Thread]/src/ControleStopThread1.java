
public class ControleStopThread1 extends Thread{

	@Override
	public void run() {
		try {
			for(int i=1; i<=100;i++) {
				System.out.println("downloading...["+i+"%]");
				Thread.sleep(10);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("ControlStopThread1:thread가 jvm return thread end");
		return;
	}
}
