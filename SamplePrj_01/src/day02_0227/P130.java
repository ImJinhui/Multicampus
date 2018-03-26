package day02_0227;

public class P130 {

	public static void main(String[] args) {
		char c = 'a';
		
		boolean b = '0'<=c && c<='9';
		
		if(b){
			System.out.printf("%c 는 숫자입니다. %n", c);
		}
		
		/*
		if (97 <= c && c <= 122) {
			System.out.printf("%c 는 소문자입니다. %n", c);
		}
		if ('0'<=c && c<='9'){
			System.out.printf("%c 는 숫자입니다. %n", c);
		}
		*/
		
		
	}

}
