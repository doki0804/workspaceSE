public class ReferenceTypeAccountArrayMain {

	public static void main(String[] args) {
		System.out.println("------값목록으로배열생성{}------");
		Account acc1=new Account(1111, "LEE", 56000, 0.9);
		Account[] accounts= {
				acc1,
				new Account(2222, "KIM", 58900, 1.3),
				new Account(3333, "PARK", 78000, 3.3),
				new Account(4444, "CHOI", 90000, 5.3),
				new Account(5555, "SIM", 56000, 4.3),
				new Account(6666, "SOO", 23000, 2.3),
				new Account(7777, "SONG", 12900, 7.3),
				new Account(8888, "MIN", 23400, 6.3),
				new Account(9999, "JANG", 87200, 0.3)
		};
		
		System.out.println("1.은행총계좌수:"+accounts.length);
		System.out.println("2.은행계좌 전체출력");
		Account.headerPrint();
		for(int i=0;i<accounts.length;i++) {
			/*
			Account tempAccount=accounts[i];
			tempAccount.print();
			*/
			accounts[i].printAccountData();;
		}
		
		System.out.println("3.은행계좌들 총잔고");
		int totBalance=0;
		for(int i=0; i<accounts.length; i++) {
			totBalance += accounts[i].getBalance();
		}
		System.out.println(">> "+totBalance);
		
		System.out.println("4.은행 계좌들중에서 계좌번호 3333번계좌 한개 찾아서 출력(계좌번호는 중복되지않는다)");
		for (int i = 0; i < accounts.length; i++) {
			Account account = accounts[i];
			if(accounts[i].getNo()==3333) {
				account.printAccountData();
				break;
			}
		}
		
		System.out.println("5.은행 계좌들중에서 계좌잔고 50000원이상인 VIP계좌 여러개 찾아서 출력");
		for (Account tempAccount : accounts) {
			if(tempAccount.getBalance()>=50000) {
				tempAccount.printAccountData();
			}
		}
		
		System.out.println("6.은행 계좌들중에서 계좌이율 2.0 이상인 계좌 여러개 찾아서 출력[Quiz]");
		for (Account tempAccount : accounts) {
			if(tempAccount.getIyul() >=2.0) {
				tempAccount.printAccountData();
			}
		}
		
		System.out.println("6.은행 계좌들중에서 이름이 KIM인 계좌 여러개 찾아서 출력[String객체배우고난후에]");
		
		System.out.println("7.6666번계좌 3000원입금");
		for (Account account : accounts) {
			if(account.getNo()==6666) {
				System.out.println(">> 입금전");
				account.printAccountData();
				account.deposit(3000);
				System.out.println(">> 입금후");
				account.printAccountData();
				break;
			}
		}
		
		System.out.println("8.9999번계좌 3000원출금[Quiz]");
		for (Account account : accounts) {
			if(account.getNo()==9999) {
				System.out.println(">> 출금전");
				account.printAccountData();
				account.withDraw(3000);
				System.out.println(">> 출금후");
				account.printAccountData();
				break;
			}
		}
		
		System.out.println("9.계좌잔고순으로 오름차순정렬");
		for(int i=1; i<accounts.length; i++) {
			for (int j=0 ; j<accounts.length-i;j++) {
				if(accounts[j].getBalance()>accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				
				}else if(accounts[j].getBalance()==accounts[j+1].getBalance()) {
					
				}
			}
		}
		Account.headerPrint();
		for(int i=0;i<accounts.length;i++) {
			accounts[i].printAccountData();;
		}
		
		System.out.println("9.계좌잔고순으로 내림차순정렬");
		for(int i=1; i<accounts.length; i++) {
			for (int j=0 ; j<accounts.length-i;j++) {
				if(accounts[j].getBalance()<accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				
				}else if(accounts[j].getBalance()==accounts[j+1].getBalance()) {
					
				}
			}
		}
		Account.headerPrint();
		for(int i=0;i<accounts.length;i++) {
			accounts[i].printAccountData();;
		}
		
		System.out.println("9.계좌번호순으로 오름(내림)차순정렬[Quiz]");
		for(int i=1; i<accounts.length; i++) {
			for (int j=0 ; j<accounts.length-i;j++) {
				if(accounts[j].getNo()<accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				
				}else if(accounts[j].getBalance()==accounts[j+1].getBalance()) {
					
				}
			}
		}
		Account.headerPrint();
		for(int i=0;i<accounts.length;i++) {
			accounts[i].printAccountData();;
		}
		
		System.out.println("9.계좌이름순으로 오름(내림)차순정렬");
		
		System.out.println("10.5555계좌한개 이율을 3.6으로변경");
		for (Account account : accounts) {
			if (account.getNo()==5555) {
				account.setIyul(3.6);
				break;
			}
		}
		
		System.out.println("11.VIP계좌(잔고50000원이상)여러개 잔고 50원 증가");
		for (Account account : accounts) {
			if(account.getBalance()>=50000) {
				account.deposit(50);
				account.printAccountData();
			}
		}
		
		System.out.println("----------------------------Account객체추가----------------------------");
		Account[] tempAcc = new Account[10];
		for (int i=0;i<tempAcc.length-1;i++) {
			tempAcc[i]=accounts[i];
		}
		tempAcc[9]= new Account(10000, "JUNG", 79500, 0.2);
		
		Account[] newAccounts = new Account[10];
		for (int i=0;i<tempAcc.length;i++) {
			newAccounts[i]=tempAcc[i];
			newAccounts[i].printAccountData();
		}
		
		System.out.println("------ Account에 재정의된 toString메쏘드 ------");
		for (Account account : newAccounts) {
			System.out.println(account);
		}
		
		System.out.println("----------------------------Account객체삭제----------------------------");
		/**********************OPTION************************
		 1.accounts배열 객체에 새로생성한계좌객체 추가
		 	A. acouunts.lenth+1개짜리 임시배열 생성
		 	B. accounts의 모든계좌객체 임시배열로 이동
		 	C. 임시배열에서 새로운 Account객체 추가
		 	D. accounts에 임시배열주소대입
		 	
		 2. accounts배열 객체에서 계좌번호 4444번계좌객체 삭제
		 	A. accounts에서 4444계좌찾아서 null대입
		 	B. acouunts.lenth-1개짜리 임시배열 생성
		 	C. accounts null이 아닌 모든계좌 임시배열로이동
		 	D. accounts에 임시배열 대입
		 */
		
		
	}

}