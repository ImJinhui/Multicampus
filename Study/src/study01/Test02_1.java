package study01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test02_1 {

	public static void main(String[] args) {
		
		double sum = 0;
		double avg = 0;
		double sNum = 0;
		double gsNum = 0;
		double ratio = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		String str = scan.nextLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		String[] tokens = new String[st.countTokens()];
		sNum = st.countTokens();
		
		for (int i = 0; i < tokens.length; i++) {
			tokens[i] = st.nextToken();
			if(Integer.parseInt(tokens[i])>100){
				System.out.println("잘못입력");
			}
			sum += Double.parseDouble(tokens[i]);
			
		}
		avg = sum / sNum;
		
		for (int i = 0; i < tokens.length; i++) {
			if(Double.parseDouble(tokens[i]) > avg){
				gsNum++;
			}
		}
		
		ratio = ((double)gsNum/sNum) *100;
		
		System.out.println(Arrays.toString(tokens));
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("gsNum : " + gsNum);		
		System.out.println("ratio:" + ratio);
		System.out.printf("ratio : %.4f" , ratio);
	}

}
