package agamaprianto279;

import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("input panjang/deret : ");
		int n = s.nextInt();
		int angkaAwalGanjil = 2, angkaAwalGenap = 0;
		
		int[] ganjil = new int[n];
		int[] genap = new int[n];
		int[] fibonacci = new int[n];
		for (int i = 0; i < n; i++) {
			ganjil[i] = angkaAwalGanjil;
			angkaAwalGanjil += 2;
			System.out.print(angkaAwalGanjil);
			genap[i] = angkaAwalGenap;
			angkaAwalGenap += -2;
			fibonacci[i] = ganjil[i] + genap[i];
			System.out.print(angkaAwalGenap);
			if (i == n - 1) {
//				System.out.print(fibonacci[i]);
			} else {
//				System.out.print(fibonacci[i] + ", ");
			}
		}
	}

}
