package com.itwill.member;

public class MemberSQL {
	public final static String INTSERT_SQL = "insert into member values(?,?,?,?,?,?,?)";
	public final static String UPDATE_SQL = "update member set m_id= ?,"
											+ "m_password=?,m_name = ?,m_address=?,m_age=?,"
											+ "m_married=? where m_id= ?";
	public final static String DELETE_SQL = "delete member where m_id = ?";
	public final static String SELECT_BY_FIND_PRIMARY_KEY_SQL = "select * from member where m_id = ?";
	public final static String SELECT_BY_FIND_ALL_SQL = "select * from member";
	
}
