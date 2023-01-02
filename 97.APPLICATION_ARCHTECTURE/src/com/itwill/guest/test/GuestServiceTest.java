package com.itwill.guest.test;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTest {
	
	public static void main(String[] args) throws Exception {
		GuestService guestService = new GuestService();
		
		System.out.println("1.방명록쓰기");
		Guest newGuest = new Guest(0,"페이커",null,"faker@skt1.com","www.skt1.com","안녕하세요","세최미 페이커입니다.");
		System.out.println(">> "+guestService.guestWrite(newGuest));
		
		System.out.println("2.번호로 검색");
		Guest findGuest = guestService.findGuestNo(6);
		System.out.println(">> "+findGuest);
		
		System.out.println("3.방명록 수정");
		findGuest.setGuest_name("역최미 페이커");
		findGuest.setGuest_content("세최미가 아니라 이제 역최미 페이커입니다.");
		System.out.println(">> "+guestService.guestUpdate(findGuest));
		
		System.out.println("4.이름으로 검색");
		System.out.println(">> "+guestService.findGuestName("페이커"));
		
		System.out.println("5.방명록 삭제");
		System.out.println(">> "+guestService.guestDelete(3));
		System.out.println("6.전체검색");
		System.out.println(">> "+guestService.guestAll());
	}
}
