package test;

public class CompactDisc extends Product {
	private String title;
	private String singer;

	public CompactDisc() {
		super();
	}

	public CompactDisc(int productId, String description, String producer, int price, String title, String singer) {
		super(productId, description, producer, price);
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void showInfo() {
		System.out.println("상품아이디 : " + super.getProductId());
		System.out.println("상품설명 : " + super.getDescription());
		System.out.println("생산자 : " + super.getProducer());
		System.out.println("가격 : " + super.getPrice());
		System.out.println("앨범제목: " + getTitle());
		System.out.println("가수 : " + getSinger());

	}

}
