package com.itwill.chobomungo.order;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.itwill.chobomungo.cart.Cart;
import com.itwill.chobomungo.cart.CartDao;
import com.itwill.chobomungo.product.Product;
import com.itwill.chobomungo.product.ProductDao;
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
		Product product=productDao.findByNo(p_no);
		
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem(0, p_qty, p_no, product));
		
		Orders newOrder=new Orders(0,product.getP_title()+"외 0종" ,  product.getP_price(), new Date(0), new User("book1",null,null,null,null,null));
		newOrder.setOrderItemList(orderItemList);
		orderDao.insert(newOrder);
		*/
		/*
		 * 2.cart에서 주문
		 */
		/*
		int o_price = 0;
		String o_desc=null;
		Cart tempCart = new Cart(0,2,"book2",null);
		CartDao cartDao	= new CartDao();
		List<Cart> cartList = new ArrayList<Cart>();
		cartList = cartDao.findByUserId(tempCart);
		
		orderItemList = new ArrayList<OrderItem>();
		for (Cart cart : cartList) {
			orderItemList.add(new OrderItem(0,cart.getCart_qty(),cart.getProduct().getP_no(),cart.getProduct()));
			int tempPrice = cart.getCart_qty()*cart.getProduct().getP_price();
			o_price += tempPrice;
			String tempDesc = cart.getProduct().getP_title();
			o_desc += tempDesc+", ";
		}
		Orders newOrder2 = new Orders(0, o_desc,  o_price, new Date(0), new User("book2",null,null,null,null,null));
		newOrder2.setOrderItemList(orderItemList);
		orderDao.insert(newOrder2);
		
		// UserId 주문 전체 삭제
		int count = orderDao.deleteByUserId(newOrder2);
		System.out.println(">> 주문삭제 : "+count);
		
		//orderno로 주문 1개삭제
		count = orderDao.deleteByOrderNo(newOrder);
		System.out.println(">> 주문삭제 : "+count);
		
		//주문목록
		orderDao.findByOrderNo(newOrder2);
		*/
	}

}