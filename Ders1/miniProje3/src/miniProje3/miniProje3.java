package miniProje3;

import java.util.Scanner;

public class miniProje3 {

	public static void main(String[] args) {

		// M�kemmel Say� Bulmak

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Say� Giriniz :");
		int number = scanner.nextInt();

		int total = 0;

		if (number < 0) {
			System.out.println("Ge�ersiz Bir Say� Girdiniz.");
			return;
		}
		if (number <= 1) {
			System.out.println("M�kemmel Say� de�ildir.");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}

		if (total == number) {
			System.out.println("M�kemmel Say�d�r.");
		} else
			System.out.println("M�kemmel Say� de�ildir.");

	}

}
