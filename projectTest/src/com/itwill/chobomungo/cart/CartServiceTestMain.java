package com.itwill.chobomungo.cart;

public class CartServiceTestMain {

	public static void main(String[] args) throws Exception {
		CartService cartService = new CartService();
		
		//1.카트에 상품 담기
		System.out.println("1.카트에물건담기");
		System.out.println(">> "+cartService.saveCart(3, "book1", 6)+"개"+"저장");
		
		//2.카트 상품 개수 수정
		System.out.println("2.카트에 상품개수 수정");
		int qty=2;
		System.out.println(">> "+cartService.updateCart(qty, "book1", 6)+"개 상품"+qty+"갯수로 "+"수정");
		
		//3.카트 상품 삭제
		System.out.println("");
		
	}
}
