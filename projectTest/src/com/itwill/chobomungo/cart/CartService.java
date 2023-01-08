package com.itwill.chobomungo.cart;

import java.util.List;

public class CartService {
	private CartDao cartDao;
	
	public CartService() throws Exception {
		cartDao = new CartDao();
	}
	//카트추가,수정
	public int addCart(int cart_qty,String user_id, int p_no) throws Exception {
		if(cartDao.countByProductNo(user_id,p_no)==1) {
			return cartDao.updateByUserIdProductNo(cart_qty,user_id,p_no);			
		}else {
			return cartDao.insert(cart_qty,user_id,p_no);
		}
	}
		//카트에서 수량 추가
	public int addCartByCartNo(int cart_qty, int cart_no) throws Exception {
		return cartDao.updateByCartNo(cart_qty,cart_no);
	}
	//카트에서 cart_no로 한개 삭제
	public int removeCartItemByCartNo(int cart_no) throws Exception {
		return cartDao.deleteByCartNo(cart_no);
	}
	//카트에서 user_id로 전체삭제
	public void removeCartItemByUserId(String user_id) throws Exception {
		cartDao.deleteByUserId(user_id);
	}
	//카트리스트 전체
	public List<Cart> getCartListByUserId(String user_id) throws Exception {
		return cartDao.findByUserId(user_id);
	}
	//카트에서 상품한개 보기
	public  Cart getCartByCartNo(int cart_no) throws Exception {
		return cartDao.findByCartNo(cart_no);
	}
	
}
