package basic;

public class DataTypeTest {

	public static void main(String[] args) {

		char ch = 'A';
		if (ch == 'A') {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		char result = add(ch);
		System.out.println("결과 : " + result);
//		System.out.println("결과 : " + add(ch));
		
		
		String str = new String ("만나서 반갑");
		if (str == "만나서 반갑"){
			System.out.println("같다");			
		} else {
			System.out.println("다르다");			
		}
		String resultStr = add(str);
		System.out.println("결과 : " + resultStr);
				
		String str1 = "만나서 반갑";
		if (str1 == "만나서 반갑"){
			System.out.println("같다");			
		} else {
			System.out.println("다르다");			
		}
		
		

	}
	
	static char add(char ch){
		ch += 'B';
		return ch;
	}
	
	static String add(String str){
		str += "습니다";
		return str;
	}

}
