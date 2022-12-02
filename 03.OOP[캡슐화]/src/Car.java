/*
 * 1. 주차자에서 차객체를 생성할 클래스(틀)
 * 2. Car객체의 주소를 저장할수있는 타입
 */
/**
 * 주차장에서 차객체를 생성할 클래스
 * @author KIM
 * @version 0.2
 */
public class Car {
	/*
	 * 클래스의 구성요소
	 *  1.멤버필드(변수)[속성]
	 *  2.멤버메쏘드[기능]
	 */
	/*
	 * 멤버필드[속성]
	 */
	private String no; 	 //차량번호
	private int inTime;  //입차시간
	private int outTime; //출차시간
	private int fee;	 //주차요금
	
	
	/*
	 * 입차시 데이타(번호,입차시간)대입(set)
	 */
	public void setInTime(String no,int inTime) {
		this.no = no; this.inTime = inTime;
		return;
	}
	/*
	 * 출차시 데이타(출차시간, 요금)대입
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
		return;
	}
	public void calculateFee() {
		this.fee = 1000*(outTime-inTime);
		return;
	}
	
	/*
	 * 차량정보출력
	 */
	public void printReceipt() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
		System.out.printf("%6s %7d %8d %9d\n",no,inTime,outTime,fee);
		return;
	}
	//setter,getter
	public String getNo() {
		return no;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public int getFee() {
		return fee;
	}
	
	 public int setFee(int fee) {
		 this.fee = fee;
		 return fee;
	}
	
	
}
