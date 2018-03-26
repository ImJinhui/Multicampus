package day09_0309.ex;

public class Prob_test2 {

	public static void main(String[] args) {
		Person s = new Student("홍길동", 20, 200201);
		Person t = new Teacher("이순신", 30, "JAVA");
		Person e = new Employee("유관순", 40, "교무과");
		
		Person[] persons = {
				new Student("홍길동", 20, 200201),
				new Teacher("이순신", 30, "JAVA"),
				new Employee("유관순", 40, "교무과")
		};
		
		((Student)s).print(); // 다운캐스팅해야 print()에 접근 가능
//		((Teacher)s).print(); // Teacher로 다운캐스팅해도 오류가 안남 (실행시에는 오류남) -> instanseOf
		
		for (int i = 0; i < persons.length; i++) {
			if(persons[i] instanceof Student)
				((Student)persons[i]).print();
			else if(persons[i] instanceof Teacher)
				((Teacher)persons[i]).print();
			else if(persons[i] instanceof Employee)
				((Employee)persons[i]).print();
		}

	}

}
