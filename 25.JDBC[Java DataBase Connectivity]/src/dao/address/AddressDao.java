package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressDao {
	
	/*
	 * Connection을 생성하고 해지하는 DataSource객체를 멤버변수로 가짐
	 */
	private DataSource dataSource;
	
	public AddressDao() {
		/*
		 * dataSource멤버필드 초기화
		 */
		this.dataSource=new DataSource();
	}
	
	public int insert(Address newAddress) throws Exception{
		String insertSQL = "insert into address values(address_no_SEQ.nextval,?,?,?)";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(insertSQL);
		pstmt.setString(1, newAddress.getName());
		pstmt.setString(2, newAddress.getPhone());
		pstmt.setString(3, newAddress.getAddress());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int update(Address newAddress) throws Exception{
		String updateSQL = "update address set name = ?, phone = ?, address = ? where no = ?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(updateSQL);
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
		String deleteSQL = "delete address where no= ?";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(deleteSQL);
		pstmt.setInt(1, newAddress.getNo());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public Address findByPrimaryKey(Address newAddress) throws Exception{
		String selectSQL = "select no,name,phone,address from address where no=?";
		Address findAddress = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);
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
		
		String selectSQL = "select no,name,phone,address from address";
		
		List<Address> addressList = new ArrayList<Address>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSQL);	
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
