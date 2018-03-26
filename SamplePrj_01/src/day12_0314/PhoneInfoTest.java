package day12_0314;

public class PhoneInfoTest {

	public static void main(String[] args) {
		PhoneInfo<String> p1 = new PhoneInfo<String>("홍길동", "2018");
		
		System.out.println(p1);
		
		PhoneInfo<Integer> p2 = new PhoneInfo<Integer>("김길동", 2014);
		System.out.println(p2);
		
		PhoneInfo p3 = new PhoneInfo("박길동", 2016);
		System.out.println(p3);

	}

}
