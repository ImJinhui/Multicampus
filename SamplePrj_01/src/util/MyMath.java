package util;

public class MyMath {
	
	public static int add(int num1, int num2){
		return num1 + num2;
	}
//	public static double add(int num1, int num2){ // 리턴타입은 달라도 소용없음 
//		return num1 + num2;
//	} 
	public static double add(double num1, int num2){ // 매개변수 타입 다르게
		return num1 + num2;
	}
	public static int add(int num1, int num2, int num3){ // 매개변수 개수 다르게
		return num1 + num2 + num3;
	}
	
	public static int add(int ...num){ // 가변인자
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	/*
	public static int add(int[] num){ // int배열인데 가변인자와 같은것으로 인식하지만 차이가 있음
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		return sum;
	}
	*/
	
	
	
	
	
	
	
	public static int subtract(int num1, int num2){
		return num1 - num2;
	}
	
	public static int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	public static int divide (int num1, int num2){
		if(num2 == 0){
			return -1;
		}
		return num1 / num2;
		
	}
	
}
