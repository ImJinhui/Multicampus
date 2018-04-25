package util;

public class StringBufferTest {

	public static void main(String[] args) {
		int a = 10;
		add(a);
		
		System.out.println("결과:" + a);
		
		// String은 내용이 변경되면 변경된 내용을 가지고 새로운 객체를 생성해서 그 주소를 참조함 
		String b = new String("안녕");
		add(b);
		System.out.println("결과:" + b); 
		
		StringBuffer b2 = new StringBuffer("행복한");
		add(b2);
		System.out.println("결과:" + b2);
		
		// StringBuffer와 거의 비슷하나 네트워크를 지나지 못함? 
		StringBuilder b3 = new StringBuilder("아싸");
		

	}
	
	static StringBuffer add(StringBuffer b2){
		b2.append("자바"); // 문자열 붙이는 함수
		return b2;
	}
	
	static String add(String b){
		String result = b + "하이";
		return result;
	}

	static int add(int a) {
		int result = a + 5;
		return result;
	}

}
