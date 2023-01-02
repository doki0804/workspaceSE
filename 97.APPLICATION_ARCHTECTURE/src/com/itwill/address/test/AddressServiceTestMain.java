package com.itwill.address.test;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

public class AddressServiceTestMain {

	public static void main(String[] args) throws Exception {
		AddressService addressService = new AddressService();
		/*
		 * 1.주소록쓰기
		 */
		Address newAddress = new Address(0,"가이드","111-1111","LA");
		System.out.println(">> "+ addressService.AddressWrite(newAddress));
		
		
	}

}
