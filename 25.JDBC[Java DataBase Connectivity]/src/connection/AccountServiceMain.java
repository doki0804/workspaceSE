package connection;

public class AccountServiceMain {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		/*
		 * 모든잔고 update 트랜젝션
		 */
		accountService.updateBalance(3333);
		
	}
}
