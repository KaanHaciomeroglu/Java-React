package miniProje1;

import java.util.Scanner;

public class miniProje1 {

	public static void main(final String[] args) {

		// Say� Asal m�?

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Say� Giriniz :");
		int number = scanner.nextInt();

		System.out.println("Girdi�iniz Say� : " + number);

		int remainder = number % 2;
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Ge�ersiz Say�.");
			return;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime) {
			System.out.println("Say� asald�r.");
		} else {
			System.out.println("Say� asal de�ildir.");
		}

	}
}
