package day02_0227;

public class P54 {

	public static void main(String[] args) {
		int num = 10;
		System.out.printf("%d 16진수로 => %x  %n", num, num);
		System.out.printf("%d 8진수로 => %o  %n", num, num);
		System.out.printf("%d 2진수로 => %s  %n", num, Integer.toBinaryString(num));
		
		System.out.println(10%2);

	}

}
