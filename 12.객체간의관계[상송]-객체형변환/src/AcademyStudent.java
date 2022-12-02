public class AcademyStudent extends AcademyMember {
	private String ban; //반
	
	public AcademyStudent() {
		super();
	}
	
	public AcademyStudent(int no, String name, String ban) {
		super(no,name);
		this.ban=ban;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(this.ban);
	}
	
	public String getBan() {
		return ban;
	}
	
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	
	
	
}
