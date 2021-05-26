package oopIntro;

public class main {

	public static void main(String[] args) {

		Product product1 = new Product(); // ReferansOluþturma,intance
		product1.setId(1);
		product1.setName("Levono V14");
		product1.setDetail("16GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(15000);
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		//Product product2 = new Product();

		//Product product3 = new Product();
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
	}

}
