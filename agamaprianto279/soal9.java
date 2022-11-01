package agamaprianto279;

import java.util.Scanner;

public class soal9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("masukan nilai n: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;

		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
			
	}

}
