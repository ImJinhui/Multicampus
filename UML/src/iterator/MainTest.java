package iterator;

import iterator.book.Book;
import iterator.book.BookShelf;
import iterator.interfaces.IteratorM;

public class MainTest {
	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("자바의 정석"));
		bookShelf.appendBook(new Book("자바란"));
		bookShelf.appendBook(new Book("국가란"));
		bookShelf.appendBook(new Book("삶이란"));
		
		IteratorM it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
		
		
	}
}
