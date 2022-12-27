package dao.address.fourth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressDao4 {
		
	public AddressDao4() {
	}
	public int insert(Address newAddress) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String insertSQL = 
				"insert into address values(address_no_SEQ.nextval,'"
						+newAddress.getName()+"','"
						+newAddress.getPhone()+"','"
						+newAddress.getAddress()+"')";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		//System.out.println(">>insert row count:"+rowCount+" 행 insert");
		stmt.close();
		con.close();
		return rowCount;
	}
	public int update(Address newAddress) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String updateSQL = "update address set name = '"
						+ newAddress.getName()+"',"
						+ "phone='"+newAddress.getPhone()+"',"
						+ "address='"+newAddress.getAddress()+"'"
						+ "where no="+newAddress.getNo();
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(updateSQL);
		//System.out.println(">>update row count:"+rowCount+" 행 update");
		stmt.close();
		con.close();
		return rowCount;
	}
	public int delete(Address newAddress) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String deleteSQL = "delete address where no="+newAddress.getNo();
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(deleteSQL);
		//System.out.println(">>update row count:"+rowCount+" 행 delete");
		stmt.close();
		con.close();
		return rowCount;
	}
	public Address findByPrimaryKey(Address newAddress) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String selectSQL = "select no,name,phone,address from address where no="+newAddress.getNo();
		
		Address findAddress = null;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();	
		ResultSet rs = stmt.executeQuery(selectSQL);
		if(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			findAddress = new Address(no,name,phone,address);
		}else {
			//System.out.println("조건에 만족하는 주소록 존재안함");
			findAddress = null;
		}
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
	}
	public List<Address> findAll() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String selectSQL = "select no,name,phone,address from address";
		
		List<Address> addressList = new ArrayList<Address>();
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
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
		}else {
			System.out.println("조건에 만족하는 주소록 존재안함");
		}
		
		rs.close();
		stmt.close();
		con.close();
		return addressList;
	}
}
