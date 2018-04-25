package thread.basic.ex;

class Bread {
	String bread;
	boolean isChecked = false;

	public void setBread(String bread) {
		isChecked = true;
		synchronized (this) {
			notifyAll();// blocking상태에 있는 모든 애들을 꺼내옴
		}
		this.bread = bread;
	}

	public String getBread() {
		if (isChecked == false) {
			try {
				synchronized (this) {
					wait(); // blocking상태로 만듬?
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return bread;
	}
}

class Baker extends Thread {
	Bread bbang;

	Baker(Bread bbang) {
		this.bbang = bbang;
	}

	public void run() {
		bbang.setBread("맛있는 빵");
	}
}

class Customer extends Thread {
	Bread bbang;

	Customer(Bread bbang) {
		this.bbang = bbang;
	}

	public void run() {
		System.out.println("빵을 사감 : " + bbang.getBread());
	}
}

class BreadTest {
	public static void main(String[] args) {
		Bread bread = new Bread();

		Baker baker = new Baker(bread);
		Customer customer = new Customer(bread);

		customer.start();
		baker.start();

		try {
			customer.join();
			baker.join();
		} catch (Exception ex) {
		}

	}
}
