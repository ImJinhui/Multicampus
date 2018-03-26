package day05_0305;

import java.util.Arrays;

public class P210 {

	public static void main(String[] args) {
		
		if(args.length == 0){
			System.out.println("실행방법");
			System.out.println("이름/점수/점수/점수");
			return;
		}
		
		String msg = "Hello java test...";
		
		// 1) Stirng타입을 char배열로 만들기 - 직접 for문 사용
		char[] c = new char[msg.length()];
		
		for(int i = 0; i< c.length; i++){
			c[i] = msg.charAt(i);
			
		}
		
		System.out.println(Arrays.toString(c));
		
		
		// 2) Stirng타입을 char배열로 만들기 - toCharArray()메소드 사용
		char[] cc = msg.toCharArray();
		System.out.println(Arrays.toString(cc));
		
		
		System.out.println("==================");
		
		
		
		
		String data = "홍길동/90/89/97";
		if(args.length != 0){
			data = args[0];
		}
		String[] d = data.split("/"); // '/'를 기준으로 문자열을 쪼갬 => 리턴타입 : String 배열
		
		System.out.println(Arrays.toString(d));
		
		double sum = 0;
		
		for(int i = 1 ;i<d.length ;i++){
			sum += Integer.parseInt(d[i]);
			
		}
		
		System.out.printf("이름:%s  총점:%5.2f  평균:%5.2f \n",d[0],sum, sum/3);

	}

}
