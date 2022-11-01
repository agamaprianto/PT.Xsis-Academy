package agamaprianto279;

import java.util.Arrays;
import java.util.Scanner;

public class soal10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan Huruf: ");
		String huruf = input.nextLine();
		huruf = huruf.toLowerCase().replaceAll("\\P{L}+", "");
		char[] arr = huruf.toCharArray();
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
		System.out.println("vocal : " + vocal);
		System.out.println("konsonan :" + konsonan);
	}

}
