package dao.member;

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

import dao.common.DataSource;

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
		pstmt.setDate(7, new java.sql.Date(newMember.getM_regdate().getTime()));
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

	public int delete(Member deleteMember) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.DELETE_SQL);
		pstmt.setString(1,deleteMember.getM_id());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public Member findByPrimaryKey(Member findMember) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.SELECT_BY_FIND_PRIMARY_KEY_SQL);
		pstmt.setString(1,findMember.getM_id());
		ResultSet rs = pstmt.executeQuery();
		Member tempMember = new Member();
		if(rs.next()) {
			tempMember = new Member(rs.getString("m_id"),
									rs.getString("m_password"),
									rs.getString("m_name"),
									rs.getString("m_address"),
									rs.getInt("m_age"),
									rs.getString("m_married"),
									rs.getDate("m_regdate"));
		}else {
			tempMember = null;
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return tempMember;
	}

	public List<Map> findAll() throws Exception {
		List<Map> rowMapList = new ArrayList<Map>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSQL.SELECT_BY_FIND_ALL_SQL);
		ResultSet rs = pstmt.executeQuery();
		List<Member> members = new ArrayList<Member>();
		if(rs.next()) {
			do {
				Map rowMap = new HashMap();
				rowMap.put("M_ID", rs.getString("m_id"));
				rowMap.put("M_PASSWORD", rs.getString("m_password"));
				rowMap.put("M_NAME", rs.getString("m_name"));
				rowMap.put("M_ADDRESS", rs.getString("m_address"));
				rowMap.put("M_AGE", rs.getString("m_age"));
				rowMap.put("M_MARRIED", rs.getString("m_married"));
				rowMap.put("M_REGDATE", rs.getDate("m_regdate"));
				
				rowMapList.add(rowMap);
								
			} while (rs.next());
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return rowMapList;
		
		}
}
