package com.itwill.chobomungo.cart;

public class cartDaoTest {
	
	public static void main(String[] args) throws Exception {
		CartDao cartDao = new CartDao(); 
		
		
		// 1. insert
		int rowCount = cartDao.insertCart(3, "book1", 6); 
		System.out.println(rowCount);
		
		//2.update
		rowCount = cartDao.updateCart(2, "book1", 6);
		System.out.println(rowCount);
		
		//3.delete
		rowCount = cartDao.deleteCart("book1", 6);
		System.out.println(rowCount);
		
		
	}
	
}
