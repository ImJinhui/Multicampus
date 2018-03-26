package day03_0228;

public class P157 {

	public static void main(String[] args) {
		for (int count = 1; count <= 10; count++) {
			System.out.println("Hello, Java! " + count);
		}
		
		//1~10까지의 합
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum = sum+i;
			System.out.printf("%3d +", i);
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		
		
		//1~100 사이의 3의배수의 합 
		int sum1 = 0;
		for (int i = 1; i < 100; i++) {
			if(i%3==0){
				sum1 += i;				
				System.out.printf("%3d +", i);
			}
		}
		System.out.println();
		System.out.println("3의 배수의 합계 : " + sum1);
	}

}
