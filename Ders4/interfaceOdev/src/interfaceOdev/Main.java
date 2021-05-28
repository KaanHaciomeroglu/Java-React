package interfaceOdev;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = { 
				new EdevletLogger() 
				};

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer kaan = new Customer(11, 1, "Kaan", "Hac��mero�lu", "123456789");
		Customer engin = new Customer(12, 2, "Engin", "Demiro�", "456789101");

		customerManager.add(kaan);

		GameManager gameManager = new GameManager();

		Game gtav = new Game();
		gtav.setUserId(91);
		gtav.setGameId(1);
		gtav.setGameName("GtaV");
		gtav.setGamePrice(100);
		gtav.setGameDiscount(30);
		gtav.getUnitPriceAfterDiscount();

		gameManager.add(gtav);

		customerManager.delete(engin);

	}

}
