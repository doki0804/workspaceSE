package com.itwill.chobomungo.cart;

public class CartService {
	private CartDao cartDao;
	
	public CartService() throws Exception {
		cartDao = new CartDao();
	}
	
	//카트에 상품 save
	public int saveCart(int c_qty, String user_id, int p_no) throws Exception {
		int rowCount = cartDao.insertCart(c_qty, user_id, p_no);
		return rowCount;
	}
	//카트 상품 개수 업데이트
	public int  updateCart(int c_qty, String user_id, int p_no) throws Exception {
		int rowCount = cartDao.updateCart(c_qty, user_id, p_no);
		return rowCount;
	}
	//카트 상품 삭제
	public int deleteCart(String user_id, int p_no) throws Exception {
		int rowCount =cartDao.deleteCart(user_id, p_no);
		return rowCount;
	}
	//카트 상품 전체삭제
	public int deleteCartAll(String user_id) throws Exception {
		int rowCount = cartDao.deleteCartAll(user_id);
		return rowCount;
	}
	
}
