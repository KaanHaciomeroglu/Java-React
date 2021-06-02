package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entitiy;

public class Product implements Entitiy{
	private int id;
	private int categoryId;
	private String name;
	private double unitePrice;
	private int unitsInStock;

	public Product() {
	}


	public Product(int id, int categoryId, String name, double unitePrice, int unitsInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitePrice = unitePrice;
		this.unitsInStock = unitsInStock;
	}

	public int getId() {
		return id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getName() {
		return name;
	}

	public double getUnitePrice() {
		return unitePrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUnitePrice(double unitePrice) {
		this.unitePrice = unitePrice;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}
