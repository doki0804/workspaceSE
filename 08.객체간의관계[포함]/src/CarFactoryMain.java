
public class CarFactoryMain {

	public static void main(String[] args) {
		/*
		 * 자동차공장
		 */
		/*
		Engine audiEngine = new Engine();
		audiEngine.type = "A";
		audiEngine.cc = 3000;
		
		Car audiCar=new Car();
		audiCar.no = 1234;
		audiCar.model = "AUDI";
		audiCar.engine = audiEngine;
		System.out.println(audiCar.no+"\t"+audiCar.model+"\t"+audiCar.engine.type+"\t"+audiCar.engine.cc);
		*/
		
		Engine audiEngine = new Engine();
		audiEngine.setType("A");
		audiEngine.setCc(3000);
		
		Car audiCar = new Car();
		audiCar.setNo(1234);
		audiCar.setModel("Audi");
		audiCar.setEngine(audiEngine);
		audiCar.print();
		
		System.out.println("----차량엔진검사----");
		Engine returnEngine = audiCar.getEngine();
		returnEngine.print();
		
		Car benzCar=new Car(8899, "지바겐", new Engine("Y", 5000));
		benzCar.print();
		System.out.println("----차량엔진검사----");
		benzCar.getEngine().print();
		
	}

}
