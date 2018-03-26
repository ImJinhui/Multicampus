package day12_0314.ex;


public class BookTest {

	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr(5);
		
		Book b1 = new Book("SQL", 22000);
		Book b2 = new Book("Spring", 32000);
		Book b3 = new Book("Servlet&JSP", 25000);
		Book b4 = new Book("JDBC Programming", 21000);
		Book b5 = new Book("C# Programming", 21000);
		Book b6 = new Book("C# Programming", 21000);
		Book b8 = new Book("C# Programming", 21000);
		Book b7 = new Book("fhelf", 25145);
	
		mgr.addBook(b1);
		mgr.addBook(b2);
		mgr.addBook(b3);
		mgr.addBook(b4);
		mgr.addBook(b5);
		mgr.addBook(b6);
		mgr.addBook(b8);
		mgr.addBook(b7);
		
		mgr.printBookList();
		
		
	}

}
