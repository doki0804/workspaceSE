package com.itwill.chobomungo.product;

import java.util.List;

public class ProductService {

	private ProductDao productDao;

	public ProductService() throws Exception {

		productDao = new ProductDao();
	}
	//상품 추가
	public int addBook (Product newProduct) throws Exception {

		return productDao.insert(newProduct);
	}
	//상품 수정
	public int updateBook (Product updateProduct) throws Exception {

		return productDao.update(updateProduct);
	}
	//상품번호로 삭제
	public int deleteBook(int p_no) throws Exception {

		return productDao.delete(p_no);
	}

	//상품번호로 찾기
	public Product bookSearchNumber (int p_no) throws Exception {

		return productDao.findByNo(p_no);
	}

	//상품명으로 찾기
	public List <Product> bookSearchName (String p_title) throws Exception {

		return productDao.findByName(p_title);
	}

}
