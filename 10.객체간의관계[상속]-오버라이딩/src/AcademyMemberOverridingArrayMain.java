
public class AcademyMemberOverridingArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "KIM", "JAVA");
		students[1] = new AcademyStudent(2, "LIM", "ANDROID");
		students[2] = new AcademyStudent(3, "SIM", "IOS");
		
		gangsas[0] = new AcademyGangsa(4, "김강사", "웹디자인");
		gangsas[1] = new AcademyGangsa(5, "전강사", "오피스");
		
		staffs[0] = new AcademyStaff(6, "천상용", "홍보부");
		staffs[1] = new AcademyStaff(7, "조은주", "총무부");
		
		System.out.println("------------AcademyMember전체출력-------------");
		System.out.println("------------Student------------");
		for (AcademyStudent student : students) {
			student.print();
		}
		System.out.println("------------Gangsa------------");
		for (AcademyGangsa gangsa : gangsas) {
			gangsa.print();
		}
		System.out.println("------------staff------------");
		for (AcademyStaff staff : staffs) {
			staff.print();
		}
		
		
	}

}
