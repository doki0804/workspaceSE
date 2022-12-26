package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableUpdateByPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		String updateSQL = "update address set name = '김변경',phone='899-9900',address='서울시 강남구' where no=2";
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(update)
		 5.SQL문전송(update)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int rowCount = stmt.executeUpdate(updateSQL);
		System.out.println(">>update row count:"+rowCount+" 행 update");
		stmt.close();
		con.close();
		
					
	}
}
