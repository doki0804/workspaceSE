package com.itwill.shop.user;
/*
VO(Value Object),DTO(Data Transfer Object)
	- userinfo 테이블 1개 row의 데이타의 값을 가지는객체
	- userinfo 테이블 1개 row의 데이타값을 이동(파라메타,리턴데이타)시키기위한객체 
	- userinfo 테이블의 컬럼과 동일한수의 멤버변수를가지는객체
*/
/*
* =================================== 
* 이름 		널? 		유형
* =================================== 
* USERID 	NOT NULL VARCHAR2(100) 
* PASSWORD	NOT NULL VARCHAR2(100) 
* NAME 		NOT NULL VARCHAR2(200) 
* EMAIL 			 VARCHAR2(300)
* ===================================
*/
public class User {
	private String userId;
	private String password;
	private String name;
	private String email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String userId, String password, String name, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	

}