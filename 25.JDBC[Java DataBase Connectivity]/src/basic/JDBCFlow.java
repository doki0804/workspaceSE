package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlow {

	public static void main(String[] args) throws Exception {
		/*
		 * 1.Driver class loading
		 * 	  A.Driver Class객체생성
		 *    B.DriverManager객체등록
		 */
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1.Driver class loading");
		/*
		 * 2.Connection 객체생성
		 * 	 -DB Server와 연결객체
		 */
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		System.out.println("2.Connection객체생성:"+con);
		
		/*
		 * 3.Statement객체 생성
		 *   -SQL전송객체생성
		 */
		Statement stmt = con.createStatement();
		System.out.println("3.Statement 객체생성(SQL전송객체):"+stmt);
		
		/*
		 * 4.SQL문 전송(select)
		 * 5.ResultSet객체얻기(select)
		 */
		
		ResultSet rs = stmt.executeQuery("select * from dept");
		System.out.println("4,5.ResultSet객체얻기(select문 실행결과) : "+rs);
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
		
		
		
		
		
		
		
		
	}
}
