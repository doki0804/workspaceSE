package com.itwill.shop.user;

public class UserSQL {
	public static final String  USER_INSERT=
"insert into userinfo(userid,password,name,email) values(?,?,?,?)";
	public static final String USER_SELECT_BY_ID=
"select userid,password,name,email from userinfo where userid=?";
	public static final String USERT_REMOVE=
"delete from userinfo where userid=?";
	public static final String USER_UPDATE=
"update userinfo set password=?,name=?,email=? where userid=?";
	public static final String USER_SELECT_BY_ID_COUNT=
"select count(*) as cnt  from userinfo where userid=?";
}