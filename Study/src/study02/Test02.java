package study02;

import java.util.Scanner;

public class Test02 {

	/*문제2) 두 개의 실수를 입력받아 
	 * 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 
	 * 라고 출력하는프로그램을 작성하시오.*/
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력 1: ");
		double x = scan.nextDouble();
		scan.nextLine();
		
		System.out.println("숫자 입력 2: ");
		double y = scan.nextDouble();
		scan.nextLine();
		
		if(x>=4.0 && y>=4.0){
			System.out.println("결과 : A");
		}else if(x>=3.0 && y>=3.0){
			System.out.println("결과 : B");			
		}else{
			System.out.println("결과 : C");			
		}
	}

}
