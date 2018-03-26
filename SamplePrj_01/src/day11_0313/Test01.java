package day11_0313;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		String msg = "Hello";
		Date now = new Date();
		Employee emp1 = new Employee("홍길동", "기획조정실");
		
		
		System.out.println(msg);
		System.out.println(msg.toString());
		System.out.println(now);
		System.out.println(now.toString());
		System.out.println(emp1);
		System.out.println(emp1.toString());

	}

}
