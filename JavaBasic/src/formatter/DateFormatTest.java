package formatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		
		// 2017-12-25 12:25:00 지정하고싶다면
		Date today = new Date();
		
		Date day = new Date("2017/12/25 12:25");
		System.out.println(today);
		System.out.println(day);
		
		// 0000년 00월 00일 0요일 00시 00분 00초 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		System.out.println(sdf.format(today));
		System.out.println(sdf.format(day));
	}

}
