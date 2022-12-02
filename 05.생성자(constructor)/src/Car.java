/*
 * 1. 주차자에서 차객체를 생성할 클래스(틀)
 * 2. Car객체의 주소를 저장할수있는 타입
 */
/**
 * 차객체를 생성하기위한 클래스
 * @author KIM
 * @version 1.0
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
	 * 생성자메쏘드[초기화]
	 */
	//멤버필드의 기본값을가진 차객체 생성
	/**
	 * 기본초기값을가진 차객체생성
	 */
	public Car() {
		
	}
	/*
	 * 차량번호, 입차시간을 인자로 받아
	 * 멤버필드의 값을 가진 차객체 생성
	 */
	/**
	 * 입차데이타로 초기화된 차객체생성
	 * @param no  	 차량번호
	 * @param inTime 입차시간
	 */
	public Car(String no, int inTime) {
		this.no = no; this.inTime = inTime;
	}
	/*
	 * 차량멤버데이타를 인자로 받아서
	 * 멤버필드의 값을 가진차객체생성
	 */
	/**
	 * 매게변수로 초기화된  차객체생성
	 * @param no	  차량번호
	 * @param inTime  입차시간
	 * @param outTime 출차시간
	 * @param fee	  주차요금
	 */
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no; this.inTime = inTime;
		this.outTime = outTime; this.fee = fee; 
	}
	/*
	 * 입차시 데이타(번호,입차시간)대입(set)
	 */
	/**
	 * 입차시 입차데이타 대입메쏘드
	 * @param no	 차량번호
	 * @param inTime 입차시간
	 */
	public void setInTime(String no,int inTime) {
		this.no = no; this.inTime = inTime;
		return;
	}
	/*
	 * 출차시 데이타(출차시간, 요금)대입
	 */
	/**
	 * 출차시 출차데이타 대입메쏘드
	 * @param outTime 출차시간
	 */
	public void setOutTime(int outTime) {
		this.outTime = outTime;
		return;
	}
	/**
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee = 1000*(outTime-inTime);
		return;
	}
	
	/*
	 * 차량정보출력
	 */
	public void headerPrint() {
		System.out.println("-----------------------------------");
		System.out.printf("%s %s %s %s\n","차량번호","입차시간","출차시간","주차요금");
		System.out.println("-----------------------------------");
	}
	public void printReceipt() {
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
	/**
	 * 
	 * @return 주차요금
	 */
	public int getFee() {
		return fee;
	}
	
	 public int setFee(int fee) {
		 this.fee = fee;
		 return fee;
	}
	@Override
	public String toString() {
		return "Car [no=" + no + ", inTime=" + inTime + ", outTime=" + outTime + ", fee=" + fee + ", toString()="
				+ super.toString() + "]";
	}
	
}
