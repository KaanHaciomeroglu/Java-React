package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements ICustomerService {
	
	public void save(Customer customer) {
		
		System.out.println("Veritaban�na kaydedildi : " + customer.firstName + " " + customer.lastName);
		
	}

}
