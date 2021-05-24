package intro;

public class Main {

	public static void main(final String[] args) {

		// camelCase
		// Don't repeat yourself
		final String internetSubeButonu = "Ýnternet Þubesi";
		final double dolarDun = 8.18;
		final double dolarBugun = 8.20;
		final int vade = 36;
		final boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		// Þarta dair çýktý alma
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar Düþtü Resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Yükseldi Resmi");
		} else {
			System.out.println("Dolar Eþittir Resmi");
		}

		/*
		 * String kredi1 = "Hýzlý Kredi"; String kredi2 = "Mutlu Emekli Kredisi"; String
		 * kredi3 = "Konut Kredisi"; String kredi4 = "Çiftçi Kredisi"; String kredi5 =
		 * "Msb Kredisi";
		 * 
		 * System.out.println(kredi1); System.out.println(kredi2);
		 * System.out.println(kredi3); System.out.println(kredi4);
		 * System.out.println(kredi5);
		 */

		final String[] krediler = {

				"Hýzlý Kredi", "Mutlu Emekli Kredisi", "Konut Kredisi", "Çiftçi Kredisi", "Msb Kredisi", "Meb Kredisi",
				"Ýhtiyaç kredisi" };

		// foreach
		for (final String kredi : krediler) {
			System.out.println(kredi);
		}

		/*
		 * Ýki döngüde aynýþey ancak alttaki döngü sayaç tabanlý
		 * 
		 * for(int i = 0; i<krediler.length;i++) { System.out.println(krediler[i]); }
		 */

//ODEV

		// En büyük sayýyý bulma
		final int sayi1 = 20;
		final int sayi2 = 25;
		final int sayi3 = 2;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En Buyuk : " + enBuyuk);

		// For
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");

		// While
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");

		// Do - While
		int j = 1;
		do {
			System.out.println("Log");
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do - While döngüsü bitti");

		// Arrays
		final String ogrenci1 = "Engin";
		final String ogrenci2 = "Derin";
		final String ogrenci3 = "Salih";

		final String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Kaan";

		for (int a = 0; a < ogrenciler.length; a++) {
			System.out.println(ogrenciler[a]);
		}

		System.out.println("#####################################");
		for (final String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

		// Array reCap demo
		final double[] myList = { 1.2, 1.3, 4.3, 6.3 };
		double total = 0;
		double max = myList[0];
		for (final double number : myList) {
			if (max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En buyuk = " + max);

		// Array multiDimensional
		final String[][] sehirler = new String[3][3];

		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";

		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";

		sehirler[2][0] = "Diyarbakýr";
		sehirler[2][1] = "Þanlýurfa";
		sehirler[2][2] = "Gaziantep";

		for (int b = 0; b <= 2; b++) {
			System.out.println("---------------");
			for (int c = 0; c <= 2; c++) {
				System.out.println(sehirler[b][c]);
			}
		}

		System.out.println("---------------");
		// Strings
		final String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman Sayýsý :" + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("b"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));

		final char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));

		final String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 8));

		for (final String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		System.out.println(mesaj.trim());// Baþýndaki ve sonundaki boþluðu siler

	}
	
	

}