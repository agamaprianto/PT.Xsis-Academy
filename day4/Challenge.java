package day4;

import java.util.*;

public class Challenge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("masukan nilai n: ");
		int n = input.nextInt();

		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		for (int i = 1; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

//		char[] ubahKataKedua = pecahKalimat[1].toCharArray();
//		char[] ubahKataKetiga = pecahKalimat[2].toCharArray();
//		
//		char[] ubahKataKedua = pecahKalimat[ ].toCharArray();
//		ubahKataKedua[ ] = ' ';
//		
//		char[] ubahKataKetiga = pecahKalimat[ ].toCharArray();
//		ubahKataKetiga[ ] = ' ';

//		System.out.println(Arrays.toString(pecahKalimat));

//		for (int i = 0; i < pecahKalimat.length; i++) {
//			System.out.println(pecahKata[i]);

//		System.out.println(Arrays.
	}

}
