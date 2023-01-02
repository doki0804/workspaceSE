package com.itwill.member;

import java.util.List;
import java.util.Map;

public class MemberService {
	private MemberDao memberDao;
	
	public MemberService() throws Exception {
		memberDao = new MemberDao();
	}
	
	public int memberWrite(Member member) throws Exception {
		return memberDao.insert(member);
	}
	
	public int update(Member member) throws Exception{
		return memberDao.update(member);
	}
	
	public int memberDelete(String m_id) throws Exception {
		return memberDao.delete(m_id);
	}
	
	public Member findMemberId(String m_id) throws Exception{
		return memberDao.findByPrimaryKey(m_id);
	}
	
	public List<Map> memberAll() throws Exception{
		return memberDao.findAll();
	}
}
