package day10_0312;

public abstract class Animal {

	 String kind = "Animal_kind";
	
//	생성자
	
	protected Animal(){
//		System.out.println("생성자 : Animal(디폴트)수행");
		
	}
	
	Animal(String kind){
//		System.out.println("생성자 : Animal(" + kind + ") 수행");
		this.kind = kind;
	}
	
	
// 추상메소드
	public abstract void breath();

}
