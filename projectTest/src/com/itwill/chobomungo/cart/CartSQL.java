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
	public final static String INSERT_CART_SQL ="insert into cart values(cart_cart_no_seq.nextval,?,?,?)";
	public final static String DELETE_CART_SQL ="delete cart where user_id = ? and p_no = ?";
	public final static String UPDATE_CART_SQL ="update cart set cart_qty= ? where user_id= ? and p_no = ?";
	public final static String FIND_BY_P_NO_CART_SQL = "select * from cart where user_id = ? and p_no = ?"; // 선택한 물건 카트에서 지우기
	public final static String FIND_BY_USER_ID_CART_SQL = "select * from cart where user_id = ?"; // 카트 전체 비우기
}
