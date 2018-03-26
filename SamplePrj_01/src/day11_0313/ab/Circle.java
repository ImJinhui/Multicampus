package day11_0313.ab;

public class Circle extends Shape{
	
	double area;
	double radius;
	
	@Override
	double area() {
		area = Math.PI * radius * radius;
		return area;
	}

}

abstract class Shape{
	protected double area;
	abstract double area();
	void print(){
		
	}
}