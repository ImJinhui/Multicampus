package day12_0314;

public class InnerTest {

	public static void main(String[] args) {
		A a = new A();
		a.p();
		
		A.B b = new A().new B();
		b.bp();
		
		a.print();
		
	}

}

class A{
	String name = "A";
	void p(){
		System.out.println("여기는 A");
		System.out.println(name);
	}
	
	void print(){
		new B().bp();
	}
	
	class B{
		void bp(){
			System.out.println("여기는 A안의 B");
			System.out.println(name);
		}
	}
	
	static class S{
		
	}
}


