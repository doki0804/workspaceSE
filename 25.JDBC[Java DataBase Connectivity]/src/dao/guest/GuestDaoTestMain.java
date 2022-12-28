package dao.guest;

import java.util.Date;
import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		int rowCount=0;
		
		rowCount = guestDao.insert(
				new Guest(0,
						"김기리",
						new Date(),
						"rlflrlfl@gmail.com",
						"http://www.itwill.co.kr",
						"방명록사용법",
						"방명록처럼 사용하시면됩니다."));
		System.out.println("1.insert >>"+rowCount+"개 행 insert 완료");
		
		rowCount = guestDao.delete(1);
		System.out.println("2.delete >>"+rowCount+"개 행 delete 완료");
		
		rowCount = guestDao.update(
				new Guest(2,
						"변경김",
						new Date(),
						"qusrudrla@gmail.com",
						"http://www.itwill.co.kr",
						"변경사용법",
						"변경록처럼 변경하시면됩니다."));
		System.out.println("3.update >>"+rowCount+"개 행 update 완료");
		
		Guest findGuest = guestDao.findByPrimaryKey(2);
		System.out.println("4.findByPrimarykey >>"+findGuest);
		
		List<Guest> guestList = guestDao.findAll();
		System.out.println("5.findAll >>"+ guestList);
			
	}

}