package day05_0305;

import java.util.Arrays;

public class P201 {
	public static void main(String[] args) {
		int[] num; // 배열 선언
		num = new int[10]; // 배열 생성(모두 0으로 초기화 되어있음)
		// 배열 초기화
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100 + 1); // 1~100사이의 난수
		}
		
		System.out.println("sort 전");

		for (int data : num) {
			System.out.print(data + " ");
		}
		
		//sort 오름차순 
		//셀렉션 소트(심플하지만 느림) : 하나하나 비교해서 자리바꿈
		
		for (int i = 0; i < num.length-1; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i] > num[j]){
					int  temp;
					
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					
				}
				
			}
			
		}
		System.out.println();
		System.out.println("sort 후");
		
		/*
		for (int data : num) {
			System.out.print(data + " ");
		}
		*/
		
		System.out.println(Arrays.toString(num));
		
		
		
		
		
	}
}
