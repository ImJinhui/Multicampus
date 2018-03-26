package day11_0313.itf;

public class Test01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);		
		Rectangle r1 = new Rectangle(4, 2);
		
		Shape[] s = {c1, r1};
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i].area());
			if(s[i] instanceof Drawable)
			((Drawable)s[i]).draw();
			
		}
		
		System.out.println("==========================");
		
		
		ShapeDrawable[] sd = {c1, r1};
		for (int i = 0; i < sd.length; i++) {
			System.out.println(sd[i].area());
			sd[i].draw();
		}
	}

}
