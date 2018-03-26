package day07_0307;

public class P265 {

	public static void main(String[] args) {
		
		int x = 99;
		DataParam.change(x);
		System.out.println(x); //99
		System.out.println("===============");
		
		
		Data d = new Data();
		d.x = 99;
		DataParam.change(d);
		System.out.println(d.x); // 100
		System.out.println("===============");
		
		System.out.println();
		System.out.println('a');
		System.out.println(true);
		System.out.println(99);
		System.out.println(99.9);
		System.out.println("~~~~");
		
	}

}

class Data{
	int x;
	
}

class DataParam{  // 메소드 오버로딩 
	static void change(int data){ // 기본형 데이터
		data = 100;
	}
	static void change(Data data){ // 참조형 매개변수
		data.x = 100;
	}
}