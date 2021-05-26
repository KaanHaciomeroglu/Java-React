package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer kaan = new IndividualCustomer();
		kaan.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber = "99999";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { kaan, abc, hepsiBurada };

		customerManager.addMultiple(customers);

	}

}
