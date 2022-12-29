package connection;

public class AccountServiceTransactionMain {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		/*
		 * 모든잔고 update 트랜젝션
		 */
		accountService.updateBalance(1);
		
	}
}
