package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableInsertMain {
	
	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String insertSQL = "insert into address values(address_no_SEQ.nextval,'김경호','123-4567','경기도 성남시')";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(insert)
		 5.SQL문전송(insert)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(insertSQL);
		System.out.println(">>insert row count:"+rowCount+" 행 insert");
		stmt.close();
		con.close();
		
		
	}

}
