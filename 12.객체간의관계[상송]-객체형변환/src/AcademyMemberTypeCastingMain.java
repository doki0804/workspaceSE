
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		/*
		 * public class AcademyStudent extends AcademyMember{} 
		 * public class AcademyGangsa extends AcademyMember{} 
		 * public class AcademyStaff extends AcademyMember{} 
		 * 
		 * AcademyMember의 자식타입객체(AcademyStudent,AcademyGangsa,AcademyStaff)들은
		 * AcademyMember 타입변수대입가능
		 */
		AcademyStudent st1 = new AcademyStudent(1,"KIM","ANDROID");
		AcademyMember m1 = st1;
		AcademyMember m2 = new AcademyStudent(2,"LEE","JAVA");
		AcademyMember m3 = new AcademyStudent(3,"JIN","OFFICE");
		
		AcademyMember m4 = new AcademyGangsa(4,"박강사","보안");
		AcademyMember m5 = new AcademyGangsa(5,"정강사","빅테이타");

		AcademyMember m6 = new AcademyStaff(6,"천상룡","회계팀");
		AcademyMember m7 = new AcademyStaff(7,"박승곤","원장");
		/****AcademyMember에 정의되지않은 메쏘드호출 불가능****
		 String ban = m1.getBan();
		 *****************************************************/
		/****AcademyMember에 정의된 재정의된메쏘드호출 가능****/
		m1.print();
		System.out.println("----------------AcademyMember들 전체출력----------------");
		AcademyMember[] members = {m1,m2,m3,m4,m5,m6,m7};
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
		
		
		
		
	}

}
