package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dao.common.DataSource;

public class AccountService {
	private DataSource dataSource;
	public AccountService() {
		dataSource = new DataSource();
	}
	/*
	 * 모든계좌의 잔고를 balance만큼 갱신
	 */
	public void updateBalance(int balance) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String updateSql="update accounta set acc_balance = acc_balance + ? where acc_no = ?";
		try {
			con = dataSource.getConnection();
			System.out.println("-----------updateBalacnce transaction start-----------");
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(updateSql);
			pstmt.setInt(1, balance);
			pstmt.setInt(2, balance);
			pstmt.executeUpdate();
			
			
			
		}catch (Exception e) {
			
		}finally {
			/*
			 * exception 발생유무와 관계없이 항상실행
			 *   - 리소스해지
			 */
			try {
				dataSource.close(con);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
