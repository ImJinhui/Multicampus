package day12_0314;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		String[] names = {"라라라", "다다다", "나나나","가가가"};
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		Employee[] emps = {
				new Employee("나나나", "행정부"),
				new Employee("가가가", "환경부"),
				new Employee("라라라", "관리부"),
				new Employee("다다다", "사법부")
		};
		
		System.out.println(Arrays.toString(emps));
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));
		
	}

}
