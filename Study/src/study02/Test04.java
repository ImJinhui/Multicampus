package study02;

import java.util.Arrays;
import java.util.Scanner;

public class Test04 {

	/*
	 * 문제4) 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을작성하시오.
	 * 
	 * 입력
	 * 
	 * 3 4
	 * 
	 * 출력
	 * 
	 * 1 2 3 4
	 * 
	 * 2 4 6 8
	 * 
	 * 3 6 9 12
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("행 갯수 입력: ");
		int row = scan.nextInt();
		scan.nextLine();

		System.out.println("열 갯수 입력: ");
		int col = scan.nextInt();
		scan.nextLine();

		int[][] arr = new int[row][col];
		int x = 1;

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				arr[i][j] = x * (i + 1);
				x++;

				System.out.print(arr[i][j]+"  ");

			}
			System.out.println();
			x = 1;
		}

	}

}
