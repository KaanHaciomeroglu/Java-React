package miniProje4;

import java.util.Scanner;

public class miniProje4 {

	public static void main(String[] args) {

		//Arkadaþ Sayýlar
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Sayýyý Giriniz :");
		int sayi1 = scanner.nextInt();
		System.out.println("2. Sayýyý Giriniz :");
		int sayi2 = scanner.nextInt();
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1 = toplam1 + i;
			}
		}
		
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2 = toplam2 + i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu iki sayý arkadaþtýr");
		}else {
			System.out.println("Bu iki sayý arkadaþ deðildir");
		}
		
		
		
		
		
		

	}

}
