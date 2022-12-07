
public class CreateCustomThread extends Thread{

	@Override
	public void run() {
		while(true) {
		System.out.println("가."+Thread.currentThread().getName()+" 쓰레드실행");
		System.out.println("나."+Thread.currentThread().getName()+" 쓰레드실행후 반환");
		}
	}
	
}
