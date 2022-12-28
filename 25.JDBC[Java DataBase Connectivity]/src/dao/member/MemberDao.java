package dao.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	public MemberDao() {

	}

	public int insert(Member newMember) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		
		String insertSQL = "insert into member values('"
							+newMember.getM_id()+"','"
							+newMember.getM_password()+"','"
							+newMember.getM_name()+"','"
							+newMember.getM_address()+"','"
							+newMember.getM_age()+"','"
							+newMember.getM_married()+"',"
							+"sysdate"
							+")"; 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		stmt.close();
		con.close();
		return rowCount;
		
		
	}

	public int update(Member updateMember) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		
		String updateSQL = 	"update member set m_id='"+
				updateMember.getM_id()+"',"
				+"m_password='"+updateMember.getM_password()+"',"
				+"m_name='"+updateMember.getM_name()+"',"
				+"m_address='"+updateMember.getM_address()+"',"
				+"m_age='"+updateMember.getM_age()+"',"
				+"m_married='"+updateMember.getM_married()+"'"
				+"where m_id="+"'"+updateMember.getM_id()+"'";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		stmt.close();
		con.close();
		return rowCount;
	}

	public int delete(Member deleteMember) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		
		String deleteSQL = "delete member where m_id = '"+deleteMember.getM_id()+"'"; 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		stmt.close();
		con.close();
		return rowCount;
	}

	public Member findByPrimaryKey(Member findMember) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		
		String selectSQL = "select * from member where m_id = '"+findMember.getM_id()+"'"; 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
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
		stmt.close();
		con.close();
		return tempMember;
	}

	public List<Member> findAll() throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		
		String selectSQL = "select * from member"; 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSQL);
		List<Member> members = new ArrayList<Member>();
		if(rs.next()) {
			do {
				members.add(new Member(
						rs.getString("m_id"),
						rs.getString("m_password"),
						rs.getString("m_name"),
						rs.getString("m_address"),
						rs.getInt("m_age"),
						rs.getString("m_married"),
						rs.getDate("m_regdate")
						));
			} while (rs.next());
		}
		rs.close();
		stmt.close();
		con.close();
		return members;
		
		}
}
