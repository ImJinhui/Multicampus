package util;

//enum Size{ // 상수들의 묶음 
//	SMALL, 
//	MEDIUM,
//	LARGE,
//	EXTRA_LARGE
//}

class Size{ // enum 을 안쓴다면 
	public static final int SMALL = 0;
	public static final int LARGE = 100;
	
}
public class EnumTest {

	public static void main(String[] args) {
		
		int size = Size.LARGE;
		
		
//		Size size = Size.LARGE;
		switch (size) {
		case Size.SMALL:
			System.out.println("작음");
			break;
		case Size.LARGE:
			System.out.println("큼");
			break;

		default:
			break;
		}

	}

}
