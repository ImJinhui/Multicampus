package day10_0312.ex;

public abstract class Shape {

	//변수
	protected double area;
	private String name;
	
	//생성자
	public Shape() {
		super();
	}
	public Shape(String name) {
		super();
		this.name = name;
	}
	
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	// 메소드
	
	public abstract void calculationArea();
	
	public void print(){

		System.out.printf("%s의 면적은 %.2f \n",name, area);
	}
	
	
	
	
	
	
	
	
	
}
