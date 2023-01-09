package com.itwill.chobomungo.user;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itwill.chobomungo.common.DataSource;

public class UserDao {

	DataSource dataSource;

	public UserDao() throws IOException {
		this.dataSource = new DataSource();
	}

	public int insert(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_INSERT);

		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getUserPw());
		pstmt.setString(3, user.getUserName());
		pstmt.setString(4, user.getUserPhone());
		pstmt.setString(5, user.getUserAddress());
		pstmt.setString(6, user.getUserEmail());

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;

	}

	public int update(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_UPDATE);

		pstmt.setString(1, user.getUserPw());
		pstmt.setString(2, user.getUserName());
		pstmt.setString(3, user.getUserPhone());
		pstmt.setString(4, user.getUserAddress());
		pstmt.setString(5, user.getUserEmail());
		pstmt.setString(6, user.getUserId());

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;
	}

	public int delete(String userId) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_DELETE);

		pstmt.setString(1, userId);

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;

	}

	public User findByPrimaryKey(String userId) throws Exception {

		User findUser = null;

		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_SELECT_BY_ID);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();

		if (rs.next()) {
			findUser = new User(rs.getString("user_id"), rs.getString("user_pw"), rs.getString("user_name"),
					rs.getString("user_phone"), rs.getString("user_address"), rs.getString("user_email"));

		}
		return findUser;

	}

	/*
	 * 인자로 전달되는 아이디를 가지는 사용자가 존재하는지 여부를 판별
	 */
	public int countByUserId(String userId) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_SELECT_BY_ID_COUNT);
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		int userCount = rs.getInt(1);
		return userCount;

	}
	
	/*
	 * 비밀번호 유효성 체크
	 */
	public int countByUserPw(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_PW_TEST);

		
		pstmt.setString(1, user.getUserPw());
		

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;


	}
	

	// 아이디찾기
	public String findByUserId(String userName, String userPhone) throws Exception {
		String userId = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_FIND_BY_ID);

		pstmt.setString(1,userName);
		pstmt.setString(2,userPhone);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			userId = rs.getString("user_id");

		}
		return userId;

	}

	// 비밀번호찾기
	public String findByUserPw(String userId, String userName) throws Exception {
		String userPw = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_FIND_BY_PW);

		pstmt.setString(1, userId);
		pstmt.setString(2, userName);

		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			userPw = rs.getString("user_pw");

		}
		return userPw;

	}
}
