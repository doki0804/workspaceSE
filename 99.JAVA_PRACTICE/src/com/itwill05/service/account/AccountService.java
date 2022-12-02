package com.itwill05.service.account;


/*
 * Account객체전체에관련된 업무를 실행할클래스
 * 		1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 		2.계좌객체들을 사용해서 업무실행
 */
 
public class AccountService {
	
	public static final int SORT_BY_NO=1;
	public static final int SORT_BY_OWNER=2;
	public static final int SORT_BY_BALANCE=3;
	public static final int SORT_BY_IYUL=4;
	
	public static final int SORT_ASC=1;
	public static final int SORT_DESC=2;
	
	
	/*
	private Account[] accounts= {
			new Account(1111, "KIM", 89000, 1.3),
			new Account(2222, "AIM", 45000, 2.7),
			new Account(3333, "FIM", 89000, 4.7),
			new Account(4444, "XIM", 34000, 6.7),
			new Account(5555, "hIM", 78000, 3.7),
			new Account(6666, "KIM", 89000, 5.7),
			new Account(7777, "KIM", 89000, 4.7),
			new Account(8888, "qIM", 91000, 1.7),
			new Account(9999, "mIM", 12000, 0.7),
	};
	*/
	private Account[] accounts;
	public AccountService() {
		accounts=new Account[9];
		accounts[0]=new Account(1111, "KIM", 89000, 1.3);
		accounts[1]=new Account(2222, "AIM", 45000, 2.7);
		accounts[2]=new Account(3333, "FIM", 89000, 4.7);
		accounts[3]=new Account(4444, "XIM", 34000, 6.7);
		accounts[4]=new Account(5555, "hIM", 78000, 3.7);
		accounts[5]=new Account(6666, "KIM", 89000, 5.7);
		accounts[6]=new Account(7777, "KIM", 89000, 4.7);
		accounts[7]=new Account(8888, "qIM", 91000, 1.7);
		accounts[8]=new Account(9999, "mIM", 12000, 0.7);
	}
	/*
	  << 과제 아님 >>
	   0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length+1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i]; 
		}
		newAccounts[accounts.length] = newAccount;
		accounts = newAccounts;
		}
	
	
	/*
	 * << 과제 아님 >>
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	*/
	public void addAccount(int no,String owner,int balance,double iyul) {
		/*
		 * 1.배열크기증가
		 *   - 기존배열보다큰배열생성
		 *   - 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length+1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i]; 
		}
		newAccounts[accounts.length] = new Account(no,owner,balance,iyul);
		accounts = newAccounts;
	}
	public void totAccountPrint() {
		for (Account account : accounts) {
			account.print();
		}
	}
	
	/*
	 1.은행계좌들 총계좌수출력메쏘드정의
	 */
	public void totAccountNumberPrint() {
		int numberOfAccount=0;
		while(numberOfAccount<accounts.length) {
			numberOfAccount++;
		}
		System.out.println("총계좌수 : "+numberOfAccount);
	}
	/*
	 * 2.은행계좌들 전체출력메쏘드 정의
	 */
	public void print() {
		Account.headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}
	/*
	 * 3.은행계좌들 총잔고 출력메쏘드 정의
	 */
	public void totBalancePrint() {
		for (Account account : accounts) {
			int totBalance = 0;
			totBalance += account.getBalance();
			System.out.println("은행계좌 총잔고 : "+totBalance);
		}
	}
	/*
	 4.계좌번호 인자로받아서 계좌한개출력
	 */
	public void findByNoPrint(int no) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].print();
				break;
			}
		}
		
	}	
	/*
	 *  5.계좌잔고 인자로 받아서 잔고이상인 계좌들출력
	 */
	public void findByBalancePrint(int balance) {
		Account.headerPrint();
		for (Account account : accounts) {
			if(account.getBalance()>=balance) {
				account.print();
			}
		}
	}
	/*
	6.계좌이율 인자로 받아서 이율이상인 계좌들출력
	*/ 
	public void findByIyulPrint(double iyul) {
		Account.headerPrint();
		for (Account account : accounts) {
			if(account.getIyul()>=iyul) {
				account.print();
			}
		}
	}
	/*
	7.계좌주이름 인자로 받아서 인자이름과동일한 계좌들출력
	 */ 
	public void findByNamePrint(String name) {
		Account.headerPrint();
		for (Account account : accounts) {
			if(account.getOwner().equals(name)) {
				account.print();
			}
		}
	}
	/*
	8.계좌번호,입금할돈 인자로 받아서 입금
	 */ 
	public void ipGum(int no,int m) {
		/*
		 * 1.계좌번호로 계좌찾기
		 * 2.입금
		 */
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].deposit(m);
				accounts[i].print();
				break;
			}
		}
	}
	/*
	9.계좌번호,출금할돈 인자로 받아서 출금
	 */ 
	public void chulGum(int no,int m) {
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.withDraw(m);
				account.print();
				break;
			}
		}
	}
	/*
	 << 과제 아님 >>
	 10.<< 정렬 >> 
	 * sortField --> 1:번호,2:이름,3:잔고,4:이율
	 * sortOrder --> 1:오르차순,2:내림차순
	 */
	public void sort(int sortField,int sortOrder) {
		switch(sortField) {
		case SORT_BY_NO:
			if(sortOrder==SORT_ASC) {
				sortByAccountNumberAscending();
				break;
			}else if(sortOrder==SORT_DESC) {
				sortByAccountNumberDescending();
				break;
			}
		case SORT_BY_OWNER:
			if(sortOrder==SORT_ASC) {
				sortByNameAscending();
				break;
			}else if(sortOrder==SORT_DESC) {
				sortByNameDescending();
				break;
			}
		case SORT_BY_BALANCE:
			if(sortOrder==SORT_ASC) {
				sortByBalanceAscending();
				break;
			}else if(sortOrder==SORT_DESC) {
				sortByBalanceDescending();
				break;
			}
		case SORT_BY_IYUL:
			if(sortOrder==SORT_ASC) {
				sortByIyulAscending();
				break;
			}else if(sortOrder==SORT_DESC) {
				sortByIyulDescending();
				break;
			}
		}
		
	}
	
	
	/*
	 10.계좌를 잔고순으로 오름차순정렬
	 */
	public void sortByBalanceAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	/*
	 11.계좌를 잔고순으로 내림차순정렬
	 */
	
	public void sortByBalanceDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getBalance() < accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	/*
	 * 계좌를 이름순으로 오름차순 정렬
	 */
	public void sortByNameAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getOwner().compareToIgnoreCase(accounts[j+1].getOwner())>0) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
	}
	/*
	 * 계좌를 이름순으로 내림차순정렬
	 */
	
	public void sortByNameDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getOwner().compareToIgnoreCase(accounts[j+1].getOwner())<0) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	/*
	 * 계좌를 계좌번호순으로 오름차순정렬
	 */
	public void sortByAccountNumberAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getNo() > accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	/*
	 * 계좌를 계좌번호순으로 내림차순정렬
	 */
	
	public void sortByAccountNumberDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getNo() < accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	/*
	 * 계좌를 이율순으로 오름차순정렬 
	 */
	public void sortByIyulAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getIyul() > accounts[j+1].getIyul()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	/*
	 *계좌를 이율순으로 내림차순정렬
	 */
	
	public void sortByIyulDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getIyul() < accounts[j+1].getIyul()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
	}
	
	/*
	 << 과제 아님 >>
	12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	*/
	public void updateAccount(Account updateAccount) {
		
		//계좌번호가 같다면 수정
		for(int i =0; i<accounts.length;i++) {
			if(accounts[i].getNo() == updateAccount.getNo()) {
				accounts[i] = updateAccount;
				break;
			}
		}
			
	}
	/*
	<< 과제 아님 >>
	13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	*/
	public void updateAccount(int no,String owner,int balance,double iyul) {
		//계좌번호가 같을시 수정
		
		for(int i =0; i<accounts.length;i++) {
			if(accounts[i].getNo() == no) {
				accounts[i] = new Account(no,owner,balance,iyul);
				break;
			}
		}
	}
}