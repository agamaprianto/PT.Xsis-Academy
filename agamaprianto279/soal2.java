package agamaprianto279;

import java.util.Scanner;

public class soal2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pulsa, poin1 = 0, poin2 = 0, poin3 = 0, totalpoin=0;

		System.out.println("Beli Pulsa:");
		pulsa = input.nextInt();

		if (pulsa <= 10000) {
			poin1 = 0;

		} else if (pulsa <= 75000) {
			poin1 = 0;
			poin2 = (int) (pulsa - 10000) / 1000;

		} else {
			poin1 = 0;
			poin2 = (int) (30000 - 10000) / 1000;
			poin3 = (int) (pulsa - 75000) / 1000 * 2;
		}

		totalpoin = poin1 + poin2 + poin3;
		System.out.println("Pulsa:" + pulsa);
		System.out.println("total poin:" + totalpoin);

	}

}
