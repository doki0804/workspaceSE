import java.util.Arrays;

public class ArraysMain{

	public static void main(String[] args) {
		
		int[] intArray1 = {1,3,5,7,9};
		int[] intArray2 = {1,3,5,7,9};
		String[] strArray1 = {"one", "two", "three"};
		String[] strArray2 = {"one", "two", "three"};
		
		System.out.println("1.배열내용비교");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame = Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		System.out.println("2.배열원소채우기(fill)");
		Arrays.fill(intArray1, 1);
		for (int e : intArray1) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println("3.배열복사(기본형)");
		int[] intArray3 = Arrays.copyOf(intArray2, intArray2.length+1);
		for (int i : intArray3) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int[] scoreArray = {90,67,88,23,56,1,34};
		String[] nameArray = {"공경호","홍경호","JAMES","김경호","김경호"};
		Account[] accounts= {
				new Account(1111, "LEE", 56000, 0.9),
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 78000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		System.out.println("3.배열복사(참조형)");
		Account[] newAccountArray = Arrays.copyOf(accounts, accounts.length);
		for (Account account : newAccountArray) {
			account.printAccountData();
		}
		System.out.println("-----------------------\n-----------------------");
		Account[] descAccounts = new Account[accounts.length];
		System.arraycopy(accounts, 0, descAccounts, 0, accounts.length);
		for (Account account : descAccounts) {
			account.printAccountData();
		}
		
		System.out.println("4.sort[기본타입]");
		Arrays.sort(scoreArray);
		Arrays.sort(nameArray);
		for (int score : scoreArray) {
			System.out.print(score+ " ");
		}
		System.out.println();
		for (String name : nameArray) {
			System.out.print(name+ " ");
		}
		System.out.println();
		System.out.println("5.sort[객체]");
		/*
		 << Arrays.sort(accountArray) >>
		    - Account[] 안에있는 element(Account) 는 
		      반드시 Comparable interface를 구현해야한다.
		    - Arrays.sort(accountArray)메쏘드 정렬메카니즘
		        A.첫번째객체와 두번째객체를 Comparable 인터페이스타입으로 캐스팅한다.
			    B. 첫번째Account객체와 두번째Account객체를 비교한다. 
			     		Comparable Account firstAccount=accountList.get(0);
			     		Comparable Account secondAccount=accountList.get(1);
			        	int result=firstAccount.compareTo(secondAccount.getNo());
			    B. 비교의 결과값 정수가 양수이면 첫번째와 두번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 첫번째와 두번째를 교환 안한다. 
			   
			    A. 두번째Account객체와 세번째Account객체를 비교한다. 
			     	Account secondAccount=accountList.get(1);
			    	Account thirdAccount=accountList.get(2);
			        int result=firstAccount.getNo()-secondAccount.getNo();
			    B. 비교의 결과값 정수가 양수이면 두번째와 세번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 두번째와 세번째를 교환 안한다. 
		 */
		
		System.out.println("5.sort[Account] - Comparable");
		Arrays.sort(descAccounts);
		
		Account.headerPrint();
		for (Account account : descAccounts) {
			account.printAccountData();
		}
		
		System.out.println("5.sort[Account] - Comparable");
		Arrays.sort(accounts, new AccountBalanceDescComparator());
		for (Account account : accounts) {
			account.printAccountData();
		}
		System.out.println();
		Arrays.sort(accounts, new AccountOwnerAscComParator());
		for (Account account : accounts) {
			account.printAccountData();
		}
		
		
		
		
	}
}
