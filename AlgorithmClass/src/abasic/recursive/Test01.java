package abasic.recursive;

public class Test01 {

	public static void main(String[] args) {

		/**
		 * x의 m제곱 하는 함수를 재귀함수로 만들기
		 *  
		 * */
		
		System.out.println(exp(3,4));
		
	}
	
	static int exp(int x, int m){
		if(m==0){return 1;}
		return x * exp(x, m-1);
	}

}
