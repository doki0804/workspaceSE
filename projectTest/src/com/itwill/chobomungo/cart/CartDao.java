package com.itwill.chobomungo.cart;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itwill.chobomungo.common.DataSource;
import com.itwill.chobomungo.product.Product;

public class CartDao {
	
	private DataSource dataSource;
	
	public CartDao() throws Exception {
		dataSource = new DataSource();
	}
	
	public int insertCart(int c_qty, String user_id, int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.INSERT_CART_SQL);
		pstmt.setInt(1, c_qty);
		pstmt.setString(2, user_id);
		pstmt.setInt(3,p_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
		
	}
	
	public int updateCart(int c_qty, String user_id, int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.UPDATE_CART_SQL);
		pstmt.setInt(1, c_qty);
		pstmt.setString(2, user_id);
		pstmt.setInt(3, p_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
		
	}
	
	public int deleteCart(String user_id,int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.DELETE_CART_SQL);
		pstmt.setString(1, user_id);
		pstmt.setInt(2, p_no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	public Cart findByP_NoCart(String user_id, int p_no) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(CartSQL.FIND_BY_P_NO_CART_SQL);
		pstmt.setString(1,user_id);
		pstmt.setInt(2, p_no);
		ResultSet rs = pstmt.executeQuery();
		Cart tempCart = null;
		if(rs.next()) {
			tempCart.setCart_no(rs.getInt("cart_no"));
			tempCart.setCart_qty(rs.getInt("cart_qty"));
			tempCart.setUser_id(rs.getString("user_id"));
			tempCart.setProduct(new Product());
		}
		
		return tempCart;
	}
}
