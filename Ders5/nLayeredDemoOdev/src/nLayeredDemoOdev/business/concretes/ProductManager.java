package nLayeredDemoOdev.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nLayeredDemoOdev.business.abstracts.ProductService;
import nLayeredDemoOdev.core.abstracts.CheckService;
import nLayeredDemoOdev.dataAccess.abstracts.ProductDao;
import nLayeredDemoOdev.dataAccess.concretes.GoogleDao;
import nLayeredDemoOdev.dataAccess.concretes.RandomProductDao;
import nLayeredDemoOdev.entities.concretes.Product;

public class ProductManager implements ProductService {

	private RandomProductDao randomProductDao;
	private CheckService[] checkServices;
	private List<Product> products;
	private GoogleDao googleDao;
	

	public ProductManager(CheckService[] checkServices, RandomProductDao randomProductDao, List<Product> products) {
		this.randomProductDao = randomProductDao;
		this.checkServices=checkServices;
		this.products=products;
	}

	public ProductManager(CheckService[] checkServices, GoogleDao googleDao, ArrayList<Product> products) {
		this.googleDao = googleDao;
		this.checkServices=checkServices;
		this.products=products;
	}

	public void add(Product product) {
		for(CheckService checkService : this.checkServices) {
			if(checkService.check(product)==false) {
				System.out.println("Kullan�c� Eklenemedi...");
				return;
			}
		}
		
		int verificationCode = (int)(Math.random()*100000);
        System.out.println(verificationCode);
        Scanner scanner = new Scanner(System.in);

        System.out.println("L�tfen Do�rulama Kodunu Girin ");
        int verification = scanner.nextInt();

        if (verificationCode == verification){
            System.out.println("Do�rulama Ba�ar�l�");
        }else {
            System.out.println("Yanl�� giri� yap�ld� l�tfen tekrar deneyin");
            return;
        }
        //this.randomProductDao.add(product);
        this.googleDao.add(product);

	}

	public void update(Product product) {
		return;

	}

	public void delete(Product product) {
		return;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
