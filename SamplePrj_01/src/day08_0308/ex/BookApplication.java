package day08_0308.ex;

public class BookApplication {
	
	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(5);
		
		// Book 객체 생성 방법 1) 
		Book b1 = new Book("Java Programming 1.8", 29000);
		mgr.addBook(b1);
		// Book 객체 생성 방법 2)
		mgr.addBook(new Book("SQL", 22000));
		mgr.addBook(new Book("Spring", 32000));
		mgr.addBook(new Book("Servlet&JSP", 25000));
		mgr.addBook(new Book("JDBC Programming", 21000));
		mgr.addBook(new Book("C# Programming", 21000));
		
		mgr.print();
		mgr.printBookList();
		System.out.println(mgr.printTotalPrice() + "원");
		
		
		mgr.searchTitle("        Programming");
		
		
	}

}
