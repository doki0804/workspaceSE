package com.itwill05.service.account;

/*
 * 1.계좌객체들(Account[]) 을멤버변수로가진다.
 * 2.계좌객체들을 사용해서 업무실행
 */
public class AccountServiceReturn {

	public static final int SORT_BY_NO=1;
	public static final int SORT_BY_OWNER=2;
	public static final int SORT_BY_BALANCE=3;
	public static final int SORT_BY_IYUL=4;
	
	public static final int SORT_ASC=1;
	public static final int SORT_DESC=2;

	private Account[] accounts = { 
			new Account(1111, "KIM", 85000, 5.9), 
			new Account(2222, "JIM", 77000, 4.2),
			new Account(3333, "FIM", 56000, 1.2), 
			new Account(4444, "SIM", 77000, 0.2),
			new Account(5555, "GIM", 94000, 3.2), 
			new Account(6666, "AIM", 56000, 6.2),
			new Account(7777, "XIM", 33000, 7.2), 
			new Account(8888, "QIM", 77000, 5.2),
			new Account(9999, "AIM", 80000, 1.2) };
	/*
	 * 0.계좌객체를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(Account newAccount) {
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	/*
	 * 0.계좌데이타를 인자로받아서 Account[]에추가[OPTION]
	 */
	public void addAccount(int no, String owner, int balance, double iyul) {
		Account newAccount = new Account(no, owner, balance, iyul);
		/*
		 * 1.배열크기증가 
		 * 	- 기존배열보다큰배열생성 
		 * 	- 기존데이타 옮김
		 */
		Account[] newAccounts = new Account[accounts.length + 1];
		for (int i = 0; i < accounts.length; i++) {
			newAccounts[i] = accounts[i];
		}
		newAccounts[accounts.length] = newAccount;
		this.accounts = newAccounts;
	}
	/*
	 * 1.은행계좌들 총계좌수 반환메써드
	 */
	public int getTotAccountNumber() {
		int numberOfAccount=0;
		while(numberOfAccount<accounts.length) {
			numberOfAccount++;
		}
		return numberOfAccount;
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
	 * 3.은행계좌들 총잔고를 반환하는 메쏘드
	 */
	public int getAccountTotBalance() {
		int totBalance = 0;
		for (Account account : accounts) {
			totBalance += account.getBalance();
		}
		return totBalance;
	}

	/*
	 * 4.계좌번호를 인자로받아서 계좌객체주소 한개반환
	 */
	public Account findByNo(int no) {
		Account findAccount = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				findAccount = accounts[i];
				break;
			}
		}
		return findAccount;
	}

	/*
	 * 5.계좌잔고 인자로받아서 잔고이상인 계좌배열객체 참조변수반환
	 */
	public Account[] findByBalance(int balance) {
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		/*
		 * B. Account객체배열생성 
		 * 	- findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int countAccount = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()>=balance) {
				countAccount++;
			} 
		}
		Account[] findAccounts = new Account[countAccount];
		int findIndexNo = 0;
		for (int i = 0; i < countAccount; i++) {
			for(int j = findIndexNo; j<accounts.length;j++) {
				if(accounts[j].getBalance()>=balance) {
					findIndexNo = j+1;
					findAccounts[i]=accounts[j];
					break;
				}
			}
		}
		return findAccounts;
	}
	/*
	 * 6.계좌이율인자로받아서 인자이상인 계좌들배열객체 참조변수반환
	 */
	public Account[] findByIyul(double iyul) {
		int countAccount = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getIyul()>=iyul) {
				countAccount++;
			} 
		}
		Account[] findAccounts = new Account[countAccount];
		int findIndexIyul = 0;
		for (int i = 0; i < countAccount; i++) {
			for(int j = findIndexIyul; j<accounts.length;j++) {
				if(accounts[j].getIyul()>=iyul) {
					findIndexIyul = j+1;
					findAccounts[i]=accounts[j];
					break;
				}
			}
		}
		return findAccounts;
	}

	/*
	 * 7.계좌주이름 인자로받아서 이름과일치하는계좌들배열객체 참조변수반환
	 */
	public Account[] findByName(String name) {
		/*
		 * A. 만족하는 객체의갯수구하기 - 예를들어 3개라면
		 */
		/*
		 * B. Account객체배열생성 
		 * 	- findAccounts=new Account[3];
		 */
		/*
		 * C. 만족하는Account객체들 Account배열에담기
		 */
		int countAccount = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getOwner().equals(name)) {
				countAccount++;
			} 
		}
		Account[] findAccounts = new Account[countAccount];
		int findIndexName = 0;
		for (int i = 0; i < countAccount; i++) {
			for(int j = findIndexName; j<accounts.length;j++) {
				if(accounts[j].getOwner().equals(name)) {
					findIndexName = j+1;
					findAccounts[i]=accounts[j];
					break;
				}
			}
		}
		return findAccounts;
	}

	/*
	 * 8.계좌번호,입금할돈 인자로 받아서 입금한후 입금계좌 참조변수반환
	 */
	public Account ipGum(int no, int m) {
		/*
		 * 1.계좌번호로 계좌찾기 
		 * 2.입금
		 * 3.입금계좌 참조변수반환
		 */
		Account ipgum = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				accounts[i].deposit(m);
				ipgum = accounts[i];
				break;
			}
		}
		
		return ipgum;

	}

	/*
	 * 9.계좌번호,출금할돈 인자로 받아서 출금
	 */
	public Account chulGum(int no, int m) {
		Account chulGum = null;
		for (Account account : accounts) {
			if(account.getNo()==no) {
				account.withDraw(m);
				chulGum = account;
				break;
			}
		}
		return chulGum;
	}

	/*
	 * 10,11 정렬  standard --> 1:번호,2:이름,3:잔고,4:이율 
	 *             order    --> 1:오름차순,2:내림차순
	 */
	public Account[] sort(int standard, int order) {
		switch(standard) {
		case SORT_BY_NO:
			if(order==SORT_ASC) {
				sortByAccountNumberAscending();
				break;
			}else if(order==SORT_DESC) {
				sortByAccountNumberDescending();
				break;
			}
		case SORT_BY_OWNER:
			if(order==SORT_ASC) {
				sortByNameAscending();
				break;
			}else if(order==SORT_DESC) {
				sortByNameDescending();
				break;
			}
		case SORT_BY_BALANCE:
			if(order==SORT_ASC) {
				sortByBalanceAscending();
				break;
			}else if(order==SORT_DESC) {
				sortByBalanceDescending();
				break;
			}
		case SORT_BY_IYUL:
			if(order==SORT_ASC) {
				sortByIyulAscending();
				break;
			}else if(order==SORT_DESC) {
				sortByIyulDescending();
				break;
			}
		}
		return accounts;
	}
	
	public Account[] sortByBalanceAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getBalance() > accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
		return accounts;
	}
	/*
	 * 계좌를 잔고순으로 내림차순정렬
	 */
	
	public Account[] sortByBalanceDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getBalance() < accounts[j+1].getBalance()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
			
		}
		return accounts;
	}
	/*
	 * 계좌를 이름순으로 오름차순 정렬
	 */
	public Account[] sortByNameAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getOwner().compareToIgnoreCase(accounts[j+1].getOwner())>0) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
		return accounts;
	}
	/*
	 * 계좌를 이름순으로 내림차순정렬
	 */
	
	public Account[] sortByNameDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getOwner().compareToIgnoreCase(accounts[j+1].getOwner())<0) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
		return accounts;
	}
	/*
	 * 계좌를 계좌번호순으로 오름차순정렬
	 */
	public Account[] sortByAccountNumberAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getNo() > accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
		return accounts;
	}
	/*
	 * 계좌를 계좌번호순으로 내림차순정렬
	 */
	
	public Account[] sortByAccountNumberDescending() {	
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getNo() < accounts[j+1].getNo()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
		return accounts;
	}
	/*
	 * 계좌를 이율순으로 오름차순정렬 
	 */
	public Account[] sortByIyulAscending() {
		for (int i = 1; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-i; j++) {
				if(accounts[j].getIyul() > accounts[j+1].getIyul()) {
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1] = tempAccount;
				}
			}
		}
		return accounts;
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
	 * 12.계좌객체를 인자로 받아서 이름,잔고,이율 수정(update)[OPTION]
	 */
	public void updateAccount(Account updateAccount) {
		for(int i =0; i<accounts.length;i++) {
			if(accounts[i].getNo() == updateAccount.getNo()) {
				accounts[i] = updateAccount;
				break;
			}
		}
	}

	/*
	 * 13.번호,이름,잔고,이율 인자로받아서 계좌객체수정(update)[OPTION]
	 */
	public void updateAccount(int no, String owner, int balance, double iyul) {
		for(int i =0; i<accounts.length;i++) {
			if(accounts[i].getNo() == no) {
				accounts[i].setAccountData(no, owner, balance, iyul);
				break;
			}
		}
	}
	/*
	 * 14.계좌번호 인자로받아서 삭제해줘[OPTION] 
	 * 	A. 배열에서 Account객체삭제 
	 * 	B. 배열사이즈감소
	 *  C. 삭제한계좌객체반환
	 *  
	 */
	public Account deleteByNo(int no) {
		Account deleteAccount = null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo()==no) {
				deleteAccount=accounts[i];
				accounts[i]=null;
				break;
			}
		}
		Account[] tempAccounts = new Account[accounts.length-1];
		int tempIndex = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i]!=null && tempIndex!=accounts.length-1) {
				tempAccounts[tempIndex] = accounts[i];
				tempIndex++;
			}else if(tempIndex==accounts.length-1) {
				System.out.println("조회하신 계좌는 없는 계좌입니다.");
			}
		}
		accounts = tempAccounts;
		
		return deleteAccount;
	}
	
}