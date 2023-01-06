package com.itwill.chobomungo.cart;

import com.itwill.chobomungo.product.Product;

public class cartDaoTest {
	
	public static void main(String[] args) throws Exception {
		CartDao cartDao = new CartDao(); 
		Product product = new Product();
		Cart cart = new Cart(1,2,"book1",new Product(1,"",0,"","",0));
		//1.담긴물건이있는지 count
		int count = cartDao.countByProductNo(cart);
		System.out.println(count);
		
		
	}
	
}
