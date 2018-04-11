package study02;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {

	/*문제3) 10개의 정수를 입력받아 
	 * 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.

	입력
	10 20 30 55 66 77 88 99 100 15
	출력
	짝수 : 6개
	홀수 : 4개*/
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int aa = 0;
		int bb = 0;
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 : ");
			nums[i]= scan.nextInt();	
			scan.nextLine();
			
			if(nums[i]%2==0){
				aa++;
			}else{
				bb++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("짝수:" + aa + "개");
		System.out.println("홀수:" + bb + "개");
		
		
		
	}

}
