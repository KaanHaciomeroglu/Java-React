package interfaceAbstractDemo;

public interface ICustomerCheckService {
	
	
	public default boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}
	

}