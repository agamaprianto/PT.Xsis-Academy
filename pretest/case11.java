package pretest;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class case11 {

	// No 1 -- Bilangan Ganji Genap n = 10
	// output: 1 3 5 7 9
	// 2 4 6 8 10
	public static void resolve1() {
		Scanner input = new Scanner(System.in);
		System.out.println("input n: ");
		int n = input.nextInt();

		for (int j = 1; j <= n; j++) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

	}

	// No 2 -- Vocal Konsonan n=Sample Case
	// output: vocal: aaee
	// konsonan: clmpss
	public static void resolve2() {
		Scanner input = new Scanner(System.in);
		System.out.println("input n: ");
		String n = input.nextLine();
		n = n.toLowerCase().replaceAll("\\P{L}+", "");
		char[] arr = n.toCharArray();
		String vocal = "";
		String konsonan = "";

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'u' || arr[i] == 'e' || arr[i] == 'o') {
				vocal += arr[i];
			} else {
				konsonan += arr[i];
			}
		}
		System.out.println("vocal: " + vocal);
		System.out.println("konsonan: " + konsonan);

	}

	// No 4 -- Jarak linier
	// input : 1 2 3 4
	// output: 2 Liter
	public static void resolve3() {
		Scanner input = new Scanner(System.in);

		String inputJarak = input.nextLine();
		String[] arrJarak = inputJarak.split(" ");

		String[] jarakTempuh = new String[arrJarak.length];
		double jarak = 0, bensin = 0, literBensin = 0;

		System.out.println("Jarak Tempuh: ");

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
				jarak += 2.5;
				jarakTempuh[i] = "2.5KM";
				break;

			default:
				System.out.println("Rute: toko - tempat1 - tempat2 - toko");
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

	// NO 5 -- nasi goreng
	public static void resolve4() {
		Scanner input = new Scanner(System.in);

		System.out.println("laki-laki dewasa: ");
		int laki = input.nextInt();

		System.out.println("wanita dewasa: ");
		int wanita = input.nextInt();

		System.out.println("remaja: ");
		int remaja = input.nextInt();

		System.out.println("anak-anak: ");
		int anak = input.nextInt();

		System.out.println("balita: ");
		int balita = input.nextInt();

		int piringlaki = laki * 2;
		int piringwanita = wanita * 1;
		int piringremaja = remaja * 1;
		int piringanak = anak * 1 / 2;
		int piringbalita = balita * 1;
		int total = piringlaki + piringwanita + piringremaja + piringanak + piringbalita;

		if (total > 5 && total % 2 == 1) {
			piringwanita = wanita * 1;
			total += piringwanita;
		}
		System.out.println(total + " porsi");
	}

	// No 7 -- Gambaran
	public static void resolve5() {
		Scanner input = new Scanner(System.in);
		System.out.println("Jumlah kartu gambaran : ");
		int jmlKartu = input.nextInt();
		String menyerah = "n";
		while (menyerah.equals("n")) {
			System.out.println("Jumlah tawaran : ");
			int tawaran = input.nextInt();

			Random randomVal = new Random();
			int kotakA = randomVal.nextInt(10);
			int kotakB = randomVal.nextInt(10);

			System.out.println("Pilihan kotak, A atau B ? ");
			input.nextLine();
			String pilihan = input.nextLine();
			pilihan = pilihan.toLowerCase();
			System.out.println("Kotak A = " + kotakA);
			System.out.println("Kotak B = " + kotakB);
			if (pilihan.equals("a")) {
				if (tawaran < kotakA) {
					System.out.println("You Win!");
					jmlKartu += tawaran;
					System.out.println("Sisa Kartu : " + jmlKartu);
				} else if (tawaran > kotakA) {
					System.out.println("You Lose!");
					jmlKartu -= tawaran;
					System.out.println("Sisa Kartu : " + jmlKartu);
				}
			} else if (pilihan.equals("b")) {

				if (tawaran < kotakB) {
					System.out.println("You Win!");
					jmlKartu += tawaran;
					System.out.println("Sisa Kartu : " + jmlKartu);
				} else if (tawaran > kotakB) {
					System.out.println("You Lose!");
					jmlKartu -= tawaran;
					System.out.println("Sisa Kartu : " + jmlKartu);
				}
			}
			System.out.println(jmlKartu);
			if (jmlKartu <= 0) {
				menyerah = "y";
			} else {
				System.out.println("Ingin menyerah (Y/N) ? ");

				menyerah = input.nextLine();
				menyerah = menyerah.toLowerCase();
			}
		}
	}

	// No 8 -- Panjang fibonaci
	public static void resolve6() {
		Scanner s = new Scanner(System.in);

		System.out.print("input panjang/deret : ");
		int n = s.nextInt();
		int angkaAwalGanjil = 1, angkaAwalGenap = 0;
		int[] ganjil = new int[n];
		int[] genap = new int[n];
		int[] fibonacci = new int[n];
		for (int i = 0; i < n; i++) {
			ganjil[i] = angkaAwalGanjil;
			angkaAwalGanjil += 2;
			genap[i] = angkaAwalGenap;
			angkaAwalGenap += 2;
			fibonacci[i] = ganjil[i] + genap[i];
			if (i == n - 1) {
				System.out.print(fibonacci[i]);
			} else {
				System.out.print(fibonacci[i] + ", ");
			}
		}
	}

	// no 10 -- Promo
	public static void resolve7() {
		Scanner input = new Scanner(System.in);

		System.out.println("Saldo ovo: ");
		int saldo = input.nextInt();

		int cup = 0, harga = 18000, totalBelanja = 0;
		double cashback = 0.1;

		if (saldo >= 40000 && saldo <= 200000) {
			harga /= 2;
			while (saldo > harga) {
				if (saldo > harga) {
					saldo -= harga;
					cup += 1;
				}
			}
			totalBelanja += cup * harga;
			cashback = (totalBelanja * 0.1);
			saldo += cashback;
			System.out.println("jumlah cup =" + cup);
			System.out.println("saldo akhir" + saldo);
		}
		else {
			while (saldo > harga) {
				if (saldo > harga) {
					saldo -= harga;
					cup += 1;
					
				}
				
			}
		}
	}

	// No 3 --Si Angka 1 n=3
	// output: 100 adalah si angka 1
	// 103 adalah si angka 1
	// 109 adalah si angka 1
	public static void resolve8() {
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = input.nextInt();
		int awal = 100;
		int counter = 0;
		while (counter < n) {
			String awalString = String.valueOf(awal);
			while (awalString.length() > 1) {
				String tmpStr = "";
				int tmpInt = 0;
				for (int i = 0; i < awalString.length(); i++) {
					tmpStr = Character.toString(awalString.charAt(i));
					tmpInt += Math.pow(Integer.parseInt(tmpStr), 2);
				}
				awalString = String.valueOf(tmpInt);
				if (awalString.equals("1")) {
					System.out.println(awal + " adalah si angka 1");
					counter += 1;
				}
			}
			awal += 1;
		}
	}

	// No 6 --Transfer Uang
	public static void resolve9() {
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan pin : ");
		String pin = input.nextLine();
		String truePin = "123456";
		String status = "salah";
		if (!pin.equals(truePin)) {
			System.out.println("Pin salah");
			System.out.println("Masukkan kembali pin : ");
			pin = input.nextLine();
		} else {
			status = "benar";
		}

		while (status.equals("salah")) {
			System.out.println("Pin salah");
			System.out.println("Masukkan kembali pin : ");
			pin = input.nextLine();
			if (!pin.equals(truePin)) {
				System.out.println("Pin salah");
			} else {
				status = "benar";
			}
		}

		System.out.print("Uang yang disetor : ");
		long saldo = 0;
		long uangDisetor = input.nextLong();
		saldo += uangDisetor;
		System.out.println("Pilihan Transfer : 1. Antar Rekening \t 2.Antar Bank");
		System.out.println("Masukkan pilihan : ");
		int pilihan = input.nextInt();
		input.nextLine();
		String rekTujuan = "", statusRek = "";

		long nominalTrf = 0;
		switch (pilihan) {
		case 1:
			System.out.println("Masukkan rekening tujuan : ");
			rekTujuan = input.nextLine();
			statusRek = "salah";
			if (rekTujuan.length() != 10) {
				System.out.println("Panjang digit rekening tidak sesuai");
			} else {
				statusRek = "benar";
			}

			while (statusRek.equals("salah")) {
				System.out.println("Masukkan nomor rekening yang benar : ");
				rekTujuan = input.nextLine();
				if (rekTujuan.length() != 10) {
					System.out.println("Panjang digit rekening tidak sesuai");
				} else {
					statusRek = "benar";
				}
			}

			System.out.println("Masukkan nominal transfer : ");
			nominalTrf = input.nextLong();
			if (nominalTrf > saldo) {
				System.out.println("Saldo tidak mencukupi");
			} else {
				saldo -= nominalTrf;
				System.out.println("Transaksi berhasil");
				System.out.println("Saldo anda saat ini Rp." + saldo + ",-");
			}
			break;
		case 2:
			System.out.println("Masukkan kode bank : ");
			String kodeBank = input.nextLine();
			System.out.println("Masukkan rekening tujuan : ");
			rekTujuan = input.nextLine();
			statusRek = "salah";
			if (rekTujuan.length() != 10) {
				System.out.println("Panjang digit rekening tidak sesuai");
			} else {
				statusRek = "benar";
			}

			while (statusRek.equals("salah")) {
				System.out.println("Masukkan nomor rekening yang benar : ");
				rekTujuan = input.nextLine();
				if (rekTujuan.length() != 10) {
					System.out.println("Panjang digit rekening tidak sesuai");
				} else {
					statusRek = "benar";
				}
			}

			System.out.println("Masukkan nominal transfer : ");
			nominalTrf = input.nextLong();
			if (nominalTrf > saldo) {
				System.out.println("Saldo tidak mencukupi");
			} else {
				saldo -= (nominalTrf + 7500);
				System.out.println("Transaksi berhasil");
				System.out.println("Saldo anda saat ini Rp." + saldo + ",-");
			}
		}
	}

	// No 9 -- Gunung dan Lembah
	public static void resolve10() {
		Scanner input = new Scanner(System.in);
		System.out.println("Catatan perjalanan : ");
		String note = input.nextLine();
		note = note.toLowerCase();
		char[] noteArr = note.toCharArray();
		String interval = "";
		int posisi = 0;
		int jmlGunung = 0, jmlLembah = 0;
		for (int i = 0; i < (noteArr.length); i++) {
			if (noteArr[i] == 'n') {
				posisi += 1;
			} else if (noteArr[i] == 't') {
				posisi -= 1;
			}

			if (i != 0) {
				if (posisi == 0) {
					if (noteArr[i] == 'n') {
						jmlLembah += 1;
					} else if (noteArr[i] == 't') {
						jmlGunung += 1;
					}
				}
			}
		}
		System.out.println("Gunung = " + jmlGunung);
		System.out.println("Lembah = " + jmlLembah);
	}
}
