package day11_0313;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("홍길동", "인사부");
		System.out.println(emp1);
		emp1.close();
		emp1 = null;
		
		System.gc(); //가비지콜렉터 호출 -> finalize()수행이됨 
	
		
		
	}
}
