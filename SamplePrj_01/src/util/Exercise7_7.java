package util;

class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x="+c.getX());
	}
}

class Parent {
	int x=100;
	
	Parent() {
		this(200);
		System.out.println("Parent()");
	}
	Parent(int x) {
		this.x = x;
		System.out.println("Parednt(int)");
	}
	int getX() {
		return x;
	}
}
class Child extends Parent {
	int x = 3000;
	Child() {
		this(1000); 
		System.out.println("Child()");
	}
	Child(int x) {
		this.x = x;
		System.out.println("Child(int)");
	}
}


