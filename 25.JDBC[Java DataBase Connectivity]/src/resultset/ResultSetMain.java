package resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import dao.common.DataSource;

public class ResultSetMain {
	
	public static void main(String[] args) throws Exception {
		DataSource dataSource = new DataSource();
		/*
		 이름         널?       유형            
		 ---------- -------- ------------- 
		 NO         NOT NULL NUMBER(7)     
		 NAME                VARCHAR2(50)  
		 SHORT_DESC          VARCHAR2(255) 
	 	 PRICE               NUMBER(10,3)  
		 IPGO_DATE           DATE          
		 */
		String selectSql = "select no,name,short_desc,price,ipgo_date from product";
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("---------------ResultSet.get타입(\"컬럼이름\")---------------");
		while(rs.next()) {
			int no = rs.getInt("no");
			String name =rs.getString("name");
			String short_desc = rs.getString("short_desc");
			double price = rs.getDouble("price");
			Date ipgo_date = rs.getDate("ipgo_date");
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);				
		}
		rs.close();
		System.out.println("---------------ResultSet.get타입(컬럼인덱스)---------------");
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int no = rs.getInt(1);
			String name =rs.getString(2);
			String short_desc = rs.getString(3);
			double price = rs.getDouble(4);
			Date ipgo_date = rs.getDate(5);
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);				
		}
		rs.close();
		rs = pstmt.executeQuery();
		System.out.println("---------------ResultSet.getObject(\"컬럼이름\")---------------");
		while(rs.next()) {
			/* -------------------------
			 *   DB	  |		java
			 * -------------------------
			 * number | java BigDecimal
			 * -------------------------
			 */
			Object no = rs.getObject("no");
			Object name =rs.getObject("name");
			Object short_desc = rs.getObject("short_desc");
			Object price = rs.getObject("price");
			Object ipgo_date = rs.getObject("ipgo_date");
			System.out.println(no+"\t"+name+"\t"+short_desc+"\t"+price+"\t"+ipgo_date);
			/*
			System.out.println("no       [number]-->"+no.getClass().getSimpleName());
			System.out.println("price    [number]-->"+price.getClass().getSimpleName());
			System.out.println("ipgo_date[Date  ]-->"+ipgo_date.getClass().getSimpleName());
			*/
		}
		rs.close();
		
		System.out.println("---------------ResultSet.getString(\"컬럼이름\")---------------");
		
		
		
		
		
		
		dataSource.close(con);
	}
}
