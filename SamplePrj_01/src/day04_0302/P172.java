package day04_0302;

import java.util.Scanner;

public class P172 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		while (flag) {
			System.out.println("등급을 처리할 점수를 입력해주세요.");
			System.out.println("(종료하려면 q를 입력하세요.)");
			String data = scanner.nextLine();
			
			if (data.equals("q")) {
				flag = !flag;
				break;
			}
			
			int jumsu = Integer.parseInt(data);
			
			String result = jumsu>=80 ? "합격" : "불합격";
			
			System.out.printf("%d [%s] \n", jumsu, result);
			
		}
		
		scanner.close();
		scanner = null;

//		String[] name = new String[5];
//		
//		name[0] = "aaa";
//		
//		int a = name.length; // 배열 자체의 길이
//		int b = name[0].length(); // 0번째 저장된 문자열의 길이
//	
//		System.out.println(a);
//		System.out.println(b);
	}

}
