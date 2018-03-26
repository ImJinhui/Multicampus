package day05_0305;

import java.util.Arrays;

public class Prob1 {

	public static void main(String[] args) {
		// int[] num = new int[6]
		// 배열 num에 정수 1~45 사이의 난수를 집어넣는다.
		// 중복제거한다.
		// 정렬후 화면에 출력한다.

		/*
		int[] num = new int[6];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
			for(int j=0;j<i;j++){
				if(num[i]==num[j]){
				 i--;
				 break;
				}
			}
			
		}
		System.out.println(Arrays.toString(num));
		*/
		
		// num[0]에 우선 하나 넣고 나머지 for문으로 넣어서 중복체크
		
		
		//만약 실행파라미터가 들어오면 들어오는 값으로, 안들어오면 6으로
		int count = 6;
		if(args.length == 1){
			count = Integer.parseInt(args[0]);
		}
		int[] num = new int[count];
		
		num[0] = (int)(Math.random()*45)+1;
		
		for(int i = 1 ; i<num.length; i++){
			num[i] = (int)(Math.random()*45+1);
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]){
					i--;
					break;
				}
				
			}
		}
		System.out.println(Arrays.toString(num));
		
		for (int i = 0; i < num.length-1; i++) {
			for (int j =i+1; j < num.length; j++) {
				if(num[i] < num[j]){ //내림차순(큰수부터)
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(num));
		
	}

}
