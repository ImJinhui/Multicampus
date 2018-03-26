package day10_0312.ex;

public class Rectangular extends Shape{
	
	// 변수
	
	private double width;
	private double height;
	
	// 생성자
	public Rectangular() {
		super();
	}

	public Rectangular(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	//get set

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void calculationArea() {
		super.area = width * height;
		
	}
	
	
	
	
	

}
