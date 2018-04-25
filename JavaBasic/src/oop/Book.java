package oop;

public class Book {
	
	private static int count = 0;
	
	Book(){
		count++;
	}

	static public int getCount(){
		return count;
	}
}
