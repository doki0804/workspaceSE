package com.itwill.chobomungo.cart;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itwill.chobomungo.common.DataSource;
import com.itwill.chobomungo.product.Product;

public class CartDao {
	
	private DataSource dataSource;
	
	public CartDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public int countByProductNo(String user_id, int p_no) throws Exception {
		
		int count = 0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_COUNT_BY_USERID_PRODUCT_NO);
		pstmt.setString(1, user_id);
		pstmt.setInt(2, p_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			count=rs.getInt(1);
		}
		pstmt.close();
		dataSource.close(con);
		return count;
	}
	
	public int insert(int cart_qty, String user_id, int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_INSERT_SQL);
		pstmt.setInt(1, cart_qty);
		pstmt.setString(2, user_id);
		pstmt.setInt(3, p_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;	
	}
	/*
	 * 
	 */
	public int updateByCartNo(int cart_qty, int cart_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_BY_CART_NO_SQL);
		pstmt.setInt(1, cart_qty);
		pstmt.setInt(2, cart_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
		
	}
	/*
	 * 	 상품에서 카트 추가시
	 */
	public int updateByUserIdProductNo(int cart_qty, String user_id, int p_no) throws Exception {
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_BY_PRODUCT_NO_USER_ID_SQL);
		pstmt.setInt(1, cart_qty);
		pstmt.setString(2, user_id);
		pstmt.setInt(3, p_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}

	public int deleteByCartNo(int cart_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE_BY_CART_NO_SQL);
		pstmt.setInt(1, cart_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int deleteByUserId(String user_id) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE_BY_USER_ID_SQL);
		pstmt.setString(1, user_id);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public List<Cart> findByUserId(String user_id) throws Exception {
		List<Cart> cartList = new ArrayList<Cart>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_BY_USER_ID_SQL);
		pstmt.setString(1,user_id);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			do {
				cartList.add(new Cart(rs.getInt("cart_no"),
						rs.getInt("cart_qty"),
						rs.getString("user_id"),
						new Product(rs.getInt("p_no"),
								rs.getString("p_title"),
								rs.getInt("p_price"),
								rs.getString("p_image"),
								rs.getString("p_desc")))
						);
			} while (rs.next());
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return cartList;
	}
	
	public Cart findByCartNo(int cart_no) throws Exception {
		Cart tempCart = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_BY_CART_NO_SQL);
		pstmt.setInt(1,cart_no);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			tempCart = new Cart(rs.getInt("cart_no"),
								rs.getInt("cart_qty"),
								rs.getString("user_id"),
								new Product(rs.getInt("p_no"),
											rs.getString("p_title"),
											rs.getInt("p_price"),
											rs.getString("p_image"),
											rs.getString("p_desc"))
								);
		}
		rs.close();
		pstmt.close();
		dataSource.close(con);
		return tempCart;
	}
	
}
