package dao.address.fourth;

import java.util.Iterator;
import java.util.List;

public class AddressDao4TestMain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao4에서
		 * AddressDao4Main으로 데이터 리턴(전달)
		 */
		AddressDao4 addressDao4 = new AddressDao4();
		System.out.println("1.insert");
		Address newAddress = new Address(0,"홍진경","111-3333","대구시민");
		int rowCount = addressDao4.insert(newAddress);
		System.out.println(">> insert rowCount : "+rowCount);
		System.out.println("2.update");
		rowCount = addressDao4.update(new Address(10,"김변경","000-0000","주소변경"));
		System.out.println(">> update rowCount : "+rowCount);
		System.out.println("3.delete");
		rowCount = addressDao4.delete(new Address(16,"","",""));
		System.out.println(">> delete rowCount : "+rowCount);
		System.out.println("4.findByPrimaryKey");
		
		Address findAddress = addressDao4.findByPrimaryKey(new Address(10,"","",""));
		if (findAddress!=null) {
			System.out.println(">> "+findAddress);
		}else {
			System.out.println(">> 조건에 만족하는 주소록 존재안함"+findAddress);
		}
		System.out.println(addressDao4.findByPrimaryKey(new Address(1,"","","")));
		System.out.println(addressDao4.findByPrimaryKey(new Address(2,"","","")));
		System.out.println(addressDao4.findByPrimaryKey(new Address(3,"","","")));
		
		System.out.println("5.findAll");
		List<Address> addressList = addressDao4.findAll();
		for (Address address : addressList) {
			System.out.println(">> "+address);
		}
	}

}
