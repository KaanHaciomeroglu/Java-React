package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {
				new SmsLogger(),
				new EmailLogger(),
				new DatabaseLogger(),
				new FileLogger()
		};
		
		CustomerManager customerManager = new CustomerManager(loggers);

		Customer kaan = new Customer(1, "Kaan", "Hacýömeroðlu");

		customerManager.add(kaan);

	}

}
