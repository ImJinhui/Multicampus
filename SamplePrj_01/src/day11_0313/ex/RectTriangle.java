package day11_0313.ex;

public class RectTriangle extends Shape{
	
	double width;
	double height;
	
	
	
	public RectTriangle() {
		super();
	}
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	
	@Override
	double getArea() {
		
		return (width*height)/2;
	}
	
	

}
