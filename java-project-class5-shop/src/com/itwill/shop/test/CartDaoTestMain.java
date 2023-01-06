package com.itwill.shop.test;

import java.util.List;

import com.itwill.shop.cart.CartDao;
import com.itwill.shop.cart.Cart;
import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class CartDaoTestMain {

	public static void main(String[] args) throws Exception {
		
		CartDao cartDao=new CartDao();
		/*
		System.out.println("1.add(insert)");
		Cart addCart=new Cart(0,1,"guard1",new Product(8, null, 0, null, null, 0));
		int rowCount=-999;
		*/
		/*
		rowCount = cartDao.add(addCart);
		System.out.println(">> "+rowCount);
		*/
		/*
		System.out.println("2.updateByCartNo");
		rowCount=cartDao.updateByCartNo(8,5);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.updateByProductNoAndUserId");
		rowCount=cartDao.updateByProductNo("guard1",3,2);
		System.out.println(">> "+rowCount);
		
		System.out.println("3.delete");
		rowCount=cartDao.deleteByCartNo(8);
		System.out.println(">> "+rowCount);
		*/
		System.out.println("4.cartList[select]");
		List<Cart> cartList1=cartDao.findByUserId("book1");
		System.out.println("guard1-->"+cartList1);
		List<Cart> cartList2=cartDao.findByUserId("guard2");
		System.out.println("guard2-->"+cartList2);
		List<Cart> cartList3=cartDao.findByUserId("guard3");
		System.out.println("guard3-->"+cartList3);
		System.out.println("5.selectProductCount");
		int productCount1=cartDao.countByProductNo("guard1",8 );
		System.out.println(">> "+productCount1);
		int productCount2=cartDao.countByProductNo("guard1",3 );
		System.out.println(">> "+productCount2);
		
	}
}