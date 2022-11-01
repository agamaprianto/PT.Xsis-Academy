package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Case05 {
	// Day3 No 1 Bilangan Fibonacci
	public static void resolve1() {
		Scanner input = new Scanner(System.in);
		System.out.println("masukan nilai n: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;

//		System.out.print(arr[0]+ " ");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// Day3 no 3 Bilangan Prima
	public static void resolve2() {
		Scanner input = new Scanner(System.in);

		int prima = 0;
		System.out.println("Nilai n:");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			prima = 0;
			for (int j = 1; j <= n; j++) {
				if (i % j == 0) {
					prima = prima + 1;
				}
			}
			if (prima == 2) {
				System.out.print(i + ",");
			}
		}
	}

	// Day 3 no2 Fibonacci
	public static void resolve3() {
		Scanner input = new Scanner(System.in);
		System.out.println("masukan nilai n: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;

		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	// day2 no2 rotation
	public static void resolve4() {
		Scanner input = new Scanner(System.in);

		String arr = " ";
		int rotasi;

		System.out.println("Array: ");
		arr = input.nextLine();
		String[] splitArr = arr.split(",");

		System.out.println("rotasi: ");
		rotasi = input.nextInt();
		System.out.println(Arrays.toString(splitArr));

		for (int i = 1; i <= rotasi; i++) {
			System.out.println(i + ": ");

			for (int j = 0; j < splitArr.length; j++) {

				if (j + i >= splitArr.length) {
					System.out.println(splitArr[Math.abs(splitArr.length - (j + i))] + " "); // rumus absolute
				} else {
					System.out.print(splitArr[j + i] + " ");
				}
			}
		}
		System.out.println();
	}

	// Day2 no 5 vokal konsonan
	public static void resolve5() {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan Huruf: ");
		String huruf = input.nextLine();
		huruf = huruf.toLowerCase().replaceAll("\\P{L}+", "");
		char[] arr = huruf.toCharArray();
		String vocal = "";
		String konsonan = "";

		// System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
			if (arr[i] == 'a' || arr[i] == 'i' || arr[i] == 'u' || arr[i] == 'e' || arr[i] == 'o') {
				vocal += arr[i];
			} else {
				konsonan += arr[i];
			}

		}
		System.out.println("vocal : " + vocal);
		System.out.println("konsonan :" + konsonan);
	}

	// Day2 no 3 rokok
	public static void resolve6() {
		Scanner input = new Scanner(System.in);

		System.out.println("Putung Rokok");
		int putungRokok = input.nextInt();

		int batangRokok = 0; 
		batangRokok = putungRokok / 8;
		int jualRokok = 0;
		int sisa = 0;
		
		System.out.println("Rokok yang berhasil dirangkai:"+batangRokok);
		
		jualRokok = batangRokok * 500;		
		System.out.println("Harga yang dijual:" +jualRokok);
		
		sisa = putungRokok % 8;
		System.out.println("sisa:" +sisa);
	}

	// Day3 No 4 pohon faktor
	public static void resolve7() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Masukkan angka");
		int nilai = input.nextInt();
		
		System.out.println("Faktor-faktornya:");
		int tambah = 0;
		
		for (int i = 0; i <= nilai; i++) {
			tambah++;
			if (nilai % tambah == 0) {
				System.out.print(tambah + " ");

			}
		}
	}

	// No1 day2 baju
	public static void resolve8() {
		Scanner input = new Scanner(System.in);
		String baju = "";
		String celana = "";
		int uang, beli, simpan;

		System.out.println("Uang Andi: ");
		uang = input.nextInt();

		input.nextLine();

		System.out.println("Harga Baju: ");
		baju = input.nextLine();

		System.out.println("Harga Celana: ");
		celana = input.nextLine();

		// mapToInt merubah string menjadi int dan dan masukkan ke array
		int[] bajuInt = Arrays.stream(baju.split(",")).mapToInt(Integer::parseInt).toArray();
		int[] celanaInt = Arrays.stream(celana.split(",")).mapToInt(Integer::parseInt).toArray();

		System.out.println(Arrays.toString(bajuInt));
		System.out.println(Arrays.toString(celanaInt));

		int[] total = new int[bajuInt.length];
		int[] selisih = new int[bajuInt.length];

		for (int i = 0; i < bajuInt.length; i++) {
			total[i] = bajuInt[i] + celanaInt[i];
			selisih[i] = uang - total[i];
		}
		beli = selisih[0];
		simpan = total[0];

		for (int j = 1; j < bajuInt.length; j++) {
			if (beli > 0) {
				if (beli > selisih[j] && selisih[j] > 0) {
					beli = selisih[j];
					simpan = total[j];
				}
//				else {
//					beli = beli;
//					simpan = simpan;
//				}
			} else {
				beli = selisih[j];
				simpan = total[j];
			}
		}
		System.out.println();
		System.out.print("Harga Baju yang cocok = " + simpan);

		System.out.println();
	}

}