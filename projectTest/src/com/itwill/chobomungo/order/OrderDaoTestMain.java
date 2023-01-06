package com.itwill.chobomungo.order;

import java.sql.Date;
import java.util.ArrayList;

import com.itwill.chobomungo.user.User;

public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception{
		
		OrderDao orderDao=new OrderDao();
		System.out.println(orderDao.findByUserID(new Orders(0,null,0,null,new User("book1",null,null,null,null,null))));
		System.out.println(orderDao.findByOrderNo(new Orders(1,null,0,null,new User("book1",null,null,null,null,null))));
		
		/*
		 * 1.상품에서직접주문
		 */
		/*
		int p_qty=1;
		int p_no=1;
		ProductDao productDao=new ProductDao();
		Product product=productDao.findByPrimaryKey(p_no);
		
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
		
		Order newOrder=new Order(0,product.getP_name()+"외 0종" , new Date(0), product.getP_price(), "guard3");
		orderDao.insert(newOrder);
		System.out.println(orderDao.findByUserId("guard3"));
		*/
		/*
		 * 2.cart에서 주문
		 */
		
		
		
	}

}