package homework;

public class Product {
	// 필드
	String product;
	int price;

	// 생성자
	Product(String product, int price) {
		this.product = product;
		this.price = price;
	}

	// 메소드
	void getPrice() {
		System.out.println(product + " : " + price);
	}
}
