package interfaceAbstractDemo;

public class Main {

	public static void main(String[] args)  {
		
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new ICustomerCheckService() {} );

		customerManager.save(new Customer(1,"Kaan","Hac��mero�lu",1999,"12345678910"));
		
		System.out.println();
		
		
	}

}
