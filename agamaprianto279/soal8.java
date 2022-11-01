package agamaprianto279;

import java.util.Arrays;
import java.util.Scanner;

public class soal8 {

	public static void main(String[] args) {
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

}
