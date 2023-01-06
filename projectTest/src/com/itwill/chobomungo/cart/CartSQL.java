package com.itwill.chobomungo.cart;
/*
이름       널?       유형           
-------- -------- ------------ 
CART_NO  NOT NULL NUMBER(10)   
CART_QTY          NUMBER(10)   
USER_ID           VARCHAR2(20) 
P_NO              NUMBER(20) 
*/

public class CartSQL {
	public final static String CART_INSERT_SQL ="insert into cart values(cart_cart_no_seq.nextval,?,?,?)";
	public static final String CART_COUNT_BY_USERID_PRODUCT_NO = 
			"select count(*)  as p_count from cart c join userinfo u on c.user_id=u.user_id where u.user_id=? and c.p_no=?";
	
	public final static String CART_DELETE_BY_CART_NO_SQL ="delete cart where cart_no = ?";
	public final static String CART_DELETE_BY_USER_ID_SQL = "delete cart where user_id = ?"; // 카트 전체 비우기
		
	public final static String CART_UPDATE_BY_PRODUCT_NO_USER_ID_SQL ="update cart set cart_qty = cart_qty + ? where user_id= ? and p_no = ?";
	public final static String CART_UPDATE_BY_CART_NO_SQL ="update cart set cart_qty = ? where cart_no = ?";
	
	public static final String CART_SELECT_BY_USER_ID_SQL = "select c.*,p.* from cart c join product p on c.p_no = p.p_no where user_id = ?";
	public static final String CART_SELECT_BY_CART_NO_SQL = "select * from cart c join product p on c.p_no = p.p_no where cart_no = ?";
	
	
}
