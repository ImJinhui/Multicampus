package test;

import java.util.Scanner;

public class ProductInfo {

	static int productId;
	static int numberOfProduct = 0;
	static Product[] pArray = new Product[5];

	private static void addProduct(int productId) {
		Scanner scan = new Scanner(System.in);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("===메뉴를 선택하세요===");
			System.out.println("1. 상품추가 ");
			System.out.println("2. 모든 상품 조회");
			System.out.println("3. 끝내기");

			switch (scan.nextLine()) {
			case "1":
				// addProduct(ProductInfo.productId);
				if (numberOfProduct > pArray.length - 1) {
					System.out.println("더이상 추가할 수 없습니다.");
				} else {

					System.out.println("===상품 종류를 선택하세요===");
					System.out.println("1. 책 ");
					System.out.println("2. 음악CD");
					System.out.println("3. 회화책");

					switch (scan.nextLine()) {
					case "1":

						System.out.println("상품 설명 : ");
						String desc = scan.nextLine();
						System.out.println("생산자 : ");
						String producer = scan.nextLine();
						System.out.println("가격 : ");
						int price = scan.nextInt();
						scan.nextLine();
						System.out.println("ISBN : ");
						int isbn = scan.nextInt();
						scan.nextLine();
						System.out.println("저자 :");
						String author = scan.nextLine();
						System.out.println("책 제목 : ");
						String title = scan.nextLine();

						pArray[numberOfProduct] = new Book(numberOfProduct, desc, producer, price, isbn, author, title);
						numberOfProduct++;

						break;
					case "2":

						System.out.println("상품 설명 : ");
						String desc2 = scan.nextLine();
						System.out.println("생산자 : ");
						String producer2 = scan.nextLine();
						System.out.println("가격 : ");
						int price2 = scan.nextInt();
						scan.nextLine();
						System.out.println("앨범제목 : ");
						String atitle = scan.nextLine();
						System.out.println("가수 : ");
						String singer = scan.nextLine();

						pArray[numberOfProduct] = new CompactDisc(numberOfProduct, desc2, producer2, price2, atitle,
								singer);
						numberOfProduct++;
						break;
					case "3":

						System.out.println("상품 설명 : ");
						String desc3 = scan.nextLine();
						System.out.println("생산자 : ");
						String producer3 = scan.nextLine();
						System.out.println("가격 : ");
						int price3 = scan.nextInt();
						scan.nextLine();
						System.out.println("ISBN : ");
						int isbn3 = scan.nextInt();
						scan.nextLine();
						System.out.println("저자 :");
						String author3 = scan.nextLine();
						System.out.println("책 제목 : ");
						String title3 = scan.nextLine();
						System.out.println("언어 : ");
						String lang = scan.nextLine();

						pArray[numberOfProduct] = new ConversationBook(numberOfProduct, desc3, producer3, price3, isbn3,
								author3, title3, lang);
						numberOfProduct++;
						break;

					default:
						System.out.println("잘못입력 ");
						break;
					}
				}
				break;

			case "2":
				System.out.println("===모든 상품 조회===");

				for (int i = 0; i < pArray.length; i++) {
					pArray[i].showInfo();
					if (pArray[i].equals(null)) {
						break;
					}
					System.out.println();
				}

				break;
			case "3":
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("잘못입력 ");
				break;
			}
		}

	}

}
