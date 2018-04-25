package test;

public class Book extends Product {
	private int isbn;
	private String author;
	private String title;

	public Book() {
		super();
	}

	public Book(int productId, String description, String producer, int price, int isbn, String author, String title) {
		super(productId, description, producer, price);
		this.isbn = isbn;
		this.author = author;
		this.title = title;
	}

	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	///
	public void showInfo() {
		System.out.println("상품아이디 : " + super.getProductId());
		System.out.println("상품설명 : " + super.getDescription());
		System.out.println("생산자 : " + super.getProducer());
		System.out.println("가격 : " + super.getPrice());
		System.out.println("ISBN번호 : " + getIsbn());
		System.out.println("책 제목 : " + getTitle());
		System.out.println("저자 : " + getAuthor());
	}

}
