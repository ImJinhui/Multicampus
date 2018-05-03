package abasic.recursive;

public class BMulTest {

	public static void main(String[] args) {
		// 5부터 1까지의 곱을 구해서 출력 
		// 5*4*3*2*1=5!
		
		
		/*int sum = 1;
		for (int i = 5; i >= 1; i--) {
			sum *= i;
		}
		System.out.println(sum);*/
		
		// 재귀호출로 해보기 
		int sum = mulFunc(5);
		System.out.println(sum);
		
		
		
	}
	
	static int mulFunc(int i){
		if(i==1) return 1;
		return i * mulFunc(i-1);
	}
	
	

}
