package day11_0313.ex;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle rt = new Rectangle(5, 6);
		RectTriangle rtt = new RectTriangle(6, 2);
		
		Shape[] s = {rt, rtt};
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("area : " + s[i].getArea());
			
			if (s[i] instanceof Resizable){
				((Resizable)s[i]).resize(0.5);
				System.out.println("newarea : " + s[i].getArea());
			}
		}

	}

}
