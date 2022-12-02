
public class GajunAudio implements GajunOnOff,GajunVolume {

	public void operation1() {
		
	}
	
	public void operation2() {
		
	}

	@Override
	public void volumeUp() {
		System.out.println("Audio.volumeUp()");
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio.volumeDown();");
	}

	@Override
	public void on() {
		System.out.println("Audio.on()");
	}

	@Override
	public void off() {
		System.out.println("AudioOff");
	}
	
	
}
