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
	
	public int countByProductNo(Cart cart) throws Exception {
		int count = 0;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_COUNT_BY_USERID_PRODUCT_NO);
		pstmt.setString(1, cart.getUser_id());
		pstmt.setInt(2, cart.getProduct().getP_no());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			count=rs.getInt(1);
		}
		pstmt.close();
		dataSource.close(con);
		return count;
	}
	
	public int insert(Cart cart) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_INSERT_SQL);
		pstmt.setInt(1, cart.getCart_qty());
		pstmt.setString(2, cart.getUser_id());
		pstmt.setInt(3, cart.getProduct().getP_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
		
	}
	/*
	 * 
	 */
	public int updateByCartNo(Cart cart) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_BY_CART_NO_SQL);
		pstmt.setInt(1, cart.getCart_qty());
		pstmt.setInt(2, cart.getCart_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
		
	}
	/*
	 * 	 상품에서 카트 추가시
	 */
	public int updateByUserIdProductNo(Cart cart) throws Exception {
		Connection con =dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_UPDATE_BY_PRODUCT_NO_USER_ID_SQL);
		pstmt.setInt(1, cart.getCart_qty());
		pstmt.setString(2, cart.getUser_id());
		pstmt.setInt(3, cart.getProduct().getP_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}

	public int deleteByCartNo(Cart cart) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE_BY_CART_NO_SQL);
		pstmt.setInt(1, cart.getCart_no());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public int deleteByUserId(Cart cart) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_DELETE_BY_USER_ID_SQL);
		pstmt.setString(1, cart.getUser_id());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		return rowCount;
	}
	
	public List<Cart> findByUserId(Cart cart) throws Exception {
		List<Cart> cartList = new ArrayList<Cart>();
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_BY_USER_ID_SQL);
		pstmt.setString(1,cart.getUser_id());
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
	
	public Cart findByCartNo(Cart cart) throws Exception {
		Cart tempCart = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.CART_SELECT_BY_CART_NO_SQL);
		pstmt.setInt(1,cart.getCart_no());
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
