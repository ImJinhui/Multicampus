package day02_0227;

public class P103 {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = c1;
		System.out.printf("c1=%c c2=%c  %n", c1, c2);

		System.out.println(c1 + 1); // 이미 int로 형변환됨
		System.out.printf("c1 = %c %n", c1 + 1);
		System.out.printf("c1 = %s %n", c1 + 1);
		System.out.printf("c1 = %d %n", c1 + 1);
		System.out.println(c1++);
		System.out.println(++c1);

		// c1의 값을 대문자로 바꾸려면
		c1 = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.printf("%c => %c %n", c1, (char) c1 - 32);
			c1++;
		}

	}

}
