package miniProje3;

import java.util.Scanner;

public class miniProje3 {

	public static void main(String[] args) {

		// Mükemmel Sayý Bulmak

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz :");
		int number = scanner.nextInt();

		int total = 0;

		if (number < 0) {
			System.out.println("Geçersiz Bir Sayý Girdiniz.");
			return;
		}
		if (number <= 1) {
			System.out.println("Mükemmel Sayý deðildir.");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println("Mükemmel Sayýdýr.");
		} else
			System.out.println("Mükemmel Sayý deðildir.");

	}

}
