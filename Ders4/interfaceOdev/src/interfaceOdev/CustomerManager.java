package interfaceOdev;

public class CustomerManager{

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	public Customer add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getCustomerId() + " " + customer.getFirstName() + " "
				+ customer.getLastName() + " " + customer.getNationalityId());

		Utils.runLoggers(loggers, customer.getFirstName() + " " + customer.getLastName());
		return customer;
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : " + customer.getCustomerId() + " " + customer.getFirstName() + " "
				+ customer.getLastName() + " " + customer.getNationalityId());

	}

}
