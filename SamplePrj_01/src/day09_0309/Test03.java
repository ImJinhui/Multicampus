package day09_0309;



import java.util.Date;

import day08_0308.ex.Book;

public class Test03 {

	public static void main(String[] args) {
		// is a 관계

		Animal a = new Animal();
		Object a2 = new Animal();
		// 다운캐스팅
		// 틀렸는데 컴파일러가 못잡아줌 -> 오류발생 instanceof로 캐스팅 가능여부 체크
		if (a2 instanceof String)
			((String) a2).trim();
		if (a2 instanceof Animal)
			((Animal) a2).breath();
		
		Object d1 = new Dog();			
		Animal d2= new Dog();	
		Dog d3= new Dog();
		
		Object obj1 = new Date();
		Object obj2 = new Book();
		Object obj3 = new String("홍길동");
		Object obj4 = new Integer(5);
		
		
	}

}
