package com.itwill.shop.test;

import java.sql.Date;
import java.util.ArrayList;

import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderDao;
import com.itwill.shop.order.OrderItem;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;

public class OrderDaoTestMain {

	public static void main(String[] args) throws Exception{
		OrderDao orderDao=new OrderDao();
		/*
		System.out.println(orderDao.findByUserId("guard1"));
		System.out.println(orderDao.findByOrderNo("guard1",1));
		*/
		/*
		 * 1.상품에서직접주문
		 */
		int p_qty=1;
		int p_no=1;
		ProductDao productDao=new ProductDao();
		Product product=productDao.findByPrimaryKey(p_no);
		
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
		
		Order newOrder=new Order(0,product.getP_name()+"외 0종" , new Date(0), product.getP_price(), "guard3");
		orderDao.insert(newOrder);
		System.out.println(orderDao.findByUserId("guard3"));
		
		/*
		 * 2.cart에서 주문
		 */
		
		
		
	}

}