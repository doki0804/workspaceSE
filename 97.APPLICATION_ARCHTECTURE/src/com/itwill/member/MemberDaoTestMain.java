package com.itwill.member;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		int rowCount = memberDao.delete(new Member("aaaa"));
		System.out.println("0.delete   -->" + rowCount);
		//rowCount = memberDao.insert(new Member("hhhh","hhhh","강감찬","서울시 동작구",102,"M",new Date()));
		System.out.println("1.insert   -->" + rowCount);
		rowCount = memberDao.update(new Member("dddd","dddd","이순신","서울시 도봉구",99,"M",null));
		Member findMember = memberDao.findByPrimaryKey(new Member("dddd"));
		System.out.println("2.update   -->" + rowCount);
		System.out.println("3.selectById-> "+ findMember);
		if(findMember!=null) {
			System.out.println(">> "+findMember);
		}else {
			System.out.println(">> 조건에 만족하는 멤버 존재안함");
		}
		List<Map> rowMapList = memberDao.findAll();
		for (Map rowMap : rowMapList) {
			System.out.println(rowMap);
		}
		
	}

}
