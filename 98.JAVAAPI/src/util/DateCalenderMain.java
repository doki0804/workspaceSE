package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalenderMain {

	public static void main(String[] args) throws Exception{
		/*
		 * System.currentTimeMillis();
		 * the difference, measured in milliseconds,
		 * between the current time and midnight, January 1, 1970 UTC.
		 */
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		long startTime = System.currentTimeMillis();
		Thread.sleep(12);
		long endTime = System.currentTimeMillis();
		long duration = endTime-startTime;
		System.out.println("duration :"+duration);
		/*
		 * java.util.Date
		 *  - 
		 */
		Date now = new Date();
		String nowString = now.toString();
		System.out.println(nowString);
		
		long currentTimeMillis1 = now.getTime();
		System.out.println("Date.getTime() ==> :"+currentTimeMillis1);
		
		System.out.println("--------SimpleDateFormat [Date -> String] --------");
		/*
		 * SimpleDateFormat : Date객체의 시간을 문자열로 변경해주는 클래스
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy 년 MM 월 dd 일");
		String formatStr1 = sdf1.format(now);
		System.out.println(formatStr1);
		
		sdf1.applyPattern("yyyy/MM/dd HH:mm:ss.SSS");
		String formatStr2 = sdf1.format(now);
		System.out.println(formatStr2);
		
		sdf1.applyPattern("yyyy");
		String yearStr = sdf1.format(now);
		System.out.println("String -->"+yearStr);
		int year = Integer.parseInt(yearStr);
		System.out.println("int -->"+year);
		System.out.println("--------SimpleDateFormat [String -> Date] --------");
		SimpleDateFormat sdf2 = new SimpleDateFormat();
		sdf2.applyPattern("yyyy-MM-dd");
		Date myBirthDay = sdf2.parse("2000-06-03");
		System.out.println(myBirthDay.toString());
		System.out.println(myBirthDay.toLocaleString());
		System.out.println(myBirthDay.getTime());
		
		
		
	}

}
