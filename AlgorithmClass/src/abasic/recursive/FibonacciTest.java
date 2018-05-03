package abasic.recursive;

public class FibonacciTest {

	public static void main(String[] args) {
		
		/*int su1 = 1, su2 = 0;
		int result = 0;
		
		for (int i = 1; i < 5; i++) {
			result = su1 + su2;
			System.out.println(result + "=" + su1 + "+" + su2);
			su2 = su1;
			su1 = result;
		}
		
		System.out.println("결과:" + result);*/
		
		int result = fib(5);
		System.out.println(result);
	}

	static int fib(int n){
		
		if(n==0) return 0;
		if(n==1 || n==2) return 1;
		
		return fib(n-1) + fib(n-2);
	}
}
