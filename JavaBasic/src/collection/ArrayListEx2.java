package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx2 {

	public static void main(String[] args) {
		//제네릭<> : collection에 들어갈 타입을 명확하게 지정해줌. 안써도 상관없음  
		ArrayList<String> list = new ArrayList<String>(4);
		list.add("Cat");
		list.add("Lion");
		list.add("Tiger");
		list.add("Dog");
		list.add("Dragon");
		list.add("Rabbit");
		list.add("Fox");	
		System.out.println(list/*.toString()*/);
		
		
		list.set(3, "Crocodile");
		System.out.println(list/*.toString()*/); // 3번째 자리에 있는 데이터를 지우고 들어감
		
		/*
		 * list.add(3, "Crocodile");
			System.out.println(list.toString()); // 3번째 자리에 있는 데이터를 뒤로 미루고 들어감 
		 */		
		
		list.remove(4);
		System.out.println(list); 
		
		Collections.sort(list);
		System.out.println(list); 
	}

}
