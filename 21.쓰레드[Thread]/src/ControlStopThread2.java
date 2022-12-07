
public class ControlStopThread2 extends Thread{
	private boolean isPlay;
	public ControlStopThread2() {
		isPlay = true; 
	}
	
	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}

	@Override
	public void run() {
		while(isPlay) {
			try {
				System.out.println("----------");
				System.out.println("1.game move");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("2.game fight");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("3.game get score");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("4.game power up");
				Thread.sleep((int)(Math.random()*1000)+1);
				System.out.println("5.game score update");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return;
	}//end run
	
		
}//end class
