package interfaceOdev;

public class GameManager{
	
	
	public void add(Game game) {
		System.out.println("K�t�phaneye Oyun Eklendi : " + game.getGameName());
		System.out.println("Oyunun Fiyat� : "+game.getGamePrice()+"TL");
		System.out.println("Oyunun Ek inidirm Oran� : "+"%"+game.getGameDiscount());
		System.out.println("Oyunun indirmli fiyat� : " +game.getUnitPriceAfterDiscount()+"TL");
	}
	
	
	
}
