package com.itwill.shop.test;

import com.itwill.shop.user.UserDao;

public class UserDaoTestMain {
	
	public static void main(String[] args) throws Exception {
		UserDao userDao = new UserDao();
		int result = userDao.insert(null);
	}
}
