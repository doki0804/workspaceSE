package com.itwill.shop.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.common.DataSource;
import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

public class CartDao {
	private DataSource dataSource;
	public CartDao() throws Exception{
		dataSource = new DataSource();
	}
	
	/*
	 * cart제품 존재여부
	 */
	public int  countByProductNo(String sUserId,int p_no) throws Exception{
		int count=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_COUNT_BY_USERID_PRODUCT_NO);
			pstmt.setString(1, sUserId);
			pstmt.setInt(2, p_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count=rs.getInt(1);
			}
			
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return count;
	}
	
	
	/*
	 * cart insert(cart)
	 */
	public int insert(Cart cart) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_INSERT);
			pstmt.setString(1, cart.getUserid());
			pstmt.setInt(2, cart.getProduct().getP_no());
			pstmt.setInt(3, cart.getCart_qty());
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
		
	}
	
	public int insert(String sUserId,int p_no,int cart_qty) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_INSERT);
			pstmt.setInt(1, cart_qty);
			pstmt.setInt(2, p_no);
			pstmt.setString(3, sUserId);
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
		
	}
	/*
	 * cart add update(상품에서카트추가시update)
	 */
	public int updateByProductNo(String sUserId,int p_no,int cart_qty) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_PRODUCT_NO_USERID);
			pstmt.setInt(1, cart_qty);
			pstmt.setString(2, sUserId);
			pstmt.setInt(3, p_no);
			rowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	public int updateByProductNo(Cart cart) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_PRODUCT_NO_USERID);
			pstmt.setInt(1, cart.getCart_qty());
			pstmt.setString(2, cart.getUserid());
			pstmt.setInt(3, cart.getProduct().getP_no());
			rowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	/*
	 * cart update(카트리스트에서 수정)
	 */
	public int updateByCartNo(int cart_no,int cart_qty) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_CART_NO);
			pstmt.setInt(1, cart_qty);
			pstmt.setInt(2, cart_no);
			rowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	public int updateByCartNo(Cart cart) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_UPDATE_BY_CART_NO);
			pstmt.setInt(1, cart.getCart_qty());
			pstmt.setInt(2, cart.getCart_no());
			rowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return rowCount;
	}
	/*
	 * cart list
	 */
	public List<Cart> findByUserId(String userId) throws Exception{
		List<Cart> cartList=new ArrayList<Cart>();
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		con=dataSource.getConnection();
		pstmt=con.prepareStatement(CartSQL.CART_SELECT_BY_USERID);
		pstmt.setString(1, userId);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			cartList.add(new Cart(rs.getInt("cart_no"),
							rs.getInt("cart_qty"),
							rs.getString("userId"),
							new Product(rs.getInt("p_no"),
										rs.getString("p_name"),
										rs.getInt("p_price"),
										rs.getString("p_image"),
										rs.getString("p_desc"),
										rs.getInt("p_click_count")
										)
						)
			);
		}
		return cartList;
	}
	
	/*
	 * cart pk delete
	 */
	public int deleteByCartNo(int cart_no) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_CART_NO);
			pstmt.setInt(1, cart_no);
			deleteRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	/*
	 * cart  delete
	 */
	public int deleteByUserId(String sUserId) throws Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		int deleteRowCount=0;
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(CartSQL.CART_DELETE_BY_USERID);
			pstmt.setString(1, sUserId);
			deleteRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return deleteRowCount;
	}
	public Cart findByCartNo(int cart_no)throws Exception {
		Cart cart=null;
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String selectQuery="select * from cart c join product p on c.p_no=p.p_no where cart_no=?";
		con=dataSource.getConnection();
		pstmt=con.prepareStatement(CartSQL.CART_SELECT_BY_CART_NO);
		pstmt.setInt(1,cart_no);
		rs=pstmt.executeQuery();
		if(rs.next()) {
			cart=new Cart(rs.getInt("cart_no"),
						rs.getInt("cart_qty"),
						 rs.getString("userId"),
						 new Product(rs.getInt("p_no"),
								rs.getString("p_name"),
								rs.getInt("p_price"),
								rs.getString("p_image"),
								rs.getString("p_desc"),
								rs.getInt("p_click_count"))
					
					 );
		}
		return cart;
	}
	

}