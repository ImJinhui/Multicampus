package prototype;

public class MainTest {

	public static void main(String[] args) {
		
		//--------------- 사용자측에서 원하는 구조를 만들고 사용할 수 있도록 하는 것
		
		Manager mgr = new Manager();
		
		UnderlinePen up1 = new UnderlinePen('-');
		UnderlinePen up2 = new UnderlinePen('~');
		MessageBox mb1 = new MessageBox('*');
		MessageBox mb2 = new MessageBox('+');
		
		mgr.register("밑줄", up1);
		mgr.register("물결", up2);
		mgr.register("별표상자", mb1);
		mgr.register("선 상자", mb2);
		
		//===========================================
		
		Product p1 = mgr.create("선 상자");
		p1.use("!!FRWTWGSSAf");
	}

}
