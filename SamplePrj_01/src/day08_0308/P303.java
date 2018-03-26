package day08_0308;

public class P303 {

	public static void main(String[] args) {
		BlockTest test1 = new BlockTest();
		BlockTest test2 = new BlockTest();
		BlockTest test3 = new BlockTest();

	}

}

class BlockTest{
	
	// 디폴트 생성자 : 마지막으로 실행됨 
	BlockTest(){
		System.out.println("BlockTest() 생성자...");		
	}
	
	static { // 클래스 초기화 블럭  : 제일 먼저 실행되며 딱 한번만 실행됨 
		System.out.println("static {..} 초기화 블럭");
	}
	
	{ // 인스턴스 초기화 블럭 : 두번째로 실행됨
		System.out.println("{...} 초기화 블럭");
	}
}
