package day09_0309.ex;

public class Teacher extends Person {

	// 변수
	private String subject;

	// 생성자
	public Teacher() {
		super();
	}

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// get set
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	// print메소드
	public void print() {

		System.out.printf("이름:%s   나이:%d   담당과목:%s \n", super.getName(), super.getAge(), this.subject);

	}
}
