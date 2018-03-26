package day12_0314.ex;

import java.util.Arrays;
public class BookMgr {
	
	private Book[] booklist;
	int count = 0;	

	
	public BookMgr() {
		super();
	}

	public BookMgr(int size) {
		super();
		booklist = new Book[size];
	}
	
	public Book[] getBooklist() {
		return booklist;
	}
	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBookList(){
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < count; i++) {
			System.out.println(booklist[i].getTitle());			
		}
	}
	
	public int printTotalPrice(){
		int sum = 0;
		System.out.println("=== 책 가격의 총합 ===");
		for (int i = 0; i < count; i++) {
			sum += booklist[i].getPrice();
		}
		return sum;
	}
	

	public void addBook(Book book) {
		
		
		if (count == booklist.length) {
			Book [] temp = new Book[booklist.length+1];
			System.arraycopy(booklist, 0, temp, 0, booklist.length);
			booklist = temp;
		}
		
		booklist[count] = book;
		
		if (count >= 1 && count < booklist.length) {
			if (booklist[count].equals(booklist[count-1])) {
				System.out.println("중복입력");
				count--;
			}
		}
		
		count++;
	}
	
	@Override
	public String toString() {
		
		return Arrays.toString(booklist);
	}
	
	

}
