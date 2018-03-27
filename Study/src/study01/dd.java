package study01;

import java.util.Scanner;

public class dd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String score = input.nextLine();
		int sum = 0;
		char[] ch = new char[score.length()];
		
		for (int i = 0; i < ch.length; i++) {
			ch[i] = score.charAt(i);
			if(ch[i]=='O'){
				sum++;
			}
		}
		
		System.out.println(sum);
	}

}
