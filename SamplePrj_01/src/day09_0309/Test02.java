package day09_0309;

public class Test02 {

	public static void main(String[] args) {
		Dog d = new Dog("진돗개", "멍멍");
		d.print();
		System.out.println(d.kind);
		System.out.println(((Animal)d).kind);

	}

}
