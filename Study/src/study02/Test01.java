package study02;

import java.util.Scanner;

public class Test01 {
	
	/*문제 1)1~ N까지의숫자를 다음처럼 출력하라

	1 2 3 4 5

	6 7 8 9 10

	11 12 13 14 15*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int x = scan.nextInt();
		scan.nextLine();
		
		for (int i = 1; i <= x; i++) {
			System.out.print(i + "  ");
			if(i%5==0){
				System.out.println();
			}
		}
	}

}
