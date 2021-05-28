package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements ICustomerService {
	
	public void save(Customer customer) {
		
		System.out.println("Veritabanýna kaydedildi : " + customer.firstName + " " + customer.lastName);
		
	}

}
