package day11_0313;

public class Test02 {
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1.equals(s2)); // true
		
		String ss1 = "Hello";
		String ss2 = "Hello";
		System.out.println(ss1.equals(ss2)); // true
		
		Employee emp1 = new Employee("홍길동", "");
		Employee emp2 = new Employee("홍길동", "기획실");
		Teacher t = new Teacher();
		System.out.println(emp1.equals(t));
		System.out.println(emp1.equals(emp2)); 
		// false : 오버라이딩을 하지 않아서 부모 객체인 Object클래스의 equals()가 동작해서 emp1과 emp2에 담겨있는 주소를 비교함
		
		
	
	}

}
