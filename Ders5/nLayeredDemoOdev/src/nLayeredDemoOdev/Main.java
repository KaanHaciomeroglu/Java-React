package nLayeredDemoOdev;

import java.util.ArrayList;

import nLayeredDemoOdev.business.abstracts.ProductService;
import nLayeredDemoOdev.business.concretes.ProductManager;
import nLayeredDemoOdev.core.abstracts.CheckService;
import nLayeredDemoOdev.core.entities.EmailCheck;
import nLayeredDemoOdev.core.entities.FirstAndLastNameChack;
import nLayeredDemoOdev.core.entities.PasswordCheck;
import nLayeredDemoOdev.dataAccess.concretes.GoogleDao;
import nLayeredDemoOdev.dataAccess.concretes.RandomProductDao;
import nLayeredDemoOdev.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		CheckService[] checkServices = {new FirstAndLastNameChack(),new EmailCheck(),new PasswordCheck()};
		//ProductService productService = new ProductManager(checkServices,new RandomProductDao(),new ArrayList<Product>());
		ProductService productService = new ProductManager(checkServices,new GoogleDao(),new ArrayList<Product>());
		
		Product product = new Product("Kaan","Hacýömeroðlu","kaanhaciomeroglu@gmail.com","123456789");
		productService.add(product);

	}

}
