package interfaceAbstractDemo;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private static ICustomerCheckService _customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		_customerCheckService = customerCheckService;
		
	}

	public void save(Customer customer) {

		if (_customerCheckService.checkIfRealPerson(customer)) {
			
			super.save(customer);
		} else
			System.out.println("Ge�erli Giri� Yap�lmad�");

	}



}
