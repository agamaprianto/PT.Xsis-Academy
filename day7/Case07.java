package day7;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Case07 {
	// No 5
	public static void resolve1() {
		Scanner input = new Scanner(System.in);

		String inputJarak = input.nextLine();
		String[] arrJarak = inputJarak.split(" ");

		String[] jarakTempuh = new String[arrJarak.length];
		double jarak = 0, bensin = 0, literBensin = 0;

		System.out.println("Jarak Tempuh : ");

		for (int i = 0; i < arrJarak.length; i++) {
			switch (arrJarak[i]) {
			case "1":
				jarak += 2;
				jarakTempuh[i] = "2KM";
				break;

			case "2":
				jarak += 0.5;
				jarakTempuh[i] = "500M";
				break;

			case "3":
				jarak += 1.5;
				jarakTempuh[i] = "1.5KM";
				break;

			case "4":
				jarak += 0.3;
				jarakTempuh[i] = "300M";
				break;

			default:
				System.out.println("Masukkan angka 1-4");
				break;
			}
			if (i == arrJarak.length - 1) {
				System.out.println(jarakTempuh[i] + "=");
			} else {
				System.out.println(jarakTempuh[i] + "+");
			}
		}
		System.out.println(jarak + "KM");

		while (jarak > bensin) {
			bensin += 2.5;
		}
		literBensin = bensin / 2.5;
		System.out.println("Bensin = " + (int) literBensin + "Liter");

	}

	// No 4
	public static void resolve2() {
		Scanner input = new Scanner(System.in);

		String text = input.nextLine(); // asep
//		String[] arrText = text.split(" ");

		String temp = ""; // menampung string
		for (int i = text.length() - 1; i >= 0; i--) { // i = 3; 3 >= 0 = true, 3= 3 - 1; i = 2; 2 >= 0 = true, 2 = 2-1; i =1; 
														// 1 >= 0 = true, 1 = 1-1; i = 0; 0 >=0 = true, 0 = 0-1; i = -1; -1 >= 0 = false
			char c = text.charAt(i); // c = p, c = e, c = s, c = a
			temp += String.valueOf(c); // temp = pesa
		}
		if (text.equals(temp)) { // asep == pesa
			System.out.println("Yes");
		} else {
			System.out.println("No"); // no
		}
	}

	// No 6
	public static void resolve3() {
		Scanner input = new Scanner(System.in);
		String sinyal = input.next();

		String sos = "SOS";
		int jumlah = 0;

		for (int i = 0; i < sinyal.length(); i++) {
			if (sinyal.charAt(i) != sos.charAt(i % 3))
				jumlah++;
		}
		System.out.println(jumlah);
	}

	public static void resolve4() {
		Scanner input = new Scanner(System.in);

		System.out.println("Jam Masuk: ");
		String pukulMasuk = input.nextLine();

		System.out.println("Jam Keluar: ");
		String pukulKeluar = input.nextLine();

//		int jamKeluar1 = Integer.parseInt(jamKeluar);
//		int menitKeluar1 = Integer.parseInt(menitKeluar);
//		

	}

	// No 1
	public static void resolve5() {
		Scanner input = new Scanner(System.in);

		SimpleDateFormat formatWaktu = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

		Date waktuMasuk = new Date();
		Date waktuKeluar = new Date();
		int biayaParkir = 0;

		System.out.println("masukkan waktu masuk parkiran: ");
		String inputMasukParkir = input.nextLine();

		System.out.println("masukkan waktu keluar parkiran: ");
		String inputKeluarParkir = input.nextLine();

		try {
			waktuMasuk = formatWaktu.parse(inputMasukParkir);
			waktuKeluar = formatWaktu.parse(inputKeluarParkir);
		} catch (ParseException e) {
			System.out.println("Format waktu tidak sesuai" + e);
		}

		long different = waktuKeluar.getTime() - waktuMasuk.getTime();
		long diffSeconds = different / 1000 % 60;
		long diffMinutes = different / (60 * 1000) % 60;
		long diffHours = different / (60 * 60 * 24 * 1000);
		System.out.println("selisih" + diffHours + "jam" + diffMinutes + " Menit" + diffSeconds + "detik");

		if (diffSeconds > 0 || diffMinutes > 0) {
			biayaParkir += 3000;
			for (int i = 0; i < diffHours; i++) {
				biayaParkir += 3000;
			}
		} else {
			biayaParkir += diffHours * 3000;
		}
		if (different > 0) {
			System.out.println("biaya parkir : Rp" + biayaParkir);
		} else if (different < 0) {
			System.out.println("masukkan waktu keluar lebih besar dari waktu masuk parkir");
		} else if (different == 0) {
			System.out.println("biaya parkir gratis");
		}
	}

	public static void resolve6() {
		Scanner input = new Scanner(System.in);

		SimpleDateFormat formatWaktu = new SimpleDateFormat("dd/MM/yy");

		Date waktuPinjam = new Date();
		Date waktuBalikin = new Date();
		int denda = 0;
		int LamaPinjam = 0;

		System.out.println("masukkan waktu pinjam buku: (format: 09/06/19)");
		String inputPinjam = input.nextLine();
		
		System.out.println("lama pinjam");
		String inputLamaPinjam = input.nextLine();

		System.out.println("masukkan waktu balikin buku : ");
		String inputBalikin = input.nextLine();

		try {
			waktuPinjam = formatWaktu.parse(inputPinjam);
			waktuBalikin = formatWaktu.parse(inputBalikin);
		} catch (ParseException e) {
			System.out.println("Format waktu tidak sesuai" + e);
		}

		long different = waktuBalikin.getTime() - waktuPinjam.getTime();
		long diffHours = different / (60 * 60 * 1000);
//		System.out.println(diffHours);
		long diffDay = different / (60 * 60 * 24 * 1000);
		System.out.println(diffDay);

		if (diffDay <= LamaPinjam) {
			for (int i = 0; i < diffDay - 3; i++) {
				denda = 0;
			} 
		}
		else {
//			denda = (diffDay - LamaPinjam) * 500;
		}
		if (different > 0) {
			System.out.println("");
			System.out.println("bayar denda : Rp" + denda);
		}

	}
	
	public static int resolve7(String bulan) {
		if (bulan.equalsIgnoreCase("Januari"));
			return 0;
	}
//	else if (bulan.equalsIgnoreCase("Februari")); {
//			return 1;
//	}
//	else if (bulan.equalsIgnoreCase("Maret")); {
//			return 2;
//	}
//	else if (bulan.equalsIgnoreCase("April")); {
//			return 3;
//	}
//	else if (bulan.equalsIgnoreCase("Mei")); {
//			return 4;
//	}
//	else if (bulan.equalsIgnoreCase("Juni")); {
//			return 5;
//	}
//	else if (bulan.equalsIgnoreCase("Juli")); {
//			return 6;
//	}
//	else if (bulan.equalsIgnoreCase("Agustus")); {
//			return 7;
//	}
//	else if (bulan.equalsIgnoreCase("September")); {
//			return 8;
//	}
//	else if (bulan.equalsIgnoreCase("Oktober")); {
//			return 9;
//	}
//	else if (bulan.equalsIgnoreCase("November")); {
//			return 10;
//	}
//	else if (bulan.equalsIgnoreCase("Desember")); {
//			return 11;
}
