package com.itwill.member;
/*
VO(Value Object),DTO(Data Transfer Object)
	- member 테이블 1개 row의 데이타의 값을 가지는객체
	- member 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- member 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
/*
이름         널?       유형            
---------- -------- ------------- 
M_ID       NOT NULL VARCHAR2(20)  
M_PASSWORD          VARCHAR2(20)  
M_NAME              VARCHAR2(50)  
M_ADDRESS           VARCHAR2(100) 
M_AGE               NUMBER(3)     
M_MARRIED           CHAR(1)       
M_REGDATE           DATE     
 */

import java.util.Date;

public class Member {
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_address;
	private int m_age;
	private String m_married;
	private Date m_regdate;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String m_id, String m_password, String m_name, String m_address, int age, String m_married,
			Date m_regdate) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_address = m_address;
		this.m_age = age;
		this.m_married = m_married;
		this.m_regdate = m_regdate;
	}

	public String getM_id() {
		return m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public String getM_address() {
		return m_address;
	}

	public int getM_age() {
		return m_age;
	}

	public String getM_married() {
		return m_married;
	}

	public Date getM_regdate() {
		return m_regdate;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public void setM_age(int age) {
		this.m_age = age;
	}

	public void setM_married(String m_married) {
		this.m_married = m_married;
	}

	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}

	@Override
	public String toString() {
		return "Member [m_id=" + m_id + ", m_password=" + m_password + ", m_name=" + m_name + ", m_address=" + m_address
				+ ", age=" + m_age + ", m_married=" + m_married + ", m_regdate=" + m_regdate + "]"+"\n";
	}
	
	
	
}
