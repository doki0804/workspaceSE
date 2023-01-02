package com.itwill.member.test;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTest {

	public static void main(String[] args) throws Exception {
		MemberService memberService = new MemberService(); 
		
		System.out.println(">> "+memberService.memberWrite(new Member("pppp","pppp","김아무개","서울시 노원구",20,"S",null)));
		
		Member findMember = memberService.findMemberId("cccc");
		System.out.println(">> "+findMember);
		findMember.setM_name("김왕장");
		findMember.setM_age(30);
		System.out.println(">> "+memberService.update(findMember));
		System.out.println(">> "+memberService.memberDelete("gggg"));
		System.out.println(">> "+memberService.memberAll());
		
	}
}
