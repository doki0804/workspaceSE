package com.itwill.chobomungo.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itwill.chobomungo.cart.Cart;
import com.itwill.chobomungo.cart.CartDao;
import com.itwill.chobomungo.product.Product;
import com.itwill.chobomungo.product.ProductDao;
import com.itwill.chobomungo.user.User;

public class OrderDaoTestMain {
	
	public static void main(String[] args) throws Exception{
		OrderDao orderDao=new OrderDao();
		/*
		System.out.println(orderDao.findByUserID("book1"));
		System.out.println(orderDao.findByOrderNo(new Orders(1,null,0,null,new User("book1",null,null,null,null,null))));
		
		
		
		int p_qty=1;
		int p_no=3;
		ProductDao productDao=new ProductDao();
		Product product = productDao.findByNo(p_no);
		System.out.println(product);
		System.out.println();
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
		
		Orders newOrder=new Orders(0,product.getP_title()+"외 0종" ,  product.getP_price(), new Date(), new User("book1",null,null,null,null,null));
		newOrder.setOrderItemList(orderItemList);
		orderDao.insert(newOrder);
		
	
		int o_price = 0;
		String o_desc=null;
		String user_id = "book2";
		CartDao cartDao	= new CartDao();
		List<Cart> cartList = new ArrayList<Cart>();
		cartList = cartDao.findByUserId(user_id);
		System.out.println();
		orderItemList = new ArrayList<OrderItem>();
		for (Cart cart : cartList) {
			orderItemList.add(new OrderItem(0,cart.getCart_qty(),cart.getProduct().getP_no(),cart.getProduct()));
			int tempPrice = cart.getCart_qty()*cart.getProduct().getP_price();
			o_price += tempPrice;
			String tempDesc = cart.getProduct().getP_title();
			o_desc += tempDesc+", ";
		}
		System.out.println();
		Orders newOrder2 = new Orders(0, o_desc,  o_price, new Date(0), new User("book2",null,null,null,null,null));
		newOrder2.setOrderItemList(orderItemList);
		System.out.println(orderItemList);
		System.out.println("----------------------------");
		System.out.println(newOrder2);
		orderDao.insert(newOrder2);

		int count = orderDao.deleteByUserId(newOrder2);
		System.out.println(">> 주문삭제 : "+count);

		count = orderDao.deleteByOrderNo(newOrder);
		System.out.println(">> 주문삭제 : "+count);
		
	
		orderDao.findByOrderNo(newOrder2);
		*/
	}

}
