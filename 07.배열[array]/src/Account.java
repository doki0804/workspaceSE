/*
 * 계좌객체를 생성하기위한 클래스(틀,타입)
 */
public class Account implements Comparable<Account> {
	/*
	 * 1.속성[멤버필드(변수)]
	 */
	private int no; 	  // 계좌번호
	private String owner; // 계좌주이름
	private int balance;  // 잔고
	private double iyul;  // 이율
	
	public Account() {
	}
	
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}


	/*
	 * 2.기능[멤버메쏘드]-계좌객체가 가지고있는 기능
	 */
	/*
	 * 계좌데이타를 초기값으로 대입하는메쏘드
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no = no; this.owner = owner; this.balance = balance; this.iyul = iyul;
	}
	
	/*
	 * 입금
	 */
	public void deposit(int money) {
		this.balance += money;
	}

	/*
	 * 출금
	 */
	public void withDraw(int money) {
		this.balance -= money;
	}
	/*
	 *계좌헤더출력 
	 */
	public static void headerPrint() {
		System.out.println("----------------------");
		System.out.printf("%s %s  %s %s\n","번호","이름","잔고","이율");
		System.out.println("----------------------");		
	}
	/*
	 * 계좌객체정보출력
	 */
	public void printAccountData() {
		System.out.printf("%2d %5s %6d %4.1f\n",no,owner,balance,iyul);
	}
	/*
	 * set/get
	 */

	
	
	/**
	 * @param no
	 */
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	/*
	 * 외부에서 balance에 접근하지 못함
	public void setBalance(int balance) {
  		this.balance = balance;
	}
	*/
	
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	public int getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public double getIyul() {
		return iyul;
	}
	
	public String getOwner() {
		return owner;
	}

	@Override
	public int compareTo(Account nextAccount) {
		/*
		if(this.getBalance() > nextAccount.getBalance()) {
			return 1;
		}else {
			return -1;
		}
		*/
		/*
		return this.getBalance() > nextAccount.getBalance() ? 1 :
			this.getBalance() < nextAccount.getBalance() ? -1 : 0;
		*/
		/*
		String ownerCurrent = this.getOwner();
		String ownerNext = nextAccount.getOwner();
		
		if(ownerCurrent.compareTo(ownerNext) > 0) {
			return 1;
		}else {
			return 0;
		}
		*/
		return getOwner().compareTo(nextAccount.getOwner()) > 0 ? 1 : 
			getOwner().compareTo(nextAccount.getOwner()) < 0 ? -1 : 0;
		
	}
}
