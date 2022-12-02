
public class DuoMember {

	private int no;
	private String name;
	public DuoMember() {
		
	}
	/*
	 * 생성자생성 단축키 alt+shift+s+o
	 */
	public DuoMember(int no, String name) {
		
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.println(no+"\t"+name);
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
}
