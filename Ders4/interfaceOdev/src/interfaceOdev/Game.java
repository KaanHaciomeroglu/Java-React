package interfaceOdev;

public class Game extends User {

	private int gameId;
	private String gameName;
	private double gamePrice;
	private double gameDiscount;
	private double unitPriceAfterDiscount;

	public void Game() {

	}

	public Game() {
		super(userId);
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gameDiscount = gameDiscount;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

	public int getGameId() {
		return gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public double getGameDiscount() {
		return gameDiscount;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public void setGameDiscount(double gameDiscount) {
		this.gameDiscount = gameDiscount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.gamePrice - (this.gamePrice * this.gameDiscount / 100);
	}

	public void setUnitPriceAfterDiscount(double unitPriceAfterDiscount) {
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

}
