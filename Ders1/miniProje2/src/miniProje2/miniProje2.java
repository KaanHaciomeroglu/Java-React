package miniProje2;

import java.util.Scanner;

public class miniProje2 {

	public static void main(String[] args) {

		// Kal�n Sesli ve �nce Sesli Harfler Bulma

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir Sesli Harf Giriniz :");
		String harf = scanner.nextLine();
		harf = harf.toUpperCase();
		
		switch (harf) {
		case "A":
		case "I":
		case "O":
		case "U":
			System.out.println("Kal�n Sesli Harf");
			break;

		case "E":
		case "�":
		case "�":
		case "�":
			System.out.println("�nce Sesli Harf");
			break;
		default:
			System.out.println("Girdi�iniz Harf Kal�n Sesli veya �nce Sesli De�ildir");

		}

	}

}
