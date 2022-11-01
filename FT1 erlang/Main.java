package FT1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "Y";

		while (answer.toUpperCase().equals("Y")) {
			try {

				System.out.print("Soal : ");
				int number = input.nextInt();
				input.nextLine();

				switch (number) {
				case 1:
					Soal.Soal1();
					break;

				case 2:
					Soal.Soal2();
					break;

				case 3:
					Soal.Soal3();
					break;

				case 4:
					Soal.Soal4();
					break;
					
				case 5:
					Soal.Soal5();
					break;

				case 6:
					Soal.Soal6();
					break;

				case 7:
					Soal.Soal7();
					break;

				case 8:
					Soal.Soal8();
					break;
					
				case 9:
					Soal.Soal9();
					break;

				case 10:
					Soal.Soal10();
					break;

				default:
					System.out.println("Case is not available");
					break;
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println();
			System.out.println("Lanjut ke soal lain? (Y/N)");
			answer = input.nextLine();
			System.out.println();
		}
		input.close();

	}

}
