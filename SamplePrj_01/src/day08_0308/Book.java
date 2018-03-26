package day08_0308;

public class Book {
	
	//변수
	private String title;
	private int price;
	private String author;
	
	//생성자 
	
	public Book(){
		this("책 제목", 0, "저자이름" ); // 첫번째 줄에서만 허용됨 
		
//		title = "책 제목";
//		author = "저자이름";
//		price = 0;
		
	}
	
	public Book(String s, int p){
		
		this(s, p, null);
		
		/*
		this.title = s;  //title = s;
		this.price = p;  //price = p;
		*/
	}
	
	public Book(String s, int p, String a){
		
		this.title = s;
		this.price = p;
		this.author = a;
		
	}
	
	public Book(Book book){
		
		this(book.title, book.price, book.author);
		
//		this.title = book.title;
//		this.price = book.price;
//		this.author = book.author;
	}
	
	
	//메소드
	public void print (){
		System.out.printf("Book[%s(저자:%s) : %5d원] \n", title, author, price);
	}
	
	public void setTitle(String title){
		
		this.title = title;
	}
	public void setPrice(int price){
		if(price<0){
			System.out.println("유효하지 않은 값입니다");
			return;
		}
		this.price = price;
	}
	
	public void setAuthor(String author){
		this.author= author;
	}
	
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getPrice(){
		return this.price;
	}
	
	
	
	public static void main(String[] args) {
		//아래 세개는 가비지의 대상이 됨
		new Book().print(); // new Book() : 디폴트 생성자
		new Book("자바 프로그래밍" , 35000).print();
		new Book("자바 프로그래밍" , 35000, "홍길동").print();
		
		// b1 = null 을 해야함 
		Book b1 = new Book("Spring 4.x", 37000, "고길동");
		Book b2 = new Book(b1);
		b1.print();
		b2.print();

		
	}
}
