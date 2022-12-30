package connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.common.DataSource;

public class AccountService {
	private DataSource dataSource;
	public AccountService() throws Exception {
		dataSource = new DataSource();
	}
	/*
	 * 모든계좌의 잔고를 balance만큼 갱신
	 */
	public void updateBalance(int balance) {
		boolean exceptionCondition = true;
		Connection con = null;
		PreparedStatement pstmt = null;
		String updateSql="update accounta set acc_balance = acc_balance + ? where acc_no = ?";
		try {
			con = dataSource.getConnection();
			System.out.println("-----------updateBalacnce transaction start-----------");
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(updateSql);
			
			/*********************10000번 계좌 update*********************/
			int acc_no=10000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			int rowCount = pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+" update");
			/*********************20000번 계좌 update*********************/
			acc_no=20000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+" update");
			/*********************30000번 계좌 update*********************/
			acc_no=30000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+" update");
			
			/**예외발생**/
			int rn = (int)(Math.random()*2);
			if(rn%2==0) {
				exceptionCondition = true;
			}else {
				exceptionCondition = false;
			}
			if(exceptionCondition) {
				throw new Exception("모든계좌잔고갱신예외발생");
			}
			 
			/*********************40000번 계좌 update*********************/
			acc_no=40000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+" update");
			/*********************50000번 계좌 update*********************/
			acc_no=50000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+" update");
			/*********************60000번 계좌 update*********************/
			acc_no=60000;
			pstmt.setInt(1, balance);
			pstmt.setInt(2, acc_no);
			rowCount = pstmt.executeUpdate();
			System.out.println(acc_no+"번 계좌 "+rowCount+" update");
			System.out.println("-----------updateBalacnce transaction end[commit]-----------");
			con.commit();
			
			
		}catch (Exception e) {
			System.err.println("99.예외발생:"+e.getMessage());
			System.out.println("-----------updateBalacnce transaction end[rollback]-----------");
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			/*
			 * exception 발생유무와 관계없이 항상실행
			 *   - 리소스해지
			 */
			try {
				pstmt.close();
				dataSource.close(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
