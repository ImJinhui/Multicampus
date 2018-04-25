package test;

public class ConversationBook extends Book {
	private String language;

	public ConversationBook() {
		super();
	}

	public ConversationBook(int productId, String description, String producer, int price, int isbn, String author,
			String title, String language) {
		super(productId, description, producer, price, isbn, author, title);
		this.language = language;
	}

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("언어 : " + getLanguage());
	}

}
