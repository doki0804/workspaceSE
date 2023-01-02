package com.itwill.guest;

public class GuestSQL {
	public final static String INTSERT_SQL = "insert into guest values(guest_guest_no_seq.nextval,?,sysdate,?,?,?,?)";
	public final static String UPDATE_SQL = "update guest set guest_name=?,"
											+"guest_email=?,"
											+"guest_homepage=?,"
											+"guest_title=?,"
											+"guest_content=? where guest_no=?";
	public final static String DELETE_SQL = "delete from guest where guest_no=?";
	public final static String SELECT_BY_FIND_PRIMARY_KEY_SQL = "select * from guest where guest_no = ?";
	public final static String SELECT_FIND_BY_NAME_SQL = "select * from guest where guest_name = ?";
	public final static String SELECT_BY_FIND_ALL_SQL = "select * from guest";
	
}
