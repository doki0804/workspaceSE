
public class MainThreadCalled {

	public void main_thread_called_method() {
		System.out.println("\tA."+Thread.currentThread().getName()+"쓰레드실행");
		System.out.println("\tB."+Thread.currentThread().getName()+"쓰레드반환");
		return;
	}
	
	
}
