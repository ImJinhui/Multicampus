package day10_0312;

public class P318 {

	public static void main(String[] args) {
		Circle c1 = new Circle(new Point(3,4),6, "RED");
		c1.print();
		c1.draw();
		
		Circle c2 = new Circle(new Point(9,9),3, "BLACK");
		c2.print();
		c2.draw();

	}

}

class Point{
	int x;
	int y;
	
	// 생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// 메소드
	public void print(){
		System.out.printf("Point[%d, %d] \n", x, y);
	}
	
}



class Shape{
	String color;
	
	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}



	public void draw(){
		System.out.println(color + "로 도형 그리기");
	}
	 
}


class Circle extends Shape{
	Point p;
	int r;
	
	public Circle() {
		super();
	}

	public Circle(Point p, int r, String color) {
		super(color);
//		super.color = color;
		this.p = p;
		this.r = r;
	}
	
	public void print(){
		if(p != null){
			p.print();
		}
		System.out.println("반지름 : " + r);
	}
	
}


class Triangle extends Shape{
//	Point p1, p2, p3;
	
	Point[] point = new Point[3];
}