package miniProje2;

import java.util.Scanner;

public class miniProje2 {

	public static void main(String[] args) {

		// Kalýn Sesli ve Ýnce Sesli Harfler Bulma

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sesli Harf Giriniz :");
		String harf = scanner.nextLine();
		harf = harf.toUpperCase();
		
		switch (harf) {
		case "A":
		case "I":
		case "O":
		case "U":
			System.out.println("Kalýn Sesli Harf");
			break;

		case "E":
		case "Ý":
		case "Ö":
		case "Ü":
			System.out.println("Ýnce Sesli Harf");
			break;
		default:
			System.out.println("Girdiðiniz Harf Kalýn Sesli veya Ýnce Sesli Deðildir");

		}

	}

}
