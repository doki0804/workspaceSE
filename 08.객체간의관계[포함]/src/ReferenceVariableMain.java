
public class ReferenceVariableMain {

	public static void main(String[] args) {
		System.out.println("------기본형변수------");
		int score1=90;
		int score2=80;
		System.out.println("score1="+score1);
		System.out.println("score2="+score2);
		int tempScore = score2;
		score2=score1;
		score1=tempScore;
		System.out.println("score1="+score1);
		System.out.println("score2="+score2);
		System.out.println("------참조형변수------");
		DuoMember memberOne = new DuoMember(1,"일번님");
		DuoMember memberTwo = new DuoMember(2,"이번님");
		DuoMember memberThree = memberOne;
		System.out.println("------참조형변수 비교------");
		if(memberOne==memberThree) {
			System.out.println("주소값이 동일하다 "+memberOne+" ==" +memberThree);
		}
		if(memberOne != memberTwo) {
			System.out.println("주소값이 다르다 "+memberOne+" ==" +memberTwo);
		}
		System.out.println("----------참조변수주소 swap----------");
		DuoMember m1 = new DuoMember(1000,"김경수");
		DuoMember m2 = new DuoMember(2000, "신명숙");
		m1.print();
		m2.print();
		DuoMember tempMember = m1;
		m1 = m2;
		m2 = tempMember;
		m1.print();	
		m2.print();
		
		System.out.println("-------- 기본형변수 초기화 기본값 --------");
		int tot=0;
		double avg = 0.0;
		char c = '\u0000';
		boolean isMarried=false;
		System.out.println("-------- 참조형변수 초기화 기본값 --------");
		DuoMember m3 = null;
		/*
		 * null:객체주소 리터럴값
		 *  - 객체주소값 초기화의 용도로 사용
		 *  - null주소 사용시 NullPointerException이 발생
		 */
		if(m3==null) {
			m3=new DuoMember(3, "삼식이");
			m3.print();
		}else {
			m3.print();
		}
		
		
		
	}

}
