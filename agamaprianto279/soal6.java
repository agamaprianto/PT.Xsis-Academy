package agamaprianto279;

import java.util.Scanner;

public class soal6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("input n: ");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 2 != 0) {
				
				System.out.print(i + " ");
			}
			
		}
		System.out.println();

	}

}
