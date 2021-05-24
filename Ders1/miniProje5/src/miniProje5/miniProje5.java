package miniProje5;

public class miniProje5 {

	public static void main(String[] args) {
		//Sayý Bulma
		
		int[] sayilar = new int [] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
		
		
		for(int sayi : sayilar) {
			if(sayi == aranacak ) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayý Mevcuttur");
		}else {
			System.out.println("Sayý Mevcut Deðildir");
		}
		
		
		
		
		
		
	}

}
