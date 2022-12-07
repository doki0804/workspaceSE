
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		SynchronizeUpperLowerPintSharedObject so = new SynchronizeUpperLowerPintSharedObject();
		SynchronizeUpperThread sut = new SynchronizeUpperThread(so);
		SynchronizeLowerThread slt = new SynchronizeLowerThread(so);
		
		sut.start();
		slt.start();
		
	}
}
