package day10_0312;

public class P352 {

	public static void main(String[] args) {
		
//		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	

	}

}

final class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton(){
		System.out.println("Singleton() 객체 생성");
	}
	
	public static Singleton getInstance(){
		if(s == null){
			s = new Singleton();
		}
		return s; 
	}
}