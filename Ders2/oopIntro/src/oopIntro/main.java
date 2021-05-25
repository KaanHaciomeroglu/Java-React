package oopIntro;

public class main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo V14", 15000, "16GB Ram , Ý7 10700K , RTX3060"); // Referans oluþturma,intance
																								

		Product product2 = new Product(2, "Lenovo V15", 17000, "16GB Ram , Ý7 10700K , RTX3080");

		Product product3 = new Product(3, "Asus Tuf", 10000, "16GB Ram , Ý7 9700K , RTX3060");

		/*
		 * Product product3 = new Product(); product3.id = 3; product3.name =
		 * "Asus Tuf"; product3.unitPrice = 10000; product3.detail =
		 * "16GB Ram , Ý7 9700K , RTX3060";
		 */

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println("ID: " + product.id);
			System.out.println(product.name);
			System.out.println(product.unitPrice + "TL");
			System.out.println(product.detail);
			System.out.println("---------------------");
		}

		System.out.println("Length: " + products.length);

		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
		
	}

}
