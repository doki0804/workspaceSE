
public class SynchronizeUpperThread extends Thread{
	private SynchronizeUpperLowerPintSharedObject sharedObject;
	public SynchronizeUpperThread(SynchronizeUpperLowerPintSharedObject sharedObject) {
		this.sharedObject = sharedObject;
	}
	
	@Override
	public void run() {
		sharedObject.printUpper();
		
	}
}
