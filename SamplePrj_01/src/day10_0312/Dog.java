package day10_0312;

public class Dog extends Animal{
	
	String kind = "Dog_kind";
	String name;
	
	
	
	public Dog() {
//		super();
//		super.kind = "개";
		super("개"); // 부모의 디폴트 생성자를 호출하는김에 한번에 초기화까지 해버림  
	}
	public Dog(String kind, String name) {
//		super();
//		super.kind = "개";
		super("개");
		
		this.kind = kind;
		this.name = name;
	}



	public void print(){
		System.out.printf("Dog[ %s, %s, %s ] \n", super.kind, this.kind, this.name);
		
	}
	@Override
	public void breath() {
		System.out.println("폐");
		
	}
}
