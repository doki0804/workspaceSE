
public class CreateCustomThreadMain {

	public static void main(String[] args) {
		
		System.out.println("1.main thread start");
		CreateCustomThread cct = new CreateCustomThread();
		cct.setName("사용자정의쓰레드");
		System.out.println("2.main thread CreateCustomThread객체.start() 메쏘드 호출전");
		cct.start();
		System.out.println("3.main thread CreateCustomThread객체.start() 메쏘드 호출후");
		while(true) {
		System.out.println("4.main thread");
		}
	}
}
