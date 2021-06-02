package nLayeredDemoOdev.dataAccess.concretes;

import java.util.List;

import nLayeredDemoOdev.dataAccess.abstracts.ProductDao;
import nLayeredDemoOdev.entities.concretes.Product;

public class RandomProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Random ile eklendi : "+product.getFirstName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Random ile güncellendi : "+product.getFirstName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Random ile silindi : "+product.getFirstName());
		
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
