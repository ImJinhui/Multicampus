package oop.singleton; // 굳이 여러개의 객체를 생성할 필요가 없을 때 

class Book{
	static Book b;
	private Book(){
		System.out.println("객체생성");
	}
	public static Book getInstance(){
		if(b == null){ // 첫번째만 객체생성됨 
			b = new Book(); 
		}
		return b;
	}
	
}

public class MainTest {

	public static void main(String[] args) {
		
		
		
		
		
		Book b1 = Book.getInstance();
		Book b2 = Book.getInstance();
		Book b3 = Book.getInstance();
		

	}

}
