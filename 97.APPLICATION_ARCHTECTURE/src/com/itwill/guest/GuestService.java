package com.itwill.guest;

import java.util.List;

public class GuestService {
	private GuestDao guestDao;
	
	public GuestService() throws Exception {
		guestDao = new GuestDao();
	}
	
	public int guestWrite(Guest newGuest) throws Exception {
		return guestDao.insert(newGuest);
	}
	
	public int guestDelete(int guest_no) throws Exception {
		return guestDao.delete(guest_no);
	}
	
	public int guestUpdate(Guest updateGuest) throws Exception {
		return guestDao.update(updateGuest);
	}
	
	public List<Guest> findGuestName(String guest_name) throws Exception {
		return guestDao.findByGuestName(guest_name);
	}
	
	public Guest findGuestNo(int guest_no) throws Exception{
		return guestDao.findByPrimaryKey(guest_no);
	}
	
	public List<Guest> guestAll() throws Exception{
		return guestDao.findAll();
	}
}
