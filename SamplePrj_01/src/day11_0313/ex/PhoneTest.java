package day11_0313.ex;

public class PhoneTest {

	public static void main(String[] args) {
		
		PhoneInfo p1 = new PhoneInfo("가나다", "010-1234-5678");
		PhoneInfo p2 = new PhoneInfo("가나다", "010-1234-5678");
		Rectangle r = new Rectangle();
		
		
		System.out.println(p1.toString());
		
		System.out.println(p1.equals(p2));
		System.out.println();
		System.out.println(p2.equals(r));
		
		

	}

}
