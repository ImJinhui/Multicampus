package day04_0302;

public class P167 {

	public static void main(String[] args) {

		String msg = "Java Test";

		for (int i = 5; i > 0; i--) {
			System.out.println(msg);
		}

		System.out.println("================================");

		int i = 0;
		while (i < 5) {
			System.out.println(msg);
			i++;
		}
		System.out.println("*********************************");
		
//		while (i < 5) {
//			System.out.println("do while Test");
//			i++;
//		}
		
		do {
			System.out.println("do while Test");
			i++;
		} while (i < 5);
	}

}
