package nLayeredDemoOdev.core.entities;

import nLayeredDemoOdev.core.abstracts.CheckService;
import nLayeredDemoOdev.entities.concretes.Product;

public class FirstAndLastNameChack implements CheckService{

	@Override
	public boolean check(Product product) {
		if(product.getFirstName().length()>=2 && product.getLastName().length()>=2) {
			return true;
		}
		System.out.println("Hata!!! �sim ve Soyisim iki karekterden fazla olmal�d�r...");
		return false;
	}

}
