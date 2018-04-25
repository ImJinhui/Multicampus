package thread.basic.ex;

import java.io.IOException;

public class ProcessTest {

	public static void main(String[] args) {
		//process : 실행중인 프로그램 
		//Runtime클래스의 exec : 하나의 프로그램을 실행함 
		
		try {
			Runtime rt = Runtime.getRuntime();
			rt.exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
			System.out.println("프로세스 실행");
		} catch (IOException e) {
			System.out.println("실행실패");
			e.printStackTrace();
		}

	}

}
