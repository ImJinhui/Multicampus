package collection;

import java.util.*;


public class Lotto {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		/*for (int i = 0; set.size() < 6; i++) {
			set.add((int)(Math.random()*45 +1));
		}*/
		
		while(set.size() < 6) {
			set.add((int)(Math.random()*45 +1));
		} 
		//정렬
		ArrayList list = new ArrayList(set);
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}

}
