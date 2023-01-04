package com.itwill.member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.itwill.com.DataSource;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {
	private DataSource dataSource;
	public MemberDao() throws Exception {
		dataSource = new DataSource();
	}

	public int insert(Member newMember) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.INTSERT_SQL);
		pstmt.setString(1, newMember.getM_id());
		pstmt.setString(2, newMember.getM_password());
		pstmt.setString(3, newMember.getM_name());
		pstmt.setString(4, newMember.getM_address());
		pstmt.setInt(5, newMember.getM_age());
		pstmt.setString(6, newMember.getM_married());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
		
		
	}

	public int update(Member updateMember) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.UPDATE_SQL);
		pstmt.setString(1, updateMember.getM_id());
		pstmt.setString(2, updateMember.getM_password());
		pstmt.setString(3, updateMember.getM_name());
		pstmt.setString(4, updateMember.getM_address());
		pstmt.setInt(5, updateMember.getM_age());
		pstmt.setString(6, updateMember.getM_married());
		pstmt.setString(7, updateMember.getM_id());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public int delete(String m_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.DELETE_SQL);
		pstmt.setString(1,m_id);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public Member findByPrimaryKey(String m_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.SELECT_BY_FIND_PRIMARY_KEY_SQL);
		pstmt.setString(1,m_id);
		ResultSet rs = pstmt.executeQuery();
		Member tempMember = null;
		if(rs.next()) {
			tempMember = new Member(rs.getString("m_id"),
									rs.getString("m_password"),
									rs.getString("m_name"),
									rs.getString("m_address"),
									rs.getInt("m_age"),
									rs.getString("m_married"),
									rs.getDate("m_regdate"));
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return tempMember;
	}

	public List<Member> findAll() throws Exception {
		List<Member> rowMapList = new ArrayList<Member>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.SELECT_BY_FIND_ALL_SQL);
		ResultSet rs = pstmt.executeQuery();
		List<Member> memberList = new ArrayList<Member>();
		if(rs.next()) {
			do {
				memberList.add(new Member(
						rs.getString("m_id"),
						rs.getString("m_password"),
						rs.getString("m_name"),
						rs.getString("m_address"),
						rs.getInt("m_age"),
						rs.getString("m_married"),
						rs.getDate("m_regdate")));
					 }
			while (rs.next());
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return memberList;
		
		}
}
