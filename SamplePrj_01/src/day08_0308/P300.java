package day08_0308;

public class P300 {

	int x = 3333 ;
	int y=x;
	static double pi = 3.14; 
	
	public static void main(String[] args) {

		int x =9;
		int y=x;
		
		System.out.println(x);
		System.out.println(new P300().x);
		System.out.println(y);
		System.out.println(pi);
		System.out.println(new P300().y);

	}

}
