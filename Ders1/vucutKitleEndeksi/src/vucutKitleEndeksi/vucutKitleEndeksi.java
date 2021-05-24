package vucutKitleEndeksi;

import java.util.Scanner;

public class vucutKitleEndeksi {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Boyunuzu Giriniz(�rn: 1,73) :");
		double boy = scanner.nextDouble();

		if (boy <= 0) {
			System.out.println("Ge�ersiz Bir Say� Girdiniz.");
			return;
		}

		if (boy > 5) {
			System.out.println("L�tfen Boyunuzu Araya Virgul Koyarak Yaz�n�z.");
			return;
		}

		System.out.println("Kilonuzu Giriniz(kg) :");
		double kilo = scanner.nextDouble();

		double vki = kilo / (boy * boy);

		System.out.println("Vucut Kitle Endeksiniz : " + vki);

		if (vki < 18.5) { // 18.5 ve alt� de�er sonucu

			System.out.println("Zayifsiniz, saglikli bir sekilde kilo almalisiniz.");
		} else if (vki >= 18.5 && vki < 24.9) { // 18.5 ve 24.9 aras� de�er sonucu

			System.out.println("Kilonuz normal, duzenli egzersiz ve do�ru beslenme ile kilonuzu korumalisiniz.");
		} else if (vki >= 25 && vki < 29.9) { // 25 ve 29.9 aras� de�er sonucu

			System.out.println("Fazla kilolusunuz, diyetiysen esliginde kilo vermelisiniz");
		} else if (vki >= 30) { // 30 ve �zeri de�er sonucu

			System.out.println("Kilonuz Obazite seviyesinde, diyetiysene danisiniz.");
		}

	}

}
