
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("*****************c1*****************");
		Car car1 = new Car();
		car1.setInTime("1234", 12);
		car1.setOutTime(14);
		car1.calculateFee();
		car1.printReceipt();
		
		System.out.println("*****************c2*****************");
		Car car2 = new Car("3453",15);
		car2.setOutTime(17);
		car2.calculateFee();
		car2.printReceipt();
		
		System.out.println("*****************오늘주차장이용차량출력*****************");
		Car cara = new Car("2222",12,16,4000);
		Car carb = new Car("3333",12,15,3000);
		Car carc = new Car("4444",14,20,6000);
		
		cara.headerPrint();
		cara.printReceipt();
		carb.printReceipt();
		carc.printReceipt();
	}

}
