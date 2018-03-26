package day10_0312;

public class Student extends Person{
	
	// 변수
	private int id;
	
	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super(name, age);
		/*super();
		setName(name);
		setAge(age);*/
		this.id = id;
	}
	
	// get set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//print메소드
	public void print(){
		super.print();
		System.out.printf("이름:%s   나이:%d   학  번:%d \n", getName(), super.getAge(), id);
		
	}

}
