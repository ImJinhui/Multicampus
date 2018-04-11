package study02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test05 {

	/*문제 5) 정수 20 개를 입력받아서 그 합과 평균을 출력하되 
	 * 0 이 입력되면 20개 입력이 끝나지 않았더라도 그 때까지 입력된합과 평균을 출력하는 프로그램을 작성하시오. 
	평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)

	입력
	5 9 6 8 4 3 0
	출력
	35 5*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자들 입력 : ");
		String str = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int[] tokens = new int[st.countTokens()];
		
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < tokens.length; i++) {
			
			tokens[i] =Integer.parseInt(st.nextToken());
			sum = sum+tokens[i];
			
		}
		avg = sum/tokens.length;
		System.out.println(Arrays.toString(tokens));
		System.out.println("총합:" + sum);
		System.out.printf("평균: %f" , avg);
		
		
	}

}
