package com.itwill.address;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itwill.com.DataSource;

public class AddressDao {
	
	/*
	 * Connection을 생성하고 해지하는 DataSource객체를 멤버변수로 가짐
	 */
	private DataSource dataSource;
	
	public AddressDao() throws Exception {
		/*
		 * dataSource멤버필드 초기화
		 */
		this.dataSource=new DataSource();
	}
	
	public int insert(Address newAddress) throws Exception{
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_INSERT);
		pstmt.setString(1, newAddress.getName());
		pstmt.setString(2, newAddress.getPhone());
		pstmt.setString(3, newAddress.getAddress());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int update(Address newAddress) throws Exception{
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_UPDATE);
		pstmt.setString(1, newAddress.getName());
		pstmt.setString(2, newAddress.getPhone());
		pstmt.setString(3, newAddress.getAddress());
		pstmt.setInt(4, newAddress.getNo());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public int delete(Address newAddress) throws Exception{
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_DELETE);
		pstmt.setInt(1, newAddress.getNo());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public Address findByPrimaryKey(Address newAddress) throws Exception{
		
		Address findAddress = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_SELECTE_BY_NO);
		pstmt.setInt(1, newAddress.getNo());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAddress = new Address(no,name,phone,address);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return findAddress;
	}
	public List<Address> findAll() throws Exception{
		
		List<Address> addressList = new ArrayList<Address>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_SELECTE_BY_ALL);	
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			do{
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String addr=rs.getString("address");
				addressList.add(new Address(no, name, phone, addr));
			}while(rs.next());
		}
		
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return addressList;
	}
}
