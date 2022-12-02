
public class AcademyMemberConstructorMain {

	public static void main(String[] args) {
		/*
		 *  << Cannot instantiate the type AcademyMember >>
		 * AcademyMember member = new AcademyMember(0,"아저씨");
		 */
		
		AcademyStudent student1 = new AcademyStudent();
		AcademyStudent student2 = new AcademyStudent(1,"이원호","자바");
		
	}

}
