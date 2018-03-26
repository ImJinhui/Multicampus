package day04_0302;

import java.util.Scanner;

public class PhoneTest {

	public static void main(String[] args) {
		
		System.out.println("******** 전화번호부 *********");

		Scanner keyboard = new Scanner(System.in);
		String choice = null;

		while (true) {
			System.out.println();
			System.out.println("메뉴 선택  예) 1, 2, 3, 4");
			System.out.println("1. 전화번호 입력");
			System.out.println("2. 전화번호 목록 보기");
			System.out.println("3. 전화번호 조회");
			System.out.println("4. 프로그램 종료");
			System.out.println();

			choice = keyboard.nextLine();

			switch (choice) {
			case "1":
				System.out.println("1. 전화번호 입력");
				System.out.println("처리중");
				break;
			case "2":
				System.out.println("2. 전화번호 목록 보기");
				System.out.println("처리중");
				break;
			case "3":
				System.out.println("3. 전화번호 조회");
				System.out.println("처리중");
				break;
			case "4":
				System.out.println("4. 프로그램 종료");
				System.out.println("프로그램을 종료합니다.");
				return; //수행중인 함수의 종료
//				System.exit(0);// application종료
			}

		}
		
		
	}

}
