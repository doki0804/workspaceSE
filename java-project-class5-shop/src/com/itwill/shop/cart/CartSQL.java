package com.itwill.shop.cart;

public class CartSQL {
	/*
	--insert
	insert
	into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_SEQ.nextval,2,1,'guard1');
	--로그인한멤버(guard1)의 카트리스트
	--select * from cart where userid='guard1';
	--cart + product
	select * from cart c join product p on c.p_no=p.p_no where userid='guard1' ;
	--로그인한멤버(guard2)의 카트리스트
	select * from cart c join product p on c.p_no=p.p_no where userid='guard2';
	--로그인한멤버(guard3)의 카트리스트
	select * from cart c join product p on c.p_no=p.p_no where userid='guard3'; 
	
	---로그인한멤버(guard1)의 카트한개삭제(pk삭제)
	delete from cart where cart_no=1;
	--delete from cart where cart_no=1 and userid='guard1';
	
	--로그인한멤버(guard1)의 제품1개의 수량증가(변경)
	--update cart set cart_qty=cart_qty+1 where userid='guard' and p_no=7;
	--카트아이템한개의 수량증가(PK조건)
	update cart set cart_qty=10 where cart_no=3;
	 */
	public static final String CART_INSERT = "insert into cart(cart_no,cart_qty,p_no,userid) values(cart_cart_no_SEQ.nextval,?,?,?)";
	public static final String CART_COUNT_BY_USERID_PRODUCT_NO = "select count(*)  as p_count from cart c join userinfo u on c.userid=u.userid where u.userid=? and c.p_no=?";

	public static final String CART_SELECT_BY_USERID = "select c.*,p.* from cart c join product p on c.p_no=p.p_no where userid=?";
	public static final String CART_DELETE_BY_CART_NO = "delete from cart where cart_no=?";
	public static final String CART_DELETE_BY_USERID = "delete from cart where userid=?";
	public static final String CART_UPDATE_BY_CART_NO = "update cart set cart_qty=? where cart_no=?";
	public static final String CART_UPDATE_BY_PRODUCT_NO_USERID = "update cart set cart_qty=cart_qty+? where userid=? and p_no=?";
	public static final String CART_SELECT_BY_CART_NO = "select * from cart c join product p on c.p_no=p.p_no where cart_no=?";
}