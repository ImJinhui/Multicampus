package thread.basic.ex;

class Count {
	int i;

	//synchronized : 하나만 접근할수있게 rock을 검 
	void increment() {
		synchronized(this){
			i++;
		}
		//다른 코딩도 있는 경우 
		
		
	}
}

class ThreadCount extends Thread {
	Count cnt;

	public ThreadCount(Count cnt) {
		super();
		this.cnt = cnt;
	}

	public void run() {
		for (int i = 0; i < 10000000; i++) {
			cnt.increment();
		}
	}

}

public class SynchTest {

	public static void main(String[] args) {
		Count count = new Count();
		ThreadCount tc1 = new ThreadCount(count);
		ThreadCount tc2 = new ThreadCount(count);

		tc1.start();
		tc2.start();

		try {
			tc1.join();
			tc2.join();
		} catch (InterruptedException e) {
		}

		System.out.println("총수:" + count.i);
	}

}
