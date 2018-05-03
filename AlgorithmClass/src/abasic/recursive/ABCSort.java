package abasic.recursive;

import java.util.Arrays;
import java.util.Scanner;

public class ABCSort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char[] alpha = new char[5];
		int cnt = 0;

		alpha[0] = s.nextLine().charAt(0);

A:		for (int i = 1; i < alpha.length; i++) {
			char temp = s.nextLine().charAt(0);

			for (int j = 0; j < i; j++) {

				if (alpha[j] > temp) {

					for (int j2 = alpha.length-1; j2 > j; j2--) {
						alpha[j2] = alpha[j2 - 1];
					}
					alpha[j] = temp;
					continue A;

				}

			}
			alpha[i]=temp;

		}

		System.out.println(Arrays.toString(alpha));

	}

}
