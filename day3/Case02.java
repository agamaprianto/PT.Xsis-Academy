package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Case02 {
	// No 1
	public static void resolve1() {
		Scanner input = new Scanner(System.in);

		int n1, n2, nilaiAwal= 1;

		System.out.println("n1:");
		n1 = input.nextInt();

		System.out.println("n2:");
		n2 = input.nextInt();

		int[][] arr = new int[2][n1];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {
				if (i == 0) {
					arr[i][j] = j;
				} else {
					arr[i][j] = nilaiAwal;
					nilaiAwal = nilaiAwal * n2;
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	// No2
	public static void resolve2() {
		Scanner input = new Scanner(System.in);

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.print("n2 :");
		int n2 = input.nextInt();

		System.out.println();
		int a = 1;

		int arr[][] = new int[2][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= n1; j++) {

				if (i == 0) {
					arr[i][j - 1] = j - 1;

				} else {
					if (j % 3 == 0) {
						arr[i][j - 1] = -a;
						a = a * 3;
					} else if (j >= 0) {
						arr[i][j - 1] = a;
						a = a * 3;
					}
				}
				System.out.print(" " + arr[i][j - 1]);

			}
			System.out.println();
		}
	}

	// No 3
	public static void resolve3() {
		Scanner input = new Scanner(System.in);
		int a = 3;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.print("n2 :");
		int n2 = input.nextInt();

		System.out.println();

		int arr[][] = new int[2][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				if (i == 0) {
					arr[i][j] = j;

				} else {
					if (j * 2 > n1) {

						arr[i][j] = a;
						a = a / 2;
					} else {
						arr[i][j] = a;
						a = a * 2;
					}
				}
				System.out.print(" " + arr[i][j]);

			}
			System.out.println();
		}
	}

	// No 4
	public static void resolve4() {
		Scanner input = new Scanner(System.in);

		int a = 1;
		int b = 5;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.print("n2 :");
		int n2 = input.nextInt();

		System.out.println();

		int arr[][] = new int[2][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				if (i == 0) {
					arr[i][j] = j;

				} else {
					if (j % 2 == 0) {

						arr[i][j] = a;
						a++;
					} else {
						arr[i][j] = b;
						b = b + 5;

					}
				}

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// No 5a
	public static void resolve5() {
		Scanner input = new Scanner(System.in);
		int a = 0;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.println();

		int arr[][] = new int[3][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				arr[i][j] = a;
				a = a + 1;

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}

	}

	// No 5b
	public static void resolve6() {
		Scanner input = new Scanner(System.in);
		int a = 0;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.println();

		int arr[][] = new int[3][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				arr[i][j] = a;
				a = a + 1;

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// No 6
	public static void resolve7() {
		Scanner input = new Scanner(System.in);

		int a = 1;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.print("n2 :");
		int n2 = input.nextInt();

		System.out.println();

		int arr[][] = new int[3][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				if (i == 0) {
					arr[i][j] = j;

				} else if (i == 1) {
					arr[i][j] = a;
					a = a * 7;
				} else {
					arr[i][j] = arr[0][j] + arr[1][j];
				}

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// No 7
	public static void resolve8() {
		Scanner input = new Scanner(System.in);

		int a = 0;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.println();

		int arr[][] = new int[3][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				arr[i][j] = a;
				a = a + 1;

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// No 8
	public static void resolve9() {
		Scanner input = new Scanner(System.in);

		int a = 0;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.println();

		int arr[][] = new int[3][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				if (i == 0) {
					arr[i][j] = j;

				} else if (i == 1) {
					arr[i][j] = a;
					a = a + 2;
				} else {
					arr[i][j] = arr[0][j] + arr[1][j];
				}

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// No 9
	public static void resolve10() {
		Scanner input = new Scanner(System.in);

		int a = 0;

		System.out.print("n1 :");
		int n1 = input.nextInt();

		System.out.print("n2 :");
		int n2 = input.nextInt();

		System.out.println();

		int arr[][] = new int[3][n1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < n1; j++) {

				if (i == 0) {
					arr[i][j] = j;

				} else if (i == 1) {
					arr[i][j] = a;
					a = a + n2;
				} else {
					arr[i][j] = a - n2;
					a = a - n2;
				}

				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
	}

	// No 10
	public static void resolve11( ) {
		Scanner input = new Scanner(System.in);
		
	
		int a = 0;
		
		System.out.print("n1 :");
		int n1 = input.nextInt();
		
		System.out.print("n2 :");
		int n2 = input.nextInt();
		
		System.out.println();
		
		
		int arr[][] = new int [3][n1];
		for (int i = 0; i<arr.length; i++) {
			for(int j = 0; j<n1;j++) {
		
				if (i==0) {
					arr[i][j]=j;
			
				}
				else if (i == 1) {
					arr[i][j] = a;
					a = a +n2;
				}
				else {
					arr[i][j] = arr[0][j] + arr[1][j];
				}
				
				System.out.print(" " + arr[i][j]);
		}
			System.out.println();
		}
	}
}