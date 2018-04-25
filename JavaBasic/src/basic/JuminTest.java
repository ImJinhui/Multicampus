package basic;

import java.util.Calendar;


public class JuminTest {

	public static void main(String[] args) {
		
		String id="920924-2154567";
		
		char gender = id.charAt(7);

		if (gender == '2' || gender == '4' || gender == '0') {

			System.out.println("여");
		} else if (gender == '1' || gender == '3' || gender == '9') {

			System.out.println("남");

		} else {

			System.out.println("오류");
		}
		
		char home = id.charAt(8);
		
		switch (home) {
		case '0':
			System.out.println("서울");
			break;
		case '1':
			System.out.println("인천/부산");
			break;
		case '2':
			System.out.println("경기");
			break;
		case '9':
			System.out.println("제주");
			break;

		default:
			System.out.println("기타");
			break;
		}
		
		
		String halfBirthYear = id.substring(0, 2);
		int age ;
		int birthYear;
		
		switch (gender) {
		case '2': case '1':
			birthYear = 1900;
		
			break;
		case '4': case '3':
			birthYear = 2000;
			
			break;
		case '0': case '9':
			birthYear = 1800;
			
			break;

		default:
		
			break;
			
			
		}
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		age = 2018 - (1900 + Integer.parseInt(halfBirthYear)) +1;
		System.out.println(age);
	}

}
