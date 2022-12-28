package dao.guest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuestDao {

	public GuestDao() {
	}
	
	public int insert(Guest newguest) throws Exception {
		/********************************************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		/********************************************************************/
		
		String insertSql = "insert into guest values(guest_guest_no_seq.nextval,?,?,?,?,?,?)";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		pstmt.setString(1, newguest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(newguest.getGuest_date().getTime()));
		pstmt.setString(3, newguest.getGuest_email());
		pstmt.setString(4, newguest.getGuest_homepage());
		pstmt.setString(5, newguest.getGuest_title());
		pstmt.setString(6, newguest.getGuest_content());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int update(Guest updateGuest) throws Exception {
		/********************************************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		/********************************************************************/
		
		String updateSql = "update guest set guest_name=?,"
				+ "guest_date=?,"
				+ "guest_email=?,"
				+ "guest_homepage=?,"
				+ "guest_title=?,"
				+ "guest_content=? where guest_no=?";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		pstmt.setString(1, updateGuest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(updateGuest.getGuest_date().getTime()));
		pstmt.setString(3, updateGuest.getGuest_email());
		pstmt.setString(4, updateGuest.getGuest_homepage());
		pstmt.setString(5, updateGuest.getGuest_title());
		pstmt.setString(6, updateGuest.getGuest_content());
		pstmt.setInt(7, updateGuest.getGuest_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public int delete(int guest_no) throws Exception {
		/********************************************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		/********************************************************************/
		
		String deleteSql = "delete from guest where guest_no = ?";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, guest_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Guest findByPrimaryKey(int guest_no) throws Exception {
		/********************************************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		/********************************************************************/
		
		String selectSql = "select * from guest where guest_no = ?";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		pstmt.setInt(1, guest_no);
		ResultSet rs = pstmt.executeQuery();
		Guest tempGuest = null;
		if(rs!=null) {
			tempGuest = new Guest(rs.getInt(0),
					rs.getString(1),
					rs.getDate(2),
					rs.getString(3),
					rs.getString(4),
					rs.getString(5),
					rs.getString(6)
					);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return tempGuest;
	}
	
	public List<Guest> findAll() throws Exception {
		/********************************************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper18";
		String password="jdeveloper18";
		/********************************************************************/
		
		String selectSql = "select * from guest";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		List<Guest> guest = new ArrayList<Guest>(); 
		if(rs.next()) {
			do {
				guest.add(new Guest(rs.getInt(0),
						rs.getString(1),
						rs.getDate(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6)
						));
			} while (rs.next());
		}
		rs.close();
		pstmt.close();
		con.close();
		
		return guest;
	}
	
}
