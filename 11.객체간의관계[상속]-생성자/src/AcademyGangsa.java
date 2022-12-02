public class AcademyGangsa extends AcademyMember {
	private String subject; // 과목

	public AcademyGangsa() {
		super();
	}

	public AcademyGangsa(int no, String name, String subject) {
		super(no, name);
		this.subject = subject;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
