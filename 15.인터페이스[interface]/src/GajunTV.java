
public class GajunTV implements GajunVolume,GajunOnOff {
	public void operation1() {
		System.out.println("TV.operation1()");
	}
	public void operation2() {
		System.out.println("TV.operation1()");
	}
	
	@Override
	public void on() {
		System.out.println("TV.ON()");
	}
	@Override
	public void off() {
		System.out.println("TV.OFF()");
	}
	@Override
	public void volumeUp() {
		System.out.println("TV.volumeUp");
	}
	@Override
	public void volumeDown() {
		System.out.println("TV.volumedown");
	}
	
	
}
