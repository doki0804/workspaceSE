package com.itwill.address;

import java.util.Iterator;
import java.util.List;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao4에서
		 * AddressDao4Main으로 데이터 리턴(전달)
		 */
		AddressDao addressDao = new AddressDao();
		System.out.println("1.insert");
		Address newAddress = new Address(0,"홍서범","111-3333","대구시민");
		int rowCount = addressDao.insert(newAddress);
		System.out.println(">> insert rowCount : "+rowCount);
		System.out.println("2.update");
		rowCount = addressDao.update(new Address(10,"김변경","000-0000","주소변경"));
		System.out.println(">> update rowCount : "+rowCount);
		System.out.println("3.delete");
		rowCount = addressDao.delete(new Address(16,"","",""));
		System.out.println(">> delete rowCount : "+rowCount);
		System.out.println("4.findByPrimaryKey");
		
		Address findAddress = addressDao.findByPrimaryKey(new Address(10,"","",""));
		if (findAddress!=null) {
			System.out.println(">> "+findAddress);
		}else {
			System.out.println(">> 조건에 만족하는 주소록 존재안함"+findAddress);
		}
		System.out.println(addressDao.findByPrimaryKey(new Address(1,"","","")));
		System.out.println(addressDao.findByPrimaryKey(new Address(2,"","","")));
		System.out.println(addressDao.findByPrimaryKey(new Address(3,"","","")));
		
		System.out.println("5.findAll");
		List<Address> addressList = addressDao.findAll();
		System.out.println(">> "+addressList);
	}

}
