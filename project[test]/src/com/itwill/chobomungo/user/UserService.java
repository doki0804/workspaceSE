package com.itwill.chobomungo.user;

import java.io.IOException;
import java.util.Arrays;

public class UserService {
	private static final String LOWER_LETTER = ".*[a-z].*";
	private static final String UPPER_LETTER = ".*[A-Z].*";
	private static final String SPECIAL_CHARACTERS = ".*[!,~,@,#,$,*,^].*";

	private UserDao userDao;

	public UserService() throws Exception {
		this.userDao = new UserDao();
	}

	// 회원가입
	public int create(User user) throws Exception {
		if (userDao.countByUserId(user.getUserId()) >= 1) {
			return -1;
		} else if (user.getUserPw() == null || user.getUserPw().length() < 8 || user.getUserPw().length() > 16) {
			return -2;
		} else if (!user.getUserPw().matches(LOWER_LETTER) || !user.getUserPw().matches(UPPER_LETTER)) {
			return -3;
		} else if (!user.getUserPw().matches(SPECIAL_CHARACTERS)) {
			return -4;
		} else {
			int rowCount = userDao.insert(user);
			return rowCount;
		}
	}

	public int login(String id, String pw) throws Exception {
		int loginResult = -999;
		User findUser = userDao.findByPrimaryKey(id);
		if (findUser == null) {
			loginResult = 1;
		} else {
			if (pw.equals(findUser.getUserPw())) {
				loginResult = 0;
			} else {
				loginResult = 2;
			}
		}
		return loginResult;
	}

	/*
	 * 로그인한 회원의 정보보기
	 */
	public User findUser(String userId) throws Exception {
		return userDao.findByPrimaryKey(userId);
	}

	/*
	 * 회원수정
	 */
	public int update(User user) throws Exception {
		return userDao.update(user);
	}

	/*
	 * 회원탈퇴
	 */
	public int remove(String userId) throws Exception {
		return userDao.delete(userId);
	}

	// 아이디 찾기
	public String FindId(String userName, String userPhone) throws Exception {
		return userDao.findByUserId(userName, userPhone);

	}

	// 비밀번호 찾기
	public String FindPw(String userId, String userName) throws Exception {
		return userDao.findByUserPw(userId, userName);
	}

}
