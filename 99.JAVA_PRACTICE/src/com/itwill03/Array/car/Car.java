package com.itwill03.Array.car;

public class Car {
	/*
	클래스의 구성요소
	   1. 멤버필드(변수)[속성] (차객체의 속성데이타를 저장할변수)
	   2. 생성자메쏘드
	   3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	*/
	
	//1.멤버필드(변수)[속성]
	private String no;//차량번호
	private int inTime;//입차시간
	private int outTime;//출차시간
	private int fee;//주차요금
	
	//2. 생성자메쏘드
	public Car() {
		
	}
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	//3. 멤버메쏘드[기능](차객체가 가지고있는 기능 )
	/*
	 *  입차시데이타(번호,입차시간)대입
	 */
	public void setIpChaData(String no,int inTime) {
		/*
		this.no = no;
		this.inTime=inTime;
		*/
		this.setNo(no);
		this.setInTime(inTime);
	}
	
	/*
	 * 요금계산
	 */
	public void calculateFee() {
		this.fee  =(this.outTime-this.inTime)*1000;
	}
	
	public static void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s%n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	/*
	 * 차량정보출력
	 */
	public  void print() {
		System.out.printf("%7s %7d %9d %8d%n",this.no,this.inTime,this.outTime,this.fee);
		return;
	}
	//setter,getter
	/*
	 * 출차시간 대입
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	
	
}