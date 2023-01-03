package com.itwill.member.test;

import javax.swing.JOptionPane;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception {
		MemberService memberService = new MemberService(); 
		System.out.println("1.회원가입");
		boolean addSuccess1 = 
				memberService.addMember(new Member("xxxx","xxxx","엑스맨","경기도민",30,"F",null));
		if(addSuccess1 == true) {
			System.out.println("로그인화면으로이동");
		}else {
			JOptionPane.showMessageDialog(null, "중복된아이디입니다.");
		}
		boolean addSuccess2 =
				memberService.addMember(new Member("bbbb","bbbb","비비맨","강원도민",332,"T",null));
		if(addSuccess2 == true) {
			System.out.println("로그인화면으로이동");
		}else {
			JOptionPane.showMessageDialog(null, "중복된아이디입니다.");
		}
		
		int loginResult = memberService.login("xxxx", "xxxx");
		if(loginResult==1) {
			JOptionPane.showMessageDialog(null, "일치하는 아이디가 없습니다.");
		}else if(loginResult==2) {
			JOptionPane.showMessageDialog(null, "비밀번호가 틀립니다.");
		}else if(loginResult==0) {
			System.out.println("메인화면으로 이동");
		}
		System.out.println(">> "+memberService.login("aaaa", "2323"));
		System.out.println(">> "+memberService.login("pppp", "2323"));
		
		/*
		 * 회원상세보기
		 */
		System.out.println("회원정보 : " + memberService.memberDetail("cccc"));
		
		/*
		 * 회원정보수정
		 */
		int update = memberService.memberUpdate(new Member("", "", "", "", 0, "", null));
		
		/*
		 * 중복아이디 체크
		 */
		System.out.println("3.duplicateId");
		System.out.println(">> "+memberService.isDuplicateId("aaaa"));
		System.out.println(">> "+memberService.isDuplicateId("bbbb"));
	}
}
