package com.itwill.chobomungo.product;

public class ProductSQL {

	public static final String PRODUCT_INSERT 
	= "insert into product(p_no, p_title, p_price, p_image,p_desc) values(product_p_no_SEQ.nextval,?,?,?,?)";
	
	public static final String PRODUCT_UPDATE
	= "update product set p_title = ?, p_price = ?, p_image = ? ,p_desc = ? where p_no = ?"; //상품번호로 업데이트
	
	public static final String PRODUCT_DELETE = "delete from product where p_no = ?"; // 상품번호로 삭제
	
	public static final String PRODUCT_BY_NUMBER = "select * from product where p_no = ? "; //상품번호로 찾기 
	
	public static final String PRODUCT_BY_NAME = "select*from product where p_title like '%'||?||'%'"; //특정 상품명으로 찾기
	
	public static final String PRODUCT_BY_ALL = "select*from product"; // 전체 상품 리스트
	
	
}
