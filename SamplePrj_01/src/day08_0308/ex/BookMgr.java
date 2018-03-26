package day08_0308.ex;

/*
 * Book  관리를 위한 BookMgr 클래스의 제약조건 
1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

*/

// 책 관리 메소드 
public class BookMgr {

	// 1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다.
	private Book[] booklist; // BookMgr클래스에서 가장 중요하게 다루는 변수
	int count = 0; // add메소드의 인덱스 지정

	// 2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다.
	public BookMgr() {
		super();
		booklist = new Book[10];
	}
	public BookMgr(int size) {
		super();
		booklist = new Book[size];
	}
	
	
	// get set 메소드
	
	public Book[] getBooklist() {
		return booklist;
	}
	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	

	// 4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
	
	public void addBook(Book book) {
		//count는 0 이상이어야 한다는 유효성검사
		// 배열은 자동으로 리사이징이 안되기 때문에 주소록이 다 차면 주소록의 사이즈를 늘려줘야함  
		if (count == booklist.length) {
			Book [] temp = new Book[booklist.length*2];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
		}
		booklist[count] = book;
		count++;
	}

	
	public void print(){
		// booklist 정보 출력
		for (int i = 0; i < count; i++) {
			booklist[i].print();
		}
	}
	
	// 5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다.
	
	public void printBookList(){
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < count; i++) {
			System.out.println(booklist[i].getTitle());			
		}
	}
	
	// 6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다.
	
	public int printTotalPrice(){
		int sum = 0;
		System.out.println("=== 책 가격의 총합 ===");
		for (int i = 0; i < count; i++) {
			sum += booklist[i].getPrice();
		}
		return sum;
	}
	
	// 책 제목 검색 메소드
	public void searchTitle(String t) {
		 
		System.out.println("=== 검색결과 ===");
			for (int i = 0; i < count; i++) {
//				if(booklist[i].getTitle().equals(t)){ //t와 (완벽하게)일치하는 정보만 출력
//				if(booklist[i].getTitle().contains(t)){ // t가 포함되어있는 정보만 출력 (공백제거 x)
				if(booklist[i].getTitle().contains(t.trim())){ // t가 포함되어있는 정보만 출력 (공백제거 o)
					booklist[i].print();
				}
			}
		}
}
	
//	

