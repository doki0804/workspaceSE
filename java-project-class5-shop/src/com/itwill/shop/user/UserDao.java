package com.itwill.shop.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.shop.common.DataSource;

public class UserDao {
	private DataSource dataSource;
	public UserDao() throws Exception{
		dataSource=new DataSource();
	}
	/*
	 * create(insert):user테이블에 새로운사용자생성
	 */
	public int insert(User user) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	/*
	 * update: 기존의 사용자정보를 수정
	 */
	public int update(User user) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_UPDATE);
		pstmt.setString(1, user.getPassword());
		pstmt.setString(2, user.getName());
		pstmt.setString(3, user.getEmail());
		pstmt.setString(4, user.getUserId());
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	/*
	 * remove(delete):사용자아이디에해당하는사용자를 삭제
	 */
	public int delete(String userId) throws Exception{
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USERT_REMOVE);
		pstmt.setString(1, userId);
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	/*
	 * 사용자아이디에해당하는 정보를 데이타베이스에서 1개 찾아서 User 객체로반환
	 * selectByPK
	 */
	public User findByPrimaryKey(String userId)throws Exception {
		User user=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_BY_ID);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			user=new User(
					rs.getString("userid"),
					rs.getString("password"), 
					rs.getString("name"), 
					rs.getString("email"));
		}
		return user;
	}
	/*
	 * 인자로 전달되는 아이디를 가지는 사용자가 존재하는지 여부를 판별
	 */
	public int countByUserId(String userId) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_BY_ID_COUNT);
		pstmt.setString(1, userId);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		int userCount = rs.getInt(1);
		return userCount;
		
	}
	
}
