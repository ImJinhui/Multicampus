package thread.basic.ex;

public class RunnableTest {

	public static void main(String[] args) {
		
		MakeTaxi m1 = new MakeTaxi("택시 틀 만들기");
		Thread t1 = new Thread(m1);
		t1.start();
		
/*		MakeTaxi m2 = new MakeTaxi("엔진부착");
		Thread t2 = new Thread(m2);
		t2.start();
*/
		new Thread(new MakeTaxi("엔진부착")).start();
		
		try {
			t1.join(); // 끝날때까지 기다려라 join
//			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로세스 종료");
	}

}

//1. Thread 클래스 상속이 불가한 경우(이미 상속받은게 있는경우) : Runnable 구현
class MakeTaxi implements Runnable{
	String work;

	MakeTaxi(String work){
		this.work = work;
	}

// 2. run() overriding 
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(work + "작업중");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}