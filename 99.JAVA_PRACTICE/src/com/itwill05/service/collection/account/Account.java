package com.itwill05.service.collection.account;
/*
 * 계좌객체를 생성하기위한 클래스
 */
public class Account implements Comparable<Account>{
	
	/*
	 * 멤버필드 private
	 */
	private int no;//계좌번호
	private String owner;//계좌주
	private int balance;//잔고
	private double iyul;//이율
	/*
	 * 기본생성자(인자0개)
	 */
	
	public Account() {
		//System.out.println("public Account() 기본생성자");
	}
	/*
	 * 생성자(인자4개)
	 */
	public Account(int no,String owner,int balance,double iyul) {
		//System.out.println("public Account(int no,String owner,int balance,double iyul) 생성자");
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	
	/*
	 멤버메쏘드 public
	 */
	//계좌데이타를 set하는 메쏘드
	public void setAccountData(int no,String owner,
						int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	//입금
	public void deposit(int m) {
		this.balance=this.balance+m;
	}
	//출금
	public void withDraw(int m) {
		this.balance=this.balance-m;
	}
	//계좌헤더출력
	public static void headerPrint() {
		System.out.printf("%s\n","---------------------------");
		System.out.printf("%s %5s %4s %4s\n","번호","이름","잔고","이율");
		System.out.printf("%s\n","---------------------------");
	}
	//계좌객체의 정보출력
	public void print() {
		System.out.printf("%d %6s %8d %5.1f \n",
				this.no,this.owner,this.balance,this.iyul);
	}
	/***************getter setter********************/
	/*
	 * 멤버필드의 값을 set(대입),get(참조)하기위한 메쏘드
	 */
	//객체의 잔고필드값를 반환(get)하는메쏘드
	public int getBalance() {
		int b=this.balance;
		return b;
	}
	//객체의 이율을 변경(set)하는메쏘드
	public void setIyul(double iyul) {
		this.iyul=iyul;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getIyul() {
		return iyul;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public int compareTo(Account nextAccount) {
		return getBalance()-nextAccount.getBalance();
	}
	
	
}