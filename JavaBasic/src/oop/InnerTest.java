package oop;

class Outer{
	static class Inner{
		static void jaja(){
			System.out.println("ff");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
//		Outer o = new Outer();
//		Outer.Inner in = new Outer.Inner();
		
		Outer.Inner.jaja();

	}

}
