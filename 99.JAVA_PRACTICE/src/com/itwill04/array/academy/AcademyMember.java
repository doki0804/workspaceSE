package com.itwill04.array.academy;
/*
 * - Academy구성원들의 공통속성과기능을 가지고있는 부모(super)클래스
 * - AcademyStudent,AcademyGangsa,AcademyStaff 클래스들이 상속받아 재사용하기위한 클래스
 */
public abstract class AcademyMember extends Object {
	private int no;//번호
	private String name;//이름
	public AcademyMember() {
		super();
	}
	public AcademyMember(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}