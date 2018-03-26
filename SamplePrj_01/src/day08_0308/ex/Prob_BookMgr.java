package day08_0308.ex;

/*
 * Book  관리를 위한 BookMgr 클래스의 제약조건 
1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

[실행결과 예시]
=== 책 목록 ===
Java Program
JSP Program
SQL Fundamentals
JDBC Program
EJB Program

=== 책 가격의 총합 ===
전체 책 가격의 합 : 132000

 */
public class Prob_BookMgr {
	
	Prob_Book[] booklist;
	int count = 0;

	//생성자
	public Prob_BookMgr() {
		super();
	}

	public Prob_BookMgr(Prob_Book[] booklist) {
		super();
		this.booklist = booklist;
	}

	
	//Book 객체를 booklist에 등록하는 addBook(Book book) 메서드
	
	public void addBook(Prob_Book book){
		this.booklist[count] = book;
		this.count++;
	}
	
	//책 목록을 화면에 출력하는 printBookList() 메서드
	
	public void printBookList(){
		System.out.println("===책 목록===");
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
		
	}
	
	//모든 책 가격의 합을 출력하는 printTotalPrice() 메서드
	
	public void printTotalPrice(){
		System.out.println("=== 책 가격의 총합 ===");
		System.out.print("전체 책 가격의 합 :");
		int sum = 0;
		for (int i = 0; i < booklist.length; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println(sum);
		
	}
	
//	public String searchTitle(String title){
//		
//		for (int i = 0; i < count; i++) {
//			if(booklist[i].getTitle() == title){
//				return booklist[i].getTitle() ;
//			}
//			else{
//				System.out.println("검색결과가 없습니다");
//				return ;
//			}		
//		}
//	}
	
	

}
