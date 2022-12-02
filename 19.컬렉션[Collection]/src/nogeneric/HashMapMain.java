package nogeneric;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap = new HashMap();
		System.out.println("#map size : "+carMap.size());
		System.out.println(carMap);
		System.out.println("****************** 1.put ******************");
		Car c1 = new Car("1111",12);
		carMap.put(c1.getNo(), c1);
		carMap.put("2222",new Car("2222",13));
		carMap.put("3333",new Car("3333",12));
		carMap.put("4444",new Car("4444",15));
		carMap.put("5555",new Car("5555",14));
		
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		/*
		 * 동일한 키값이 존재하지않는다[키객체중복허영안됨] 
		 */
		carMap.put("3333", new Car("삼삼삼삼",13));
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
	
		System.out.println("**************** 2.get(Key) *****************");
		Car getCar = (Car)carMap.get("3333");
		getCar.printReceipt();
		System.out.println("**************** 3.remove(Key) *****************");
		Car removeCar = (Car)carMap.remove("3333");
		removeCar.printReceipt();
		System.out.println("#map size: "+carMap.size());
		System.out.println(carMap);
		System.out.println("---------------- 전체차량출력 -----------------");
		Set entrySet = carMap.entrySet();
		for (Object entryObject  : entrySet) {
			Entry entry = (Entry)entryObject;
			String key = (String)entry.getKey();
			Car car = (Car)entry.getValue();
			car.printReceipt();
		}
		
		System.out.println("################ 차량전체출력[iteration] #################");
		
		
	}
}
