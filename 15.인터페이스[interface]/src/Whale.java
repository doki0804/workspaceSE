
public class Whale implements Mammaila{

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Whale whale = new Whale();
		whale.operation1();
		whale.operation2();
		whale.operation3();
		Mammaila mammaila=whale;
		mammaila.operation1();
		mammaila.operation2();
		mammaila.operation3();
		
	}
	
}
