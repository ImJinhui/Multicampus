package day06_0306;

import day05_0305.Student;

public class TVTest {

	public static void main(String[] args) {
		// 인스턴스 메소드(주소가 필요), 클래스 메소드
		// 인스턴스 변수, 클래스 변수

		TV t1 = new TV();
		t1.color = "black";
		if (t1.isPower() == false) {
			t1.power();
		}
		t1.channelUp();
		t1.channelUp();
		t1.print();

		TV t2 = new TV();
//		t2 = t1;
		t2.print();
		/*
		int[] num = new int[3];
		String[] names = new String[3];
		Student[] students = new Student[3];
		TV[] t = new TV[3];
		*/
		
		System.out.println("=====================================");
		int[] num = {7,9,2};
		String[] names = {"홍", "김", "고"};
		Student[] students = {new Student(), new Student(), new Student()};
//		TV[] t = {new TV(), new TV(), new TV()};
		TV[] t = {t1, t2, new TV()};
		
		for (Student data : students) {
			data.display();
		}
		System.out.println("=====================================");
		for (int i = 0; i < students.length; i++) {
			students[i].display();
		}
		
		for(TV data:t){
			data.print();	
		}
		System.out.println("=====================================");
		for (int i = 0; i < t.length; i++) {
			t[i].print();
		}
		
	}

}
