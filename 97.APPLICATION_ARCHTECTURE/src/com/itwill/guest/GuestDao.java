package com.itwill.guest;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.com.DataSource;

public class GuestDao {
	
	private DataSource dataSource;
	
	public GuestDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public int insert(Guest newguest) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.INTSERT_SQL);
		pstmt.setString(1, newguest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(newguest.getGuest_date().getTime()));
		pstmt.setString(3, newguest.getGuest_email());
		pstmt.setString(4, newguest.getGuest_homepage());
		pstmt.setString(5, newguest.getGuest_title());
		pstmt.setString(6, newguest.getGuest_content());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int update(Guest updateGuest) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.UPDATE_SQL);
		pstmt.setString(1, updateGuest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(updateGuest.getGuest_date().getTime()));
		pstmt.setString(3, updateGuest.getGuest_email());
		pstmt.setString(4, updateGuest.getGuest_homepage());
		pstmt.setString(5, updateGuest.getGuest_title());
		pstmt.setString(6, updateGuest.getGuest_content());
		pstmt.setInt(7, updateGuest.getGuest_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int delete(Guest deleteGuest) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.DELETE_SQL);
		pstmt.setInt(1, deleteGuest.getGuest_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public Guest findByPrimaryKey(Guest findGuest) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.SELECT_BY_FIND_PRIMARY_KEY_SQL);
		pstmt.setInt(1, findGuest.getGuest_no());
		ResultSet rs = pstmt.executeQuery();
		Guest tempGuest = null;
		if(rs.next()) {
			tempGuest = new Guest(rs.getInt("guest_no"),
					rs.getString("guest_name"),
					rs.getDate("guest_date"),
					rs.getString("guest_email"),
					rs.getString("guest_homepage"),
					rs.getString("guest_title"),
					rs.getString("guest_content")
					);
		}else {
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return tempGuest;
	}
	
	public List<Guest> findAll() throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSQL.SELECT_BY_FIND_ALL_SQL);
		ResultSet rs = pstmt.executeQuery();
		List<Guest> guest = new ArrayList<Guest>(); 
		if(rs.next()) {
			do {
				guest.add(new Guest(rs.getInt("guest_no"),
						rs.getString("guest_name"),
						rs.getDate("guest_date"),
						rs.getString("guest_email"),
						rs.getString("guest_homepage"),
						rs.getString("guest_title"),
						rs.getString("guest_content")
						));
			} while (rs.next());
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		
		return guest;
	}
	
}
