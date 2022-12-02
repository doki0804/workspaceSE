/*
 * 계좌객체를 생성하기위한 클래스(틀,타입)
 */
/**
 * 계좌객체생성 클래스
 * @author KIM
 * @version 1.0
 */
public class Account {
	/*
	 * 1.속성[멤버필드(변수)]
	 */
	/**
	 * 
	 */
	private int no; 	  // 계좌번호
	private String owner; // 계좌주이름
	private int balance;  // 잔고
	private double iyul;  // 이율
	
	public Account() {
		
	}
	
	public Account(int no, String owner) {
		this.no = no; this.owner = owner;
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
	/**
	 * 입금메쏘드
	 * @param money 입금할 돈
	 */
	public void deposit(int money) {
		this.balance += money;
	}

	/*
	 * 출금
	 */
	/**
	 * 출금메쏘드
	 * @param money 출금할 돈
	 */
	public void withDraw(int money) {
		this.balance -= money;
	}
	/*
	 *계좌헤더출력 
	 */
	public void headerPrint() {
		System.out.println("----------------------");
		System.out.printf("%s %s  %s %s\n","번호","이름","잔고","이율");
		System.out.println("----------------------");		
	}
	/*
	 * 계좌객체정보출력
	 */
	public void printAccountData() {
		System.out.printf("%d %2s %6d %.1f\n",no,owner,balance,iyul);
	}
	/*
	 * set/get
	 */

	public void setNo(int no) {
		this.no = no;
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
	
	/**
	 * 
	 * @return 계좌소유주 이름
	 */
	public String getOwner() {
		return owner;
	}
	
}
