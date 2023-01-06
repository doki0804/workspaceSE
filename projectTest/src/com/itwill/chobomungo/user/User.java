package com.itwill.chobomungo.user;
/*
 이름           널?       유형            
------------ -------- ------------- 
USER_ID      NOT NULL VARCHAR2(20)  
USER_PW      NOT NULL VARCHAR2(20)  
USER_NAME    NOT NULL VARCHAR2(50)  
USER_PHONE   NOT NULL VARCHAR2(50)  
USER_ADDRESS NOT NULL VARCHAR2(50)  
USER_EMAIL   NOT NULL VARCHAR2(100) 
 */
public class User {
		
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_phone;
	private String user_address;
	private String user_email;
	
	public User() {
	}
	
	public User(String user_id, String user_pw, String user_name, String user_phone, String user_address,
			String user_email) {
		super();
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_address = user_address;
		this.user_email = user_email;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + ", user_phone="
				+ user_phone + ", user_address=" + user_address + ", user_email=" + user_email + "]";
	}
	
}
