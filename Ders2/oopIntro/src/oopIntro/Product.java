package oopIntro;

public class Product {
	
	public Product() {   //Constructor(Yap�c�)
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this(); // Parametresiz public sat�r�n� �al��t�r�r
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
	
}
