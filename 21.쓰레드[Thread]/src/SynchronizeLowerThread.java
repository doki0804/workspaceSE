
public class SynchronizeLowerThread extends Thread{
	private SynchronizeUpperLowerPintSharedObject sharedObject;
	public SynchronizeLowerThread(SynchronizeUpperLowerPintSharedObject sharedObject) {
		this.sharedObject = sharedObject;
	}
	
	@Override
	public void run() {
		sharedObject.printLower();
		
	}
}
