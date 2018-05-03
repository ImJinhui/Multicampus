package abasic.recursive;

public class ASumTest {

	public static void main(String[] args) {
		// 1부터 10까지의 합을 구해서 출력
		
		/*int sum = 0;
		for (int i = 0; i <= 10; i++) {
			//sum += i;
			int exsum = sum;
			sum = exsum + i;
			System.out.println(sum+ "=" +exsum+ "+" +i);
		}
		System.out.println("sum:" + sum);*/
		
		int sum = sumFunc(10);
		System.out.println(sum);
		
	}
	
	//재귀호출
	static int sumFunc(int i){
		if(i==1){
			return 1;
		}
		return i+sumFunc(i-1);
		
		/**
		 * sumFunc(3)=> return 3 + sumFunc(2) => return 3 + 3 = 6
		 * sumFunc(2)=> return 2 + sumFunc(1) => return 2 + 1 = 3 
		 * sumFunc(1)=> return 1 
		 * 
		 * */
	}
}
