package generic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapGenericMain {
	
	public static void main(String[] args) {
		
		HashMap<String, Car> carMap = new HashMap<String, Car>(); 
		System.out.println("------------1.put(key,value)-------------");
		carMap.put("1111", new Car("1111",12));
		carMap.put("2222", new Car("2222",13));
		carMap.put("3333", new Car("3333",14));
		carMap.put("4444", new Car("4444",15));
		carMap.put("5555", new Car("5555",16));
		System.out.println("# map size : "+carMap.size());
		System.out.println(carMap);
		carMap.put("3333", new Car("삼삼삼삼",19));
		System.out.println("------------2.get(key)-------------");
		Car getCar = carMap.get("3333");
		getCar.printReceipt();
		carMap.get("5555").printReceipt();
		if(carMap.containsKey("1111")) {
			carMap.get("1111").printReceipt();
		}else {
			System.out.println("1111키 존재안함");
		}
		System.out.println("------------3.remove(key)-------------");
		Car removeCar = carMap.remove("3333");
		removeCar.printReceipt();
		System.out.println("# map size: "+carMap.size());
		System.out.println(carMap);
		
		System.out.println("%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%");
		System.out.println("------------전체차량출력-------------");
		Set<Entry<String,Car>> entrySet = carMap.entrySet();
		for (Entry<String,Car> entry : entrySet) {
			String key = entry.getKey();
			Car car = entry.getValue();
			System.out.println(key);
			car.printReceipt();
		}
		
		System.out.println(carMap.keySet());
		System.out.println("2.입차");
		Car newCar = new Car("2356",21);
		if(carMap.containsKey("2356")==false) {
			carMap.put(newCar.getNo(),newCar); 
		}
		System.out.println("3.차량번호 2356번 차량한대찾기");
		Car findCar = carMap.get("2356");
		findCar.printReceipt();
		
		System.out.println("4.입차시간 15시이후의 차량 여러대 찾기");
		for (Entry<String, Car> entry : entrySet) {
			if(entry.getValue().getInTime()>=15) {
				entry.getValue().printReceipt();
			}
		}
		System.out.println("5.2356번차량 24시 출차");
		Car outCar = carMap.get("2356");
		outCar.setOutTime(24);
		outCar.calculateFee();
		Car.headerPrint();
		outCar.printReceipt();
		
		
		
		
 	}
}
