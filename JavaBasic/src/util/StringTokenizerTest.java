package util;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "독도는,, 대한,민국의 아,,름다운 섬,이다";
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()){ // hasMoreTokens() : 다음 토큰이 없으면 false반환 
			System.out.println(st.nextToken());
		}
		
		System.out.println("========================");
		
		String[] tokens = str.split(",");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}
