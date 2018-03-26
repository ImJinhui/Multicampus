package day04_0302;

import java.util.Arrays;

public class P197 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++){
			score[i] = (int)(Math.random()*100)+1;
		}
		
		//배열의 출력을 담당하는 API
		System.out.println(Arrays.toString(score));
		
		// Max값 구하기 
		
		int max = 0;
		for(int i =0; i<score.length;i++){
			
			if(score[i] > max){
				max = score[i];
			}
			
		}
		
		System.out.println("최대값 : " + max);
		
		// min값 구하기
		
		int min = 100;
		for (int i = 0; i < score.length; i++) {
			
			if(score[i]<min){
				min = score[i];
			}
			
		}
		System.out.println("최소값 : " + min);

	}

}
