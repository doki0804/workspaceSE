package com.itwill.address;

import java.util.List;

public class AddressService {
	private AddressDao addressDao;
	
	public AddressService() throws Exception {
		addressDao = new AddressDao(); 
	}
	/*
	 * 주소록쓰기
	 */
	public int AddressWrite(Address newAddress) throws Exception {
		return addressDao.insert(newAddress); 
	}
	/*
	 * 주소록 번호로 1개보기
	 */
	public Address addressDetail(int no) throws Exception {
		return addressDao.findByPrimaryKey(no);
	}
	/*
	 * 주소록 번호로 1개로 수정
	 */
	public int addressUpdate(Address updateAddress) throws Exception {
		return addressDao.update(updateAddress);
	}
	
	/*
	 * 주소록 번호로 삭제하기
	 */
	public int addressDelete(int no) throws Exception {
		return addressDao.delete(no);
	}
	/*
	 * 주소록 전체보기
	 */
	public List<Address> addressAll() throws Exception {
		return addressDao.findAll();
	}
	
}
