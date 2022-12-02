
public class GajunGumsa {
	private GajunOnOff[] gajuns;
	public GajunGumsa() {
	}
	public GajunGumsa(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}

	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
	public void gumsa() {
		for (GajunOnOff gumsa : gajuns) {
			System.out.println("--------검사시작--------");
			gumsa.on();
			GajunVolume volume = (GajunVolume) gumsa;
			volume.volumeUp();
			volume.volumeDown();
			gumsa.off();
			System.out.println("--------검사끝---------");
		}
	}
}
