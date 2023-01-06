package com.itwill.chobomungo.cart;

import java.util.List;

import com.itwill.chobomungo.product.Product;

public class CartService {
	private CartDao cartDao;
	
	public CartService() throws Exception {
		cartDao = new CartDao();
	}
	//카트추가,수정
	public int addCart(Cart cart) throws Exception {
		if(cartDao.countByProductNo(cart)==1) {
			return cartDao.updateByCartNo(cart);			
		}else {
			return cartDao.insert(cart);
		}
	}
	
	//카트에서 cart_no로 한개 삭제
	public int removeCartItemByCartNo(Cart cart) throws Exception {
		return cartDao.deleteByCartNo(cart);
	}
	//카트에서 user_id로 전체삭제
	public void removeCartItemByUserId(Cart cart) throws Exception {
		cartDao.deleteByUserId(cart);
	}
	//카트리스트 전체
	public List<Cart> getCartListByUserId(Cart cart) throws Exception {
		return cartDao.findByUserId(cart);
	}
	//카트에서 상품한개 보기
	public  Cart getCartByCartNo(Cart cart) throws Exception {
		return cartDao.findByCartNo(cart);
	}
	
}
