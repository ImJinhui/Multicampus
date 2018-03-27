package study01;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int sNum = (int)(Math.random()*1000 +1);
		int sum = 0;
		double avg;
		int gsNum = 0;
		double ratio = 0;
		
		int[] grade = new int[sNum];
		
		
		
		
		for (int i = 0; i < grade.length; i++) {
			grade[i] = (int)(Math.random()*101);
			sum += grade[i];
		}
		
		avg = sum / sNum;
		
		for (int i = 0; i < grade.length; i++) {
			if(grade[i] > avg){
				gsNum++;
			}
		}
		
		ratio = ((double)gsNum/sNum) *100;
		
		System.out.println(Arrays.toString(grade));
		System.out.println("sNum : " + sNum);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		System.out.println("gsNum : " + gsNum);
		System.out.println("ratio:" + ratio);
		System.out.printf("ratio : %.4f" , ratio);
		
		
		
		

	}

}
