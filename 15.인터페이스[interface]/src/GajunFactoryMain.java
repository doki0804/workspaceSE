
public class GajunFactoryMain {
	
	public static void main(String[] args) {
		System.out.println("---가전제품공장---");
		GajunTV tv1 = new GajunTV();
		GajunTV tv2 = new GajunTV();
		GajunTV tv3 = new GajunTV();
		
		GajunAudio audio1 = new GajunAudio();
		GajunAudio audio2 = new GajunAudio();
		
		GajunSmartPhone phone1 = new GajunSmartPhone();
		GajunSmartPhone phone2 = new GajunSmartPhone();
		
		System.out.println("----가전제품검사소----");
		/*
		 * 난 절대로 자식클래스타입을 사용안할래요
		 * 난 부모 타입[GajunVolume,GajunOnOff]만 사용할래요
		 * 그래야 가전제품검사 프로그램을 한번 만들어서 변경없이
		 * 계속사용할수 있으니까요
		 */
		GajunOnOff[] gajunArray = {tv1,tv2,tv3,audio1,audio2,phone1,phone2}; 
		/*
		   for
		 * (GajunOnOff gajunTest : gajunArray) {
		 * System.out.println("----------검사시작-----------"); gajunTest.on(); GajunVolume
		 * tempGajun=(GajunVolume)gajunTest; tempGajun.volumeUp();
		 * tempGajun.volumeDown(); gajunTest.off();
		 * System.out.println("----------검사끝출고-----------"); }
		 */
		GajunGumsa gajunGumsa = new GajunGumsa();
		gajunGumsa.setGajuns(gajunArray);
		gajunGumsa.gumsa();
			
	}
}
