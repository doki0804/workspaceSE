package com.itwill.chobomungo.order;

public class OrderServiceTestMain {
	public static void main(String[] args) throws Exception {
		OrderService orderService = new OrderService();
		// cart에서 주문
		orderService.create("book1");
		// 상품에서 직접주문
		orderService.create(3, 6, "book1");
		// 카트에서 선택주문
		
		String[] cart_no_select_array = {"3","4"};
		orderService.create("book2", cart_no_select_array);
		
		//주문 1개 삭제
		orderService.deleteOrderNo("book3", 11);
		//주문 전체삭제
		orderService.deleteUserId("book3");
		//주문목록
		orderService.orderList("book2");
		orderService.orderDetail("book2", 2);
		
	}
}
