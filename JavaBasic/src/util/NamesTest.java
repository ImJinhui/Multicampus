package util;

public class NamesTest {

	public static void main(String[] args) {
		
		for (Names n : Names.values()) {
			System.out.println(n);
			System.out.println(n.getJob());
			System.out.println(n.salary());
		}
	}

}
