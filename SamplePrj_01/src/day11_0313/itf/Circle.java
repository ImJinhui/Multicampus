package day11_0313.itf;

//class Circle implements Shape, Drawable{
class Circle implements ShapeDrawable{

	int r;
	
	
	public Circle() {
		super();
	}
	public Circle(int r) {
		super();
		this.r = r;
	}



	@Override
	public double area() {
		
		return Math.PI*r*r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	@Override
	public void draw() {
		System.out.println(toString() + "그리기");
		
	}
	
	
	
}