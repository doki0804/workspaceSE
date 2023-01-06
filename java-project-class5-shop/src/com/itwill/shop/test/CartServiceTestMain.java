package com.itwill.shop.test;

import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartService;
import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class CartServiceTestMain {

	public static void main(String[] args)throws Exception {
		CartService cartService=new CartService();
		
		System.out.println("1.add");
		int rowCount=cartService.addCart("guard1",8,1);
		System.out.println(">>"+rowCount);
		
		System.out.println("2.update");
		rowCount=cartService.updateCart(3,3);
		System.out.println(">>"+rowCount);
		System.out.println("3.deleteCartByCartNo");
		rowCount = cartService.deleteCartItemByCartNo(3);
		System.out.println(">>"+rowCount);
		System.out.println("4.cartList");
		List<Cart> cartList1=cartService.getCartItemByUserId("guard1");
		System.out.println("guard1-->"+cartList1);
		List<Cart> cartList2=cartService.getCartItemByUserId("guard2");
		System.out.println("guard2-->"+cartList2);
		List<Cart> cartList3=cartService.getCartItemByUserId("guard3");
		System.out.println("guard3-->"+cartList3);
		
		
	}

}