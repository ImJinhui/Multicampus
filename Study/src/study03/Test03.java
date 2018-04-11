package study03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int n=0; // 삼각형 높이 (1=<n <=100)
		int m=0; // 삼각형 종류  (1=<n <=3)
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("높이 입력 : ");
		int height = Integer.parseInt(s.nextLine());
		if (height < 1 || height >100){
			System.out.println("높이 잘못입력");
			return;
		}
		System.out.println("종류 입력 : ");
		int type = Integer.parseInt(s.nextLine());
		if (type < 1 || type >3){
			System.out.println("종류 잘못입력");
			return;
		}
		switch (type) {
		case 1:
			// 종류1
			for (int i = 1; i <= height;i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		case 2:
			// 종류2
			for (int i = 1; i <= height;i++) {
				for (int j = height; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		case 3:
			// 종류3
			for (int i = 1; i <= height; i++) {
				for (int j2 = height; j2 >= i; j2--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (2 * i) - 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;
		default:
			break;
		}
		
	}

}
