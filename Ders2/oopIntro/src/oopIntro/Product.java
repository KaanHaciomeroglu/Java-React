package oopIntro;

public class Product {
	
	public Product() {   //Constructor(Yapýcý)
		System.out.println("Ben Çalýþtým");
	}
	
	public Product(int id,String name,double unitPrice,String detail) {
		this(); // Parametresiz public satýrýný çalýþtýrýr
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
