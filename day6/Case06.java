package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Case06 {
	// No 1
	public static void resolve1() {
		Scanner input = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int hasil;

		System.out.println("a: ");
		a = input.nextInt();

		System.out.println("b: ");
		b = input.nextInt();

		hasil = a + b;

		System.out.println("output:" + hasil);

	}

	// No 3
	public static void resolve2() {
		Scanner input = new Scanner(System.in);

		System.out.println("input: ");
		int n = input.nextInt();
		input.nextLine();

		int tambah = 0;
		String a = input.nextLine();
		String[] n1 = a.split(" "); /* mengubah koma di index array
		 								menjadi spasi */	 											
		for (int i = 0; i < n1.length; i++) {
			tambah = tambah + Integer.parseInt(n1[i]); /* ubah string 
			 											menjadi int	*/
		}
		System.out.println(tambah);
	}

	// No 6
	public static void resolve3() {
		/*  n = 4
		 * _ _ _ #
		 * _ _ # #
		 * _ # # #
		 * # # # #
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("input");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {	/* melakukan looping kebawah 
										sesuai inputan n */
			for (int j = 0; j < n; j++) { /* melakukan looping 
										kesamping sesuai inputan n */			
				if (i + j >= n - 1) {	// stlah looping
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	// No 5
	public static void resolve4() {
		Scanner input = new Scanner(System.in);

		System.out.println("input");
		int n = input.nextInt();

		float jumlahPositif = 0;
		float jumlahNegatif = 0;
		float jumlahSama = 0;
		//kenapa pake float ? karena outputnya koma(,)
		input.nextLine();

		String n1 = input.nextLine();
		String[] a = n1.split(" ");

		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(a[i]) > 0) { // jika array a nilainya lebih dari 0
				jumlahPositif = jumlahPositif + 1; // ditambah 1 ditampung di var jmlpositf
			}
			if (Integer.parseInt(a[i]) < 0) { // jika array a nilainya kurang dari 0
				jumlahNegatif = jumlahNegatif + 1; // ditambah 1 ditampung di var jmlnegatif
			}
			if (Integer.parseInt(a[i]) == 0) { // jika array a nilainya samadengan 0
				jumlahSama = jumlahSama + 1; // ditambah 1 ditampung di var jmlnegatif
			}
		}
		jumlahPositif = jumlahPositif / n; // kenapa dibagi n ? karena inputannya n
		jumlahNegatif = jumlahNegatif / n;
		jumlahSama = jumlahSama / n;
		System.out.println(jumlahPositif);
		System.out.println(jumlahNegatif);
		System.out.println(jumlahSama);

	}

	// No 7
	public static void resolve5() {
		Scanner input = new Scanner(System.in);

		String n = input.nextLine();
		String[] a = n.split(" ");
		int[] totalArr = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			int total = 0; // untuk nampung nilai
			for (int j = 0; j < a.length; j++) {
				if (j != i) {
					total = total + Integer.parseInt(a[j]);
				} else {
					total = total + 0;
				}
			}
			totalArr[i] = total;
		}
		Arrays.sort(totalArr); // sortir dari 
		System.out.println(totalArr[0] + " " + totalArr[totalArr.length - 1]);
	}

	// No 8
	public static void resolve6() {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();

		String n1 = input.nextLine();
		String[] a = n1.split(" ");
		int banding = 0;
		int jumlah = 0;

		for (int i = 0; i < a.length; i++) {
			if (banding == Integer.parseInt(a[i])) {
				jumlah += 1;
			}
			if (Integer.parseInt(a[i]) > banding) {
				banding = Integer.parseInt(a[i]);
				jumlah = 1;
			}
		}
		System.out.println(jumlah);
	}

	// No 9
	public static void resolve7() {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();

		String n1 = input.nextLine();
		String[] a = n1.split(" ");
		long jumlah = 0; //karena nilai panjang jadi pake long

		for (int i = 0; i < n; i++) {
			jumlah = jumlah + Long.parseLong(a[i]); //buat ubah long jadi int
		}
		System.out.println(jumlah);
	}

	// No 4
	public static void resolve8() {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();
		String[][] a = new String[n][n];
		int diagonal1 = 0; // buat hitung
		int diagonal2 = 0;
		int hasil = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = input.next();
				if (i == j) {
					diagonal1 = diagonal1 + Integer.parseInt(a[i][j]); 
				}
				if (i + j == a.length - 1) {
					diagonal2 = diagonal2 + Integer.parseInt(a[i][j]);
				}
			}
		} 
		hasil = Math.abs(diagonal1 - diagonal2); /* untuk konversi agar tidak jadi 
													minus jika ditambah/dikurang*/
		System.out.println(diagonal1);
		System.out.println(diagonal2);
		System.out.println(hasil);
	}
	
	// No 10
	public static void resolve9() {
		Scanner input = new Scanner(System.in);

		String n = input.nextLine();
		String[] a = n.split(" ");
		
		String n1 = input.nextLine();
		String[] b = n1.split(" ");
		int poinA = 0;
		int poinB = 0;
		
		for (int i = 0; i < a.length; i++) {
				if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
					poinA = poinA + 1;
				}
				else if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
					poinB = poinB + 1; 
				}
		}
		System.out.println((poinA) +" "+ (poinB));
	}
	
	// No 2
	public static void resolve10() {
		Scanner input = new Scanner(System.in);
		
		String waktu = input.nextLine();
		
		int jam = Integer.parseInt(waktu.substring(0,2));
		String tanda = waktu.substring(8);
		
		if (tanda.equals("PM")) {
			jam = jam + 12;
			System.out.println(jam +":" + waktu.substring(3,8));
		}
		if (tanda.equals("AM")) {
			if (jam == 12) {
			System.out.println("00" +":"+ waktu.substring(3,8));
			}
			else {
				System.out.println(waktu.substring(0,8));
			}
		}
//		System.out.println(tanda + " "+ jam);
		
	}
}
