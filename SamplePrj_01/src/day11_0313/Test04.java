package day11_0313;

public class Test04 {

	public static void main(String[] args) {
		Student s1 = new Student("jane", 2018001);
		Student s2 = new Student("jane", 2018001);

		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println(s2.equals("ghghg"));
		
		System.out.println(s1.getClass());
		System.out.println("".getClass());
	}

}
