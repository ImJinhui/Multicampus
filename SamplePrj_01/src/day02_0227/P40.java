package day02_0227;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		String name = null;
		int age = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = input.nextLine();
		System.out.print("나이를 입력하세요 : ");
//		age = Integer.parseInt(input.nextLine()); // 엔터까지 다 읽어들여서 엔터값도 처리해버림  
		age = input.nextInt(); // 엔터는 두고 int만 읽어들임
		input.nextLine(); // 그래서 엔터값을 처리해주는 문장이 있어야함 
		System.out.printf("입력한 이름은 %s %n입력한 나이는 %d 입니다. %n ",name, age);
		
		
		
	}

}
