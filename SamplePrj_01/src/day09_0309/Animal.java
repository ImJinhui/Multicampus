package day09_0309;

public class Animal {

	
	 String kind = "Animal_kind";
	
//	생성자
	
	protected Animal(){
		System.out.println("생성자 : Animal(디폴트)수행");
		
	}
	
	Animal(String kind){
//		System.out.println("생성자 : Animal(" + kind + ") 수행");
		this.kind = kind;
	}
	
	
// 메소드
	public void breath() {
		System.out.println("폐");
	}

}
