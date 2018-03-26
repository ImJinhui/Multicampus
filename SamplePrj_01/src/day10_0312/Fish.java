package day10_0312;

public class Fish extends Animal{
	String kind;

	Fish() {
		super();
	}

	Fish(String kind) {
		super();
		this.kind = kind;
	}
	
	Fish(String superkind, String kind) {
		super(superkind);
		this.kind = kind;
	}
	
	@Override // 애노테이션이 잘못 오버라이딩하면 잡아줌 
	public void breath() {
		System.out.println("아가미");
	}
}
