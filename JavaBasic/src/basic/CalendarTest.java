package basic;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		// 오늘 날짜 년 월 일 요일 출력
		
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DATE);
		int dayNum = c.get(Calendar.DAY_OF_WEEK);
		
		
		String day = null;
		
		switch (dayNum) {
		case 1:
			day = "일";
			break;
		case 2:
			day = "월";
			break;
		case 3:
			day = "화";
			break;
		case 4:
			day = "수";
			break;
		case 5:
			day = "목";
			break;
		case 6:
			day = "금";
			break;
		case 7:
			day = "토";
			break;
			
		default:
			break;
		}
		
		System.out.printf("년:%d 월:%d 일:%d 요일:%s",year,month,date,day);
		

	}

}
