package day08_0308.ex;

public class Prob_BookTest1 {

	public static void main(String[] args) {
		
		Prob_Book b1 = new Prob_Book("Java Program", 100);
		Prob_Book b2 = new Prob_Book("JSP Program", 100);
		Prob_Book b3 = new Prob_Book("SQL Fundamentals", 100);
		Prob_Book b4 = new Prob_Book("JDBC Program", 100);
		Prob_Book b5 = new Prob_Book("EJB Program", 100);
				
		Prob_Book[] booklist = new Prob_Book[5];
		
		Prob_BookMgr bookmgr = new Prob_BookMgr(booklist);
		
		bookmgr.addBook(b1);
		bookmgr.addBook(b2);
		bookmgr.addBook(b3);
		bookmgr.addBook(b4);
		bookmgr.addBook(b5);
		
		bookmgr.printBookList();
		bookmgr.printTotalPrice();
				
				
				
				
	}

}
