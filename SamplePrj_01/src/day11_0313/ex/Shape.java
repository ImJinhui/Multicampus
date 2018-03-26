package day11_0313.ex;

public abstract class Shape {
	
	int numSides; // 변의 수

	//
	public Shape() {
		super();
	}
	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}
	
	
	//
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	
	//
	abstract  double getArea();

}
