package dao.member;

import java.util.Date;
import java.util.List;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		int rowCount = memberDao.delete(new Member("aaaa","","","",0,"",null));
		System.out.println("0.delete   -->" + rowCount);
		rowCount = memberDao.insert(new Member("dddd","dddd","이원호","서울시 송파구",33,"M",null));
		System.out.println("1.insert   -->" + rowCount);
		rowCount = memberDao.update(new Member("dddd","dddd","이순신","서울시 도봉구",99,"M",null));
		System.out.println("2.update   -->" + rowCount);
		Member findMember = memberDao.findByPrimaryKey(new Member("dddd","","","",0,"",null));
		System.out.println("3.selectById-> "+ findMember);
		if(findMember!=null) {
			System.out.println(">> "+findMember);
		}else {
			System.out.println(">> 조건에 만족하는 멤버 존재안함");
		}
		List<Member> memberList = memberDao.findAll();
		System.out.println("4.selectAll-->"+ memberList);
		
	}

}
