package com.itwill05.service.array.academy;
public class AcademyStaff extends AcademyMember {
	public String depart;//부서
	public AcademyStaff() {
	}
	//alt+shift+s --> o
	public AcademyStaff(int no,String name,String depart) {
		super(no, name);
		this.depart = depart;
	}
	
	public void print() {
		super.print();
		System.out.println(depart);
	}
	
	//alt+shift+s --> r
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
}