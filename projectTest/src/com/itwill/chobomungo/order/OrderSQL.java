
package com.itwill.chobomungo.order;
/*
 이름      널?       유형            
------- -------- ------------- 
O_NO    NOT NULL NUMBER(10)    
O_DESC           VARCHAR2(800) 
O_PRICE          NUMBER(10)    
O_DATE           DATE          
USER_ID          VARCHAR2(20)  
 */
public class OrderSQL {
	public static final String ORDERITEM_INSERT="insert into order_item(oi.no,oi_qty,o_no,p_no) values(order_item_oi_no_SEQ_nextval,?,orders_o_no_SEQ_nextval,?)";
	public static final String ORDER_INSERT="insert into orders(o_no,o_desc,o_price,o_date,user_id) values(orders_o_no_SEQ_nextval,?,?,sysdate,?)";
	
	public static final String ORDER_DELETE_USERID="delete orders where user_id = ?"; // user_id의 주문목록 전체 삭제
	public static final String ORDER_DELETE_ORDER_NO="delete orders where user_id and o_no = ?"; // user_id 주문목록 1개 삭제 
	
	public static final String ORDER_SELECT_USERID="select * from orders where user_id = ?";// user_id 전체 주문목록
	/*
	 * o_no 의 주문상세
	 */
	public static final String ORDER_SELECT_WITH_PRODUCT_USERID="select * from orders o join order_item oi on o.o_no = oi.o_no join product p on p.p_no = oi.p_no where o.user_id = ? and o.o_no = ?";
	public static final String ORDER_SELECT_BY_USERINFO="select * from orders o join user_id u on o.user_id = u.user_id where user_id = ?"; 
	
}
