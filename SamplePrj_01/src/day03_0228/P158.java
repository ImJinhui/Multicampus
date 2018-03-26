package day03_0228;

public class P158 {

	public static void main(String[] args) {
		String msg = "      Hello, Java Programming Test!                 ";
		
		System.out.printf("[%s] \n 글자길이: %d \n", msg, msg.length());
		msg = msg.trim();
		System.out.printf("[%s] \n 글자길이: %d \n", msg, msg.length());
		System.out.println(msg.charAt(msg.length()-1));
//		System.out.printf("[%s] \n 공백을 제외한 글자길이: %d \n", msg.trim(), msg.trim().length());
		
		for(int i=0; i<msg.length(); i++){
			System.out.println(msg.charAt(i));
		}

	}

}
