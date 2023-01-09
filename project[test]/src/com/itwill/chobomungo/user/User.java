package com.itwill.chobomungo.user;


/*
 * 		user_id                       		VARCHAR2(20)		 NOT NULL,
		user_pw                       		VARCHAR2(20)		 NOT NULL,
		user_name                     		VARCHAR2(50)		 NOT NULL,
		user_phone                    		VARCHAR2(50)		 NOT NULL,
		user_address                  		VARCHAR2(50)		 NOT NULL,
		user_email                    		VARCHAR2(100)		 NOT NULL
)
 */
public class User {
	
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;
	private String userAddress;
	private String userEmail;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String userId, String userPw, String userName, String userPhone, String userAddress, String userEmail) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userPhone=" + userPhone
				+ ", userAddress=" + userAddress + ", userEmail=" + userEmail + "]";
	}
	
	
	
	
	

}
