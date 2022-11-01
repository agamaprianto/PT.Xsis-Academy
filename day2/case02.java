package day2;

import java.util.Scanner;

public class case02 {
	// No 1
	public static void resolve1() {
		Scanner input = new Scanner(System.in);
		int n;
		int i;
		int x = 1;

//		String temp = ""; //untuk menangpung nilai string

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
//			temp+=angka+""; 
			System.out.print(" " + x);
			x = x + 2;
		}
//		System.out.println(temp);
	}

	// No 2
	public static void resolve2( ) {
		Scanner input = new Scanner(System.in);
		int n;
		int x=2;
		int n2 = 2;
		for(int i = 0; i <= 6; i++) {	
			System.out.print(" "+n2);
			n2 = n2 + 2;
			System.out.println("Masukan Bilangan:");
			n = input.nextInt();
			for(i = 1; i <= n; i++) {			
				System.out.print(" "+x);
				x = x + 2;
			}
		}
		System.out.println();
	}

	// No 3
	public static void resolve3( ) {
		Scanner input = new Scanner(System.in);
		int n;
		int x=1;
		for(int i = 0; i <= 6; i++) {
//			System.out.print(" "+n);
//			n = n + 3;
			System.out.println("Masukan Bilangan:");
			n = input.nextInt();
			for(i = 1; i <= n; i++) {			
				System.out.print(" "+x);
				x = x + 3;
			}
		}
		System.out.println();
	}

	// No 4
	public static void resolve4() {
		Scanner input = new Scanner(System.in);
		int n;
		int i;
		int x = 1;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print(" " + x);
			x = x + 4;

		}
		System.out.println();
	}

	// No 5
	public static void resolve5() {
		Scanner input = new Scanner(System.in);

		int i, angka = 1, n;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("* ");

			} else {
				System.out.print(angka + " ");

				angka = angka + 4;
			}
		}
		System.out.println();
	}

	// No 6
	public static void resolve6() {
		Scanner input = new Scanner(System.in);

		int i, angka = 1, n;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("* ");

			} else {
				System.out.print(angka + " ");

			}
			angka = angka + 4;
		}
		System.out.println();
	}

	// No 7
	public static void resolve7() {
		Scanner input = new Scanner(System.in);

		int n;
		int i;
		int x = 2;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print(" " + x);
			x = x * 2;

		}
		System.out.println();
	}

	// No 8
	public static void resolve8() {
		Scanner input = new Scanner(System.in);

		int n;
		int i;
		int x = 3;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print(" " + x);
			x = x * 3;

		}
		System.out.println();
	}

	// No 9
	public static void resolve9() {
		Scanner input = new Scanner(System.in);

		int i, angka = 4, n;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("* ");

			} else {
				System.out.print(angka + " ");

				angka = angka * 4;
			}

		}
	}

	// No 10
	public static void resolve10() {
		Scanner input = new Scanner(System.in);

		int i, angka = 3, n;

		System.out.println("Masukan Bilangan:");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print("XXX ");

			} else {
				System.out.print(angka + " ");

			}
			angka = angka * 3;

		}
	}

}
