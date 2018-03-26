package day09_0309;

public class Test04 {

	public static void main(String[] args) {
		
		Animal f = new Fish("물고기과", "금붕어"); // 물고기과
		System.out.println(f.kind);
		f.breath(); // 오버라이딩 전 : 폐 , 후 : 아가미
		// 부모타입인데 접근 할 수 없는 자식메소드가 호출됨
		
		Fish f1 = new Fish("물고기과","금붕어"); // 금붕어
		System.out.println(f1.kind);
		f1.breath(); // 오버라이딩 전 : 폐 , 후 : 아가미
		

	}

}
