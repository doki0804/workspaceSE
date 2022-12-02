
public class AccountMememberMethodMain {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		/*
		 * 계좌데이타 대입
		 */
		a1.setAccountData(1000,"choi",10000,2.0);
		a2.setAccountData(2000,"Lee",12000,1.5);
		a3.setAccountData(3000,"Park",11000,2.0);
		System.out.println("-----------입금전-----------");
		a1.headerPrint();
		a1.printAccountData();
		/*
		 * 8000원 입금
		 */
		a1.deposit(8000);
		System.out.println("-----------입금후-----------");
		a1.headerPrint();
		a1.printAccountData();
		System.out.println("-----------출금후-----------");
		/*
		 * 500원 출금
		 */
		a1.withDraw(500);
		/*
		 * 모든계좌 잔고 1000증가
		 */
		a1.deposit(1000);
		a2.deposit(1000);
		a3.deposit(1000);
		
		a1.headerPrint();
		a1.printAccountData();
		a2.printAccountData();
		a3.printAccountData();

	}

}
