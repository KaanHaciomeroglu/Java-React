package miniProje1;

import java.util.Scanner;

public class miniProje1 {

	public static void main(final String[] args) {

		// Sayý Asal mý?

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sayý Giriniz :");
		int number = scanner.nextInt();

		System.out.println("Girdiðiniz Sayý : " + number);

		int remainder = number % 2;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz Sayý.");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Sayý asaldýr.");
		} else {
			System.out.println("Sayý asal deðildir.");
		}

	}
}
