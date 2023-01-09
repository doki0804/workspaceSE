package com.itwill.chobomungo.cart;

import java.util.List;

import com.itwill.chobomungo.product.Product;


public class CartDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		CartDao cartDao=new CartDao();

		System.out.println("1.add(insert)");
		Cart addCart=new Cart(0,1,"book3",new Product(8, null, 0, null, null));
		int rowCount=-999;
		rowCount =cartDao.insert(1,addCart.getUser_id(),8);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.updateByCartNo");
		rowCount=cartDao.updateByCartNo(1,3);
		System.out.println(">> "+rowCount);
		
		System.out.println("2.updateByProductNoAndUserId");
		rowCount=cartDao.updateByUserIdProductNo(4,"book1",1);
		System.out.println(">> "+rowCount);
		
		System.out.println("3.delete");
		//rowCount=cartDao.deleteByCartNo(10);
		System.out.println(">> "+rowCount);
		
		System.out.println("4.cartList[select]");
		List<Cart> cartList1=cartDao.findByUserId("book1");
		System.out.println("book1-->"+cartList1);
		List<Cart> cartList2=cartDao.findByUserId("book2");
		System.out.println("book2-->"+cartList2);
		System.out.println("5.selectProductCount");
		int productCount1=cartDao.countByProductNo("book2",4);
		System.out.println(">> "+productCount1);
	}
}