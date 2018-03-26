package day10_0312;

public class TestAnimal {

	public static void main(String[] args) {
//		Animal a = new Animal(); // 추상클래스는 객체생성 불가
		Animal a; // 타입선언은 가능 
		a = new Dog("삽살개", "쫑쫑");
		a.breath();
		
		Animal b = new Fish("물고기", "금붕어");
		b.breath();
		
		System.out.println("===");
		Animal[] animals = {a, b};
		animals[0].breath();
		animals[1].breath();
		
		System.out.println("===");
		for (int i = 0; i < animals.length; i++) {
			animals[i].breath();
		}
	}

}
