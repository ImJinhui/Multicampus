package day10_0312;

public class Prob_test {

	public static void main(String[] args) {
		/*Person s = new Student("홍길동", 20, 200201);
		Person t = new Teacher("이순신", 30, "JAVA");
		Person e = new Employee("유관순", 40, "교무과");
		
		((Student)s).print();
		((Teacher)t).print();
		((Employee)e).print();
		*/
		Person[] persons = {
				new Student("홍길동", 20, 200201),
				new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과")
		};
		
		
		for (int i = 0; i < persons.length; i++) {
			
			persons[i].print();
		}

	}

}
