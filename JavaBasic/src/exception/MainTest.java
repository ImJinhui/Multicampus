package exception;

public class MainTest {

	public static void main(String[] args) {
		// 왜 자바의 메인함수는 static?
		// 메인을 제일 먼저 실행하려면 메인이 포함된 클래스를 찾아야하는데
		// static이 없으면 객체를 생성해야 클래스가 메모리에 올라가므로

		
		try { // 예외가 발생할 구문 
//			int result = 3/0;
			for (int i = 0; i < 4; i++) {

				System.out.println(args[i]);

			}
			System.out.println("배열 정상처리");
			return;
		} /*catch (ArrayIndexOutOfBoundsException ex) {
			//예외가 발생한 후에 처리 
			System.out.println("예외발생 : " + ex.getMessage());
			ex.printStackTrace();
		}*/catch(Exception ex){
			System.out.println("그 외 예외발생:" + ex.getMessage());
			ex.printStackTrace();
		}
		
		finally{
			System.out.println("예외에 관계없이 무조건 수행 ");
			//중간에 return이 있어도 무조건 수행됨 
			//connection close는 무조건 여기다씀 
		}

		System.out.println("프로그램 정상 종료");

	}

}
