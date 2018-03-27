package template;

public class MainTest {

	public static void main(String[] args) {
		AbstractDisplay d1 = new CharDisplay('가');
		AbstractDisplay d2 = new StringDisplay("행복합니다");
		AbstractDisplay d3 = new StringDisplay("조원들과 함께");
		
		// 사용자한테 원하는 타입을 입력받아 처리한다면?
		d1.display();
		d2.display();
		d3.display();
	}

}
