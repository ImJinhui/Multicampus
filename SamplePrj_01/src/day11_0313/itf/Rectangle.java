package day11_0313.itf;

//class Rectangle implements Shape, Drawable{
class Rectangle implements ShapeDrawable{
	int width, height;
	
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	
	
	@Override
	public double area() {
		
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	@Override
	public void draw() {
		System.out.println(toString() + "그리기");
		
	}
	
	
	
}