package day10_0312;

public class Employee extends Person {

	// 변수
	private String dept;

	// 생성자
	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	// get set
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	// print메소드
	public void print() {

		System.out.printf("이름:%s   나이:%d   부  서:%s \n", super.getName(), super.getAge(), this.dept);
		

	}

}
