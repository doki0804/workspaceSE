
public class CarMemberMethodMain {

	public static void main(String[] args) {

		Car car1 = new Car();
		/*
		 * car 클래스에 멤버필드와 멤버메쏘드를 구성하여 메인에서는 데이터입력만 한후 호출
		 */
		car1.setInTime("1234",12); // 입차시데이타 대입 메쏘드 호출
		car1.setOutTime(16); // 출차시데이타 대입 메쏘드 호출
		car1.calculateFee();//주차요금계산 메쏘드 호출
		car1.printReceipt();//영수증프린트 메쏘드 호출


	}

}
