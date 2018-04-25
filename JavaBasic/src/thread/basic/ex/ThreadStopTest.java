package thread.basic.ex;

public class ThreadStopTest {

	public static void main(String[] args) {
		System.out.println("메인쓰레드:" + Thread.currentThread().getName());
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 종료");
//		t.stop();
		
		mt.flag = true;
	}

}

class MyThread implements Runnable {
	boolean flag = false;
	@Override
	public void run() {
		while (!flag) {
			System.out.println("쓰레드:" + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ThreadDeath etd){
				System.out.println("stop()에 의한 예외발생");
			}
		}
	}

}