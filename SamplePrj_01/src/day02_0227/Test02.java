package day02_0227;

import java.util.Date;

public class Test02 {

	public static void main(String[] args) {
//		"2018/03/01"
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		
		Date day2 = new Date("2018/03/01");
		System.out.println(day2);
		
		java.sql.Date day3;
		
		int num1 = 66;
		int num2 = 77;
		
		int big = num1>num2 ? num1 :num2 ;
		int small = num1 > num2 ? num2 : num1;
		
		System.out.println(big);
		System.out.println(small);
		
		
		
	}

}
