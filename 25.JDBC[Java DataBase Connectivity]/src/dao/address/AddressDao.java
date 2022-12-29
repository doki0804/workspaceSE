package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
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
		String insertSQL = 
				"insert into address values(address_no_SEQ.nextval,'"
						+newAddress.getName()+"','"
						+newAddress.getPhone()+"','"
						+newAddress.getAddress()+"')";
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		stmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int update(Address newAddress) throws Exception{
		String updateSQL = "update address set name = '"
						+ newAddress.getName()+"',"
						+ "phone='"+newAddress.getPhone()+"',"
						+ "address='"+newAddress.getAddress()+"'"
						+ "where no="+newAddress.getNo();
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSQL);
		stmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public int delete(Address newAddress) throws Exception{
		String deleteSQL = "delete address where no="+newAddress.getNo();
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(deleteSQL);
		stmt.close();
		dataSource.close(con);
		return rowCount;
	}
	public Address findByPrimaryKey(Address newAddress) throws Exception{
		
		String selectSQL = "select no,name,phone,address from address where no="+newAddress.getNo();
		Address findAddress = null;
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();	
		ResultSet rs = stmt.executeQuery(selectSQL);
		if(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAddress = new Address(no,name,phone,address);
		}else {
			findAddress = null;
		}
		rs.close();
		stmt.close();
		dataSource.close(con);
		return findAddress;
	}
	public List<Address> findAll() throws Exception{
		
		String selectSQL = "select no,name,phone,address from address";
		
		List<Address> addressList = new ArrayList<Address>();
		
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();	
		ResultSet rs = stmt.executeQuery(selectSQL);
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
		stmt.close();
		dataSource.close(con);
		return addressList;
	}
}
