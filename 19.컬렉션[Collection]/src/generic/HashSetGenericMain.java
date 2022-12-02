package generic;

import java.util.HashSet;

public class HashSetGenericMain {

	public static void main(String[] args) {
		
		System.out.println("------------1.add------------");
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);
		
		HashSet<Account> accountSet = new HashSet<Account>();
		System.out.println("# set size : "+accountSet.size());
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size : "+accountSet.size());
		System.out.println(accountSet);
		boolean isAdd = accountSet.add(acc5);
		System.out.println("추가여부 : "+isAdd);
		System.out.println("# set size : "+accountSet.size());
		System.out.println(accountSet);
		System.out.println("------------2.remove------------");
		boolean isRemove = accountSet.remove(acc5);
		System.out.println("삭제여부 : "+isRemove);
		System.out.println("# set size : "+accountSet.size());
		System.out.println(accountSet);
		
		System.out.println("%%%%%%%%%%%%%%%전체출력%%%%%%%%%%%%%%%%");
		Account.headerPrint();
		for (Account account : accountSet) {
			account.print();
		}
		
		
		
		
		
		
		
	}
}
