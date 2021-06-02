package nLayeredDemoOdev.dataAccess.abstracts;

import java.util.List;

import nLayeredDemoOdev.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	List<Product> getAll();
}
