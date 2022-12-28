package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
		
		sdf2.applyPattern("yyyy/MM/dd HH:mm:ss");
		Date yourBirthDay=sdf2.parse("1998/05/12 17:45:13");
		System.out.println(yourBirthDay.toLocaleString());
		System.out.println(yourBirthDay.getTime());
		
		/*************************java.util.Calendar*************************/
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		System.out.println(cal1.getCalendarType());
		
		long currentTimeMillis3 = cal1.getTimeInMillis();
		System.out.println("cal1.getTimeInMillis()==>"+currentTimeMillis3);
		int y = cal1.get(Calendar.YEAR);
		int month = cal1.get(Calendar.MONTH)+1;
		int day = cal1.get(Calendar.DAY_OF_MONTH);
		int hour = cal1.get(Calendar.HOUR);
		int min = cal1.get(Calendar.MINUTE);
		int second = cal1.get(Calendar.SECOND);
		int msecond = cal1.get(Calendar.MILLISECOND);
		System.out.println(y+"/"+month+"/"+day+" "+hour+":"+min+":"+second+":"+msecond);
		
		System.out.println("---------Calendar-->Date---------");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, Calendar.JANUARY, 10, 13, 59, 59);
		System.out.println("Calendar cal2 --> "+cal2);
		Date date2 = cal2.getTime();
		System.out.println("Date date2-->"+date2.toLocaleString());
		
		System.out.println("---------Date-->Calendar---------");
		Date date3 = new Date();
		Calendar cal3 = Calendar.getInstance();
		cal3.setTimeInMillis(date3.getTime());
		System.out.println("Date date3    -->"+date3.toLocaleString());
		System.out.println("Calender cal3 -->"+cal3);
		
		System.out.println("----------Date객체매쏘드----------");
		Date date4 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date5 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-10");
		Date date6 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-01-15");
		
		System.out.println("equals date4 == date5:"+date4.equals(date5));
		System.out.println("equals date4 == date6:"+date4.equals(date6));
		System.out.println("compareTo:"+date4.compareTo(date5));
		System.out.println("compareTo:"+date4.compareTo(date6));
		System.out.println("compareTo:"+date6.compareTo(date4));
		long gapMillisec = date6.getTime()-date4.getTime();
		System.out.println("gapMillisec :"+gapMillisec);
		System.out.println("min :"+gapMillisec/1000/60);
		System.out.println("hour :"+gapMillisec/1000/60/60);
		System.out.println("day :"+gapMillisec/1000/60/60/24);
		
		System.out.println("----------java.util.Date-->java.sql.Date----------");
		java.util.Date utilDate1 = new java.util.Date();
		java.util.Date utilDate2 = new java.util.Date(System.currentTimeMillis());
		
		java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
		java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
		
		System.out.println("sqlDate1:"+sqlDate1);
		System.out.println("sqlDate2:"+sqlDate2);
		
		System.out.println("----------java.sql.Date-->java.util.Date----------");
		java.sql.Date sqlDate3 = new java.sql.Date(System.currentTimeMillis());
		java.sql.Date sqlDate4 = java.sql.Date.valueOf("2022-12-31");
		
		java.util.Date utilDate3 = sqlDate3;
		java.util.Date utilDate4 = sqlDate4;
		System.out.println("sqlDate3:"+utilDate3);
		System.out.println("sqlDate4:"+utilDate4);
	}

}
