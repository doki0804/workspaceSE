package dao.member;

import java.util.Date;
import java.util.List;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		System.out.println("0.delete   --> ");
		int rowCount = memberDao.delete(new Member("aaaa","","","",0,"",null));
		System.out.println(">> delete row count:"+ rowCount);
		System.out.println("1.insert   --> ");
		rowCount = memberDao.insert(new Member("dddd","dddd","이원호","서울시 송파구",33,"M",null));
		System.out.println(">> insert row count:"+ rowCount);
		System.out.println("2.update   --> ");
		rowCount = memberDao.update(new Member("dddd","dddd","이순신","서울시 도봉구",99,"M",null));
		System.out.println(">> update row count:"+ rowCount);
		System.out.println("3.selectById-> ");
		Member findMember = memberDao.findByPrimaryKey(new Member("dddd","","","",0,"",null));
		if(findMember!=null) {
			System.out.println(">> "+findMember);
		}else {
			System.out.println(">> 조건에 만족하는 멤버 존재안함");
		}
		System.out.println("4.selectAll--> ");
		List<Member> memberList = memberDao.findAll();
		System.out.println(memberList);
		
	}

}
