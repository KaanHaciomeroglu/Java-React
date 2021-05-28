package interfaceOdev;

public class GameManager{
	
	
	public void add(Game game) {
		System.out.println("Kütüphaneye Oyun Eklendi : " + game.getGameName());
		System.out.println("Oyunun Fiyatý : "+game.getGamePrice()+"TL");
		System.out.println("Oyunun Ek inidirm Oraný : "+"%"+game.getGameDiscount());
		System.out.println("Oyunun indirmli fiyatý : " +game.getUnitPriceAfterDiscount()+"TL");
	}
	
	
	
}
