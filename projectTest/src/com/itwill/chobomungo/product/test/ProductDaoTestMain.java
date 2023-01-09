package com.itwill.chobomungo.product.test;

import java.util.List;

import com.itwill.chobomungo.product.Product;
import com.itwill.chobomungo.product.ProductDao;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {

		ProductDao productDao = new ProductDao();
		
		System.out.println("상품 추가");
		
		Product newProduct = new Product(0, "책입니다", 10000, "default.jpg", "이것은 책입니다.");
		System.out.println(">>"+productDao.insert(newProduct));
		newProduct = new Product(0, "책이란 무엇인가?", 200000, "default.jpg", "책은 책이요");
		System.out.println(">>"+productDao.insert(newProduct));
		System.out.println("상품 번호로 삭제");
		System.out.println(">>"+productDao.delete(1));
		
		System.out.println("상품 번호로");
		Product findProduct = productDao.findByNo(2);
		System.out.println(findProduct);
		
		findProduct.setP_title("자바란 무엇인가?");
		findProduct.setP_desc("까만 건 종이요, 하얀 건 코드로다.");
		System.out.println(productDao.update(findProduct));
		
		System.out.println("상품 이름으로 찾기");
		List <Product> findProduct1 =productDao.findByName("자바");
		System.out.println(findProduct1);
		
	}

}
