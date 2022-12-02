
public class DuoMemberInfoPrint {
	public static void main(String[] args) {
		int number,numberOfMarriages;
		String name,securityServiceNumber,appearance;
		char gender,grade;
		boolean smokingStatus;
		double height;
		
		number = 236514;
		numberOfMarriages = 0;
		name = "홍길동";
		securityServiceNumber = "201212-3495039";
		gender = 'M';
		grade = 'A';
		appearance = "상(중)";
		smokingStatus = true;
		height = 178.3;
		
		System.out.println("**************************");
		System.out.println("회원번호 : "+number);
		System.out.println("이    름 : "+name);
		System.out.println("주민번호 : "+securityServiceNumber);
		System.out.println("성    별 : "+gender);
		System.out.println("결혼횟수 : "+numberOfMarriages);
		System.out.println("흡연여부 : "+smokingStatus);
		System.out.println("키       : "+height);
		System.out.println("학    점 : "+grade);
		System.out.println("용    모 : "+appearance);
		System.out.println("***************************");

	}

}
