package com.itwill.shop.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.shop.common.DataSource;
import com.itwill.shop.product.Product;

public class OrderDao {
	
	private DataSource dataSource;
	public OrderDao() throws Exception {
		dataSource=new DataSource();
	}
	/*
	 * 주문전체삭제(ON DELETE CASCADE)
	 */
	public int deleteByUserId(String sUserId)throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(OrderSQL.ORDER_DELETE_BY_USERID);
			pstmt.setString(1, sUserId);
			rowCount = pstmt.executeUpdate();
			con.commit();
		}catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	
	
	/*
	 * 주문1건삭제(ON DELETE CASCADE)
	 */
	public int deleteByOrderNo(int o_no)throws Exception{
		
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(OrderSQL.ORDER_DELETE_BY_O_NO);
			pstmt.setInt(1, o_no);
			rowCount= pstmt.executeUpdate();
			con.commit();
		}catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	/*
	 * 주문생성
	 */
	public int insert(Order order) throws Exception{
		/*
		insert into orders(o_no,o_desc,o_date,o_price,userid) values (orders_o_no_SEQ.nextval,'비글외1종',sysdate-2,1050000,'guard1');
		insert into order_item(oi_no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ.nextval,1,orders_o_no_SEQ.currval,1);
		*/
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt1=con.prepareStatement(OrderSQL.ORDER_INSERT);
			pstmt1.setString(1, order.getO_desc());
			pstmt1.setInt(2, order.getO_price());
			pstmt1.setString(3, order.getUser_id());
			pstmt1.executeUpdate();
			
			pstmt2=con.prepareStatement(OrderSQL.ORDERITEM_INSERT);
			for(OrderItem orderItem:order.getOrderItemList()) {
				pstmt2.setInt(1, orderItem.getOi_qty());
				pstmt2.setInt(2, orderItem.getProduct().getP_no());
				pstmt2.executeUpdate();
			}
			con.commit();
		}catch (Exception e) {
			e.printStackTrace();
			con.rollback();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return 0;
	}
	
	
	/*
	 * 주문전체(특정사용자)
	 */
	public ArrayList<Order> findByUserId(String sUserId) throws Exception{
		ArrayList<Order> orderList=new ArrayList<Order>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_BY_USERID);
			pstmt.setString(1,sUserId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				orderList.add(new Order(rs.getInt("o_no"),
										rs.getString("o_desc"),
								       rs.getDate("o_date"),
								       rs.getInt("o_price"),
								       rs.getString("userid")));
			}
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return orderList;
	}
	
	
	/*
	 * 주문1개보기(주문상세리스트)
	 */
	public Order findByOrderNo(String sUserId,int o_no)throws Exception{
		
		Order order=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		con=dataSource.getConnection();
		pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_WITH_PRODUCT_BY_USERID);
		pstmt.setString(1,sUserId);
		pstmt.setInt(2,o_no);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			order=new Order(rs.getInt("o_no"),
							rs.getString("o_desc"),
							rs.getDate("o_date"),
							rs.getInt("o_price"),
							rs.getString("userId"));		
			do{
				order.getOrderItemList()
					.add(new OrderItem(rs.getInt("oi_no"),
									   rs.getInt("oi_qty"),
									   rs.getInt("o_no"),
									   new Product(rs.getInt("p_no"),
											   	   rs.getString("p_title"),
											   	   rs.getInt("p_price"),
											   	   rs.getString("p_image"),
											   	   rs.getString("p_desc"),
											   	   rs.getInt("p_click_count"))
							));				
			}while(rs.next());
		}
		return order;
	}
	
	
}