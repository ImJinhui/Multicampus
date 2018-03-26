package day06_0306;

/*
문제1. Prob1내에 leftPad 메쏘드를 작성하십시오. 
       leftPad 메쏘드의 속성은 다음과 같습니다.

1.	메소드 시그니처 : 
        public String leftPad(String str, int size, char padChar)

2.	입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
        문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.

3.	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
             큰 경우에는 원본 문자열(str)을 그대로 리턴한다.

실행 예) 
leftPad(“SDS”, 6, ‘#’)  =>  ###SDS 
leftPad(“SDS”, 5, ‘$’)  =>  $$SDS
leftPad(“SDS”, 2, ‘&’)  =>  SDS
*/

public class Prob1 {
	public static void main(String args[]) {
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') );
		
	}
	
	public String leftPad(String str, int size, char padChar) {
		/*  여기에 프로그램을 완성하십시오. */
		String sumpad = "";
		String result = null;
		
		if(str.length() >= size){
			return str;
		}
		
		for (int i = 0; i < size - str.length() ; i++) {
			sumpad += padChar;
			
//			str = padChar+str;
		}
		result = sumpad + str;
		
		return result;
		
		
	}
	
	 
}

