package day11_0313.ex;

public class Rectangle extends Shape implements Resizable{
	
	double width;
	double height;
	
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public void resize(double s) {
		this.width = width*s;
		this.height = height*s;
//		double newarea = this.width*this.height;
//		System.out.println("newarea : " + newarea);
	}
	@Override
	double getArea() {
		return width*height;
	}

}
