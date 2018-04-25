package oop;

public class Test {

	// 1. 클래스 선언
	// 2. 클래스에 데이터 지정 : 생성자 지정, setter지정 
	// 3. 객체를 반환 
	// 4. 반환 된 객체 출력 
	
	public static void main(String[] args) {
		
		Member m = method();
		m.print();
		System.out.println();
		m.setAge(23);
		m.setHeight(188);
		m.setName("박보검");
		m.print();

	}
	
	static Member method(){
		String name = "홍길동";
		int age = 28;
		double height = 160.9;
		
		Member m = new Member(name, age, height);
		
		return m;
	}
	

}

class Member{
	
	 private String name ;
	 private int age;
	 private double height;
	
	 
	 public Member() {
		super();
	}


	public void print() {
		System.out.printf("이름:%s  나이:%d  키:%.2f",name, age, height);
		
	}


	public Member(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	 
	 


	
}
