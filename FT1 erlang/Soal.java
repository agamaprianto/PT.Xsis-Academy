package FT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal {

	public static void Soal1() {// deret

		Scanner s = new Scanner(System.in);

		System.out.print("Input panjang deret : ");
		int n = s.nextInt();

		int deretGanjil = 2, deretGenap = -2;
		int[] arrayGanjil = new int[n];
		int[] arrayGenap = new int[n];
		int[] arrayTotal = new int[n];

		for (int i = 0; i < arrayGanjil.length; i++) {
			arrayGanjil[i] = deretGanjil;
			deretGanjil += arrayGanjil.length - i - 1;
			if (i == arrayGanjil.length - 1) {
				System.out.print(arrayGanjil[i]);
			} else {
				System.out.print(arrayGanjil[i] + ", ");
			}
		}
		System.out.println();
		for (int i = 0; i < arrayGenap.length; i++) {
			arrayGenap[i] = deretGenap;
			deretGenap -= 2;
			if (i == n - 1) {
				System.out.print(arrayGenap[i]);
			} else {
				System.out.print(arrayGenap[i] + ", ");
			}
		}
		System.out.println();
		for (int i = 0; i < arrayTotal.length; i++) {
			arrayTotal[i] = arrayGanjil[i] + arrayGenap[i];
			if (i == n - 1) {
				System.out.print(arrayTotal[i]);
			} else {
				System.out.print(arrayTotal[i] + ", ");
			}
		}

	}

	public static void Soal2() {// hitung point

		Scanner s = new Scanner(System.in);

		System.out.print("Beli pulsa : ");
		int pulsa = s.nextInt();

		int point = 0;
		if (pulsa <= 10000) {
			point = 0;
		} else if (pulsa <= 30000) {
			pulsa -= 10000;
			point = (int) (pulsa / 1000);
		} else {
			pulsa -= 30000;
			point = (int) (pulsa / 1000) * 2 + 20;
		}
		System.out.println(point + " point");

	}

	public static void Soal3() {// total buah

		Scanner s = new Scanner(System.in);
//		Apel:1, Pisang:3, Jeruk:1, Apel:3, Apel:5, Jeruk:8, Mangga:1

		String answer = "Y";

		int apel = 0, jeruk = 0, mangga = 0, pisang = 0;
		System.out.println("Buah = Apel, Jeruk, Mangga, Pisang");
		System.out.println("Masukkan nama buah (ex:Apel:1,pisang:2): ");
		String buah = s.next().toLowerCase();

		String[] pecahBuah = buah.split(",");
		String[] kuantitas = new String[pecahBuah.length];
		for (int i = 0; i < pecahBuah.length; i++) {
			kuantitas = pecahBuah[i].split(":");
			for (int j = 0; j < kuantitas.length; j++) {
				System.out.println(kuantitas[j] + " ");
			}
		}
//		while (answer.toUpperCase().equals("Y")) {
//
//			switch (buah) {
//			case "apel":
//				System.out.print("Apel   : ");
//				int apelInput = s.nextInt();
//				apel += apelInput;
//				break;
//
//			case "jeruk":
//				System.out.print("Jeruk  : ");
//				int jerukInput = s.nextInt();
//				jeruk += jerukInput;
//				break;
//
//			case "mangga":
//				System.out.print("Mangga : ");
//				int manggaInput = s.nextInt();
//				mangga += manggaInput;
//				break;
//
//			case "pisang":
//				System.out.print("Pisang : ");
//				int pisangInput = s.nextInt();
//				pisang += pisangInput;
//				break;
//
//			default:
//				System.out.println("Anda hanya bisa memilih buah Apel, Jeruk, Mangga, Pisang");
//				break;
//			}
//
//			System.out.println("Mau tambah buah lain?(Y/N)");
//			answer = s.next();
//		}
//		System.out.println("Apel : " + apel);
//		System.out.println("Jeruk : " + jeruk);
//		System.out.println("Mangga : " + mangga);
//		System.out.println("Pisang : " + pisang);

	}

	public static void Soal4() {// format waktu

		Scanner s = new Scanner(System.in);

		System.out.println("input waktu (12:35 atau 12:35 AM) ");
		String waktu = s.nextLine().toUpperCase();

		int jam = Integer.parseInt(waktu.substring(0, 2));
		int menit = Integer.parseInt(waktu.substring(3, 5));
		String kondisi = "";
		int jamAkhir = 0;

		if (waktu.length() == 8) {
			kondisi = waktu.substring(6);
			if (kondisi.equals("AM")) {
				if (jam == 12) {
					waktu = "00" + waktu.substring(2, 5);
				} else if (jam < 12) {
					waktu = waktu.substring(0, 5);
				}
				System.out.println(waktu);
			} else if (kondisi.equals("PM")) {
				if (jam >= 12) {
					waktu = waktu.substring(0, 5);
				} else if (jam < 12) {
					jamAkhir = jam + 12;
					waktu = jamAkhir + waktu.substring(2, 5);
				}
				System.out.println(waktu);
			}
		} else if (waktu.length() == 5) {
			if (jam >= 12) {
				if (jam == 12) {
					waktu = waktu + " PM";
				} else {
					jamAkhir = jam - 12;
					waktu = jamAkhir + waktu.substring(2, 5) + " PM";
				}
			} else if (jam < 12) {
				if (jam == 0) {
					jamAkhir += 12;
					waktu = jamAkhir + waktu.substring(2, 5) + " AM";
				} else {
					waktu = waktu + " AM";
				}
			}
			System.out.println(waktu);
		} else {
			System.out.println("Masukkan format waktu yang sesuai!");
		}

	}

	public static void Soal5() {// cek char

		Scanner s = new Scanner(System.in);
//		string : abcdzzz
//		array : [1, 2, 2, 4, 4, 26, 26]

		System.out.print("String : ");
		String huruf = s.nextLine().toLowerCase().replaceAll("\\P{L}+", "");
		;

		char[] arr = huruf.toCharArray();

		System.out.println("Array : ");
		int[] angka = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("nilai " + (i + 1) + " : ");
			int arrayInput = s.nextInt();
			angka[i] = arrayInput;

		}

		String output = "";
		for (int i = 0; i < arr.length; i++) {
			int tes = (int) arr[i] - 96;
			if (angka[i] == tes) {
				output += "true ";
			} else {
				output += "false ";
			}
		}
		System.out.println(output);

	}

	public static void Soal6() {// kelipatan 3, genap

		Scanner s = new Scanner(System.in);
		System.out.print("Sebanyak :");
		int n = s.nextInt();
		int[] angka = new int[n];
		Arrays.sort(angka);
		for (int i = 1; i <= angka.length; i++) {
			angka[i] = i;
			if (i % 7 != 0 && i % 12 == 0) {
				System.out.print(angka[i - 1] + " ");
			}
		}

	}

	public static void Soal7() {// deadline pekerja

		Scanner s = new Scanner(System.in);

		System.out.print("Masukkan jumlah pekerja : ");
		float y = s.nextFloat();

		float hari = 15.0f / y;
		float jam = hari * 8;
		int sisaJam = (int) (jam) % 8;
		System.out.println((int) hari + " hari " + sisaJam + " jam");
	}

	public static void Soal8() {// ciphertext

		Scanner s = new Scanner(System.in);

		System.out.print("String : ");
		String kata = s.nextLine().toLowerCase().replaceAll("\\P{L}+", "");

		System.out.print("n : ");
		int n = s.nextInt();

		if (n > 26) {
			n %= 26;
		}
		String ciphertext = "";

		char[] pecahKata = kata.toCharArray();

		for (int i = 0; i < pecahKata.length; i++) {
			char alphabet = pecahKata[i];
			if (alphabet >= 'a' && alphabet <= 'z') {
				alphabet = (char) (alphabet + n);
				if (alphabet > 'z') {
					alphabet = (char) (alphabet + 'a' - 'z' - 1);
				} else if (alphabet < 'a') {
					alphabet = (char) (alphabet + 'z' - 'a' + 1);
				}
				ciphertext += alphabet;
			}

		}

		String abjad = "abcdefghijklmnopqrstuvwxyz";
		String cipherAbjad = "";

		char[] pecahAbjad = abjad.toCharArray();

		for (int i = 0; i < pecahAbjad.length; i++) {
			char alphabetAbjad = pecahAbjad[i];
			alphabetAbjad = (char) (alphabetAbjad + n);
			if (alphabetAbjad > 'z') {
				alphabetAbjad = (char) (alphabetAbjad + 'a' - 'z' - 1);
			} else if (alphabetAbjad < 'a') {
				alphabetAbjad = (char) (alphabetAbjad + 'z' - 'a' + 1);
			}
			cipherAbjad += alphabetAbjad;
		}

		System.out.println("Original alphabet : " + abjad);
		System.out.println("Alfabet yang dirotasi : " + cipherAbjad);
		System.out.println("Hasil enkripsi : " + ciphertext);

	}

	public static void Soal9() {// fibonacci

		Scanner s = new Scanner(System.in);

		System.out.print("Input x : ");
		int n = s.nextInt();

		int[] arr = new int[100];

		int banyak = 0;

		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				arr[i] = 1;
			} else {
				arr[i] = arr[i - 2] + arr[i - 1];
			}
			if (arr[i] % 2 == 0) {
				banyak++;
			}
			System.out.print(arr[i] + " ");
			if (arr[i] <= n) {
				break;
			}

		}
		System.out.println(banyak);

	}

	public static void Soal10() {// pecah huruf vokal dan konsonan

		Scanner s = new Scanner(System.in);

		System.out.print("n : ");
		String kata = s.nextLine().toLowerCase().replaceAll("\\P{L}+", "");

		char[] pecahKata = kata.toCharArray();
		String vokal = "";
		String konsonan = "";

		Arrays.sort(pecahKata);
		for (int i = pecahKata.length - 1; i >= 0; i--) {
			if (pecahKata[i] == 'a' || pecahKata[i] == 'i' || pecahKata[i] == 'u' || pecahKata[i] == 'e'
					|| pecahKata[i] == 'o') {
				vokal += pecahKata[i];
			} else {
				konsonan += pecahKata[i];
			}
		}
		System.out.println("Huruf vokal    : " + vokal);
		System.out.println("Huruf konsonan : " + konsonan);

	}

}
