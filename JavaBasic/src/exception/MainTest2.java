package exception;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		Model m = new Model();
		try {
			m.method();
		} catch (Exception e) {
			System.out.println("예외발생:" +e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");

	}

}

class Model{
	public void method() throws Exception {
		// 두 수 입력받아 첫번째 수를 두번째 수로 나누기 
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("x:");
		int x = s.nextInt();
		System.out.println("y:");
		int y = s.nextInt();
		if(y==0){
			throw new MyException();
		}
		int r = x/y;
		System.out.println("result:" + r);
		
		
		
		
	}
}

class MyException extends Exception{
	
	public String getMessage(){
		return "두번째 수가 0이면 안됩니다";
	}
}
