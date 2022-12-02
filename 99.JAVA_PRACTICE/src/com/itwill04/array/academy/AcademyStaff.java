package com.itwill04.array.academy;

public class AcademyStaff 
		extends AcademyMember{
	public String depart;//부서
	public AcademyStaff() {
	
	}
	public AcademyStaff(int no,String name,String depart) {
		super(no,name);
		this.depart = depart;
	}
	/*
	public void print() {
		System.out.print(no+"\t"+name+"\t");
	}
	 */
	public void print() {
		super.print();
		System.out.println(this.depart);
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	
	
}