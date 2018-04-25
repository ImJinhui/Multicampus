package collection;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("박보검");
		set.add("공명");
		set.add("아이린");
		set.add("웬디");
		set.add("슬기");
		set.add("조이");
		set.add("예리");
		set.add("수영");
		set.add("윤아");
		set.add("태연");
		
		
		System.out.println(set);
		System.out.println(set.subSet("가", "아"));
		System.out.println(set.headSet("아"));
		System.out.println(set.tailSet("아"));
		
		
	}

}
