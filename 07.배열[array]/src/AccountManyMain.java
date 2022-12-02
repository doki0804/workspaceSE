
public class AccountManyMain {

	public static void main(String[] args) {
		AccountMany accountMany = new AccountMany();
		accountMany.acc0 = new Account(1, "KIM", 3000, 0.5);
		accountMany.acc1 = new Account(2, "LIM", 6000, 1.5);
		accountMany.acc2 = new Account(3, "MIN", 7000, 5.5);
		accountMany.acc3 = new Account(4, "LEE", 8000, 4.5);
		accountMany.acc4 = new Account(5, "NAM", 5000, 3.5);
		
		Account.headerPrint();
		accountMany.acc0.printAccountData();
		accountMany.acc1.printAccountData();
		accountMany.acc2.printAccountData();
		accountMany.acc3.printAccountData();
		accountMany.acc4.printAccountData();
	}

}
