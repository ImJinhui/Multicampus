package day10_0312.ex;

public class Circle extends Shape{
	
	//변수
	private double radius;
	
	//생성자
	public Circle() {
		super();
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}


	// get set
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
	@Override
	public void calculationArea() {
		super.area = (Math.PI * radius * radius);
		

	}

	
	
	
}
