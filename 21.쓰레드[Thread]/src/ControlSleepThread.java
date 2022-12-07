import java.util.Date;

public class ControlSleepThread extends Thread{

	@Override
	public void run() {
		
		while(true) {
			try {
				System.out.println("ControlSleepThread --> 1초마다 1번씩 시간출력");
				Date now = new Date();
				System.out.println(now.toString());
				
				/*
				 * 현재실행되고 있는 쓰레드를 1000ms동안 실행중지
				 */
				Thread.sleep(1000);
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
