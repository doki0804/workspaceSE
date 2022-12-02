
public class AccountEncaptulationMain {

	public static void main(String[] args) {
		Account acc1 = new Account();
		/*
		 * 고객정보 입력 메쏘드 호출
		 */
		acc1.setAccountData(1000, "KIM", 20000, 2.5);
		/*
		 * 입금메쏘드 호출(8000)
		 */
		acc1.deposit(40000);
		/*
		 * 계좌데이타 프린트 메쏘드 호출		
		 */
		acc1.headerPrint();
		acc1.printAccountData();
		/*
		 * 출금 메쏘드 호출(40000)
		 */
		acc1.withDraw(50000);
		/*
		 * account1이율 변경
		 */
		acc1.setIyul(3.0);
		System.out.println("acc1 이율 : "+acc1.getIyul());
		/*
		 * acc1잔고얻기
		 */
		System.out.println("acc1 잔고 : "+acc1.getBalance());
		
		Account acc2 = new Account();
		Account acc3 = new Account();
		
		acc2.setAccountData(2000, "PARK", 30000, 2.5);
		acc3.setAccountData(3000, "LEE", 40000, 3.5);
		
		/*
		 * 모든잔고계좌 50원증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		acc1.headerPrint();
		acc1.printAccountData();
		acc2.printAccountData();
		acc3.printAccountData();
		/*
		 * 은행총잔고
		 */
		int totBalance = acc1.getBalance()+acc2.getBalance()+acc3.getBalance();
		System.out.println("은행총잔고 : "+totBalance);

	}

}
