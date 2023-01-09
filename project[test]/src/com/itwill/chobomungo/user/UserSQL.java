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
public class UserSQL {
	
	
	public static final String USERINFO_INSERT = "insert into userinfo(user_id,user_pw,user_name,user_phone,user_address,user_email) values (?,?,?,?,?,?)";
	
	public static final String USERINFO_PW_TEST = "insert into userinfo(user_pw) values (?)";

	public static final String USERINFO_UPDATE = "update userinfo set user_pw = ?,user_name =?,user_phone = ?,user_address =?,user_email =? where user_id =?";

	public static final String USERINFO_DELETE = "delete from userinfo where user_id =? ";
	
	public static final String USERINFO_SELECT_BY_ID = "select * from userinfo where user_id =?";
	
	public static final String USERINFO_SELECT_ALL = "select * from userinfo ";
	
	public static final String USER_SELECT_BY_ID_COUNT=
			"select count(*) as cnt  from userinfo where user_id=?";
	
	public static final String USER_SELECT_BY_PW_COUNT=
			"select count(*) as cnt  from userinfo where user_=?";
	
	public static final String USER_FIND_BY_ID = "select user_id from userinfo where user_name = ? and user_phone = ?";
	public static final String USER_FIND_BY_PW = "select user_pw from userinfo where user_id = ? and user_name = ?";

}
