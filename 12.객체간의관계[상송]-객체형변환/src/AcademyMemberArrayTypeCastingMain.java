
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		AcademyMember members[] = {
		new AcademyStudent(1,"KIM","ANDROID"),
		new AcademyStudent(2,"LEE","JAVA"),
		new AcademyStudent(3,"JIN","OFFICE"),
		new AcademyGangsa(4,"박강사","보안"),
		new AcademyGangsa(5,"정강사","빅테이타"),
		new AcademyStaff(6,"천상룡","회계팀"),
		new AcademyStaff(7,"박승곤","원장")
		};
		
		AcademyMember[] receiveMembers = members;
		
		System.out.println("----------------AcademyMember들 전체출력----------------");
		for (AcademyMember academyMember : receiveMembers) {
			/* AcademyStudent,AcademyGangsa,AcademyStaff에서 재정의된 메쏘드호출 */
			academyMember.print();
		}
		
		System.out.println("-------instanceof-------");
		/*
		 * 연산자--> instanceof
		 *   - 형태 : 참조변수 instanceof 클래스이름
		 *   - 연산결과 : true or false
		 *   - ex) boolean b = receiveMembers[0] instanceof AcademyStudent;
		 */
		AcademyMember am = new AcademyStudent(90,"김학생","정보처리");
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)am;
			System.out.println("학생반 : "+tempStudent.getBan());
		}
		
		System.out.println("-----AcademyMember[]중 학생들만 출력-----");
		for (AcademyMember academyMember : receiveMembers) {
			if(academyMember instanceof AcademyStudent) {
				academyMember.print();
				AcademyStudent tempStudent=(AcademyStudent) academyMember;
				System.out.println("학생반 : "+tempStudent.getBan());
			}
		}
		
	}

}
