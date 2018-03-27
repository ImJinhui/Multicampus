package study01;

public class Decal {

	public static void main(String[] args) {
		
		char[] msg = new char[]{'a', 'b', 'c', 'c', 'b', 'a'};
		char[] msg2 = new char[]{'a', 'b', 'c', 'a'};
		
		System.out.println("msg : " + decal(msg));
		System.out.println("msg2 : "+ decal(msg2));
		
	}
	
	private static boolean decal(char[] msg) {

		for (int i = 0; i < msg.length; i++) {

			// System.out.println(msg[i]);
			// System.out.println(msg[msg.length-(i+1)]);

			if (!(msg[i] == msg[msg.length - (i + 1)])) {

				return false;
			}

		}

		return true;
	}

}
