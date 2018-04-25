package collection;

import java.util.HashSet;


public class HashSetEx1 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>(); //set은 순서를 저장하지 않기 때문에 중복저장이 불가능 
		
		set.add("Dog");
		set.add("Cat");
		set.add("Tiger");
		set.add("Lion");
		set.add("Cat");
		
		System.out.println(set);

	}

}
