package day10;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Case10 {
	// No 1
	public static void resolve1() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String str = new String();

		BigInteger[] a = new BigInteger[n];
		for (int i = 0; i < n; i++) {
			str = input.next();
			a[i] = new BigInteger(str);

		}
		Arrays.sort(a);
		for (int j = 0; j < n; j++) {
			System.out.println(a[j]);
		}

	}

	// No 2
	public static void resolve2() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];

		int x = arr[n - 1], i;
		for (i = n - 1; i > 0 && arr[i - 1] > x; i--) {
			arr[i] = arr[i - 1];
			for (int j = 0; j < arr.length; j++)
				System.out.print(arr[j] + " ");
			System.out.println();
		}
		arr[i] = x;
		for (int j = 0; j < arr.length; j++)
			System.out.print(arr[j] + " ");
	}

	// No 8
	public static void resolve3() {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan Huruf: ");
		String huruf = input.nextLine();
//		huruf = huruf.toLowerCase().replaceAll("\\P{L}+", "");
		char[] arr = huruf.toCharArray();
		String arrSort = "";

		for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);

			arrSort += arr[i];

		}
		System.out.println(arrSort);

	}
}
