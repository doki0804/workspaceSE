package com.itwill.address;
/*
 * VO(Value Object),DTO(Date Transfer Object)
 *   - address테이블 1개 row의 데이터의 값을 가지는 객체
 *   - address테이블 1개 row의 데이터의 값을 전달(파라메타,리턴데이터)시키기 위한 객체
 *   - address테이블의 컬럼과 동일한수의 멤버필드를 갖는다.
 */
/*
 이름      널?       유형            
------- -------- ------------- 
NO               NUMBER(4)     
NAME    NOT NULL VARCHAR2(50)  
PHONE            VARCHAR2(50)  
ADDRESS          VARCHAR2(100) 
 */
public class Address {
	private int no;
	private String name;
	private String phone;
	private String address;

	public Address() {
	}
	public Address(int no, String name, String phone, String address) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", name=" + name + ", phone=" + phone + ", address=" + address + "]"+"\n";
	}
	
}
