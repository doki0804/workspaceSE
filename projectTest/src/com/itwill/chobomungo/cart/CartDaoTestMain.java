package com.itwill.chobomungo.cart;

import java.util.List;

import com.itwill.chobomungo.product.Product;


public class CartDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		CartDao cartDao=new CartDao();
		/*
		System.out.println("1.add(insert)");
		Cart addCart=new Cart(0,1,"book3",new com.itwill.chobomungo.product.Product(8, null, 0, null, null, 0));
		int rowCount=-999;
		rowCount =cartDao.insert(addCart);
		System.out.println(">> "+rowCount);
		*/
		/*
		rowCount = cartDao.add(addCart);
		System.out.println(">> "+rowCount);
		*/
		/*
		System.out.println("2.updateByCartNo");
		int rowCount=cartDao.updateByCartNo(new Cart(1,3,null,null));
		System.out.println(">> "+rowCount);
		*/
		System.out.println("2.updateByProductNoAndUserId");
		int rowCount=cartDao.updateByUserIdProductNo(new Cart(0, 4, "book1", new Product(2,null,0,null,null,0)));
		System.out.println(">> "+rowCount);
		
		System.out.println("3.delete");
		rowCount=cartDao.deleteByCartNo(new Cart(9,0,null,null));
		System.out.println(">> "+rowCount);
		System.out.println("4.cartList[select]");
		List<Cart> cartList1=cartDao.findByUserId(new Cart(0,0,"book1",null));
		System.out.println("guard1-->"+cartList1);
		List<Cart> cartList2=cartDao.findByUserId(new Cart(0,0,"book2",null));
		System.out.println("guard2-->"+cartList2);
		System.out.println("5.selectProductCount");
		int productCount1=cartDao.countByProductNo(new Cart(0,0,"book1",new Product(2,null,0,null,null,0)));
		System.out.println(">> "+productCount1);
		
	}
}