package day3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "Y";
		
		while(answer.toUpperCase().equals("Y")) {
			try {
				System.out.println("Enter the number case");
				int number = input.nextInt();
				input.nextLine();
				
				switch (number) {
				case 1:
					Case02.resolve1();
					break;
				case 2:
					Case02.resolve2();
					break;
				case 3:
					Case02.resolve3();
					break;				
				case 4:
					Case02.resolve4();
					break;					
				case 5:
					Case02.resolve5();
					break;					
				case 6:
					Case02.resolve6();
					break;					
				case 7:
					Case02.resolve7();
					break;
				case 8:
					Case02.resolve8();
					break;
				case 9:
					Case02.resolve9();
					break;					
				case 10:
					Case02.resolve10();
					break;
				case 11:
					Case02.resolve11();
					break;
				default:
					System.out.println("Case is not available");
					break;
				}
				
			} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println();
			System.out.println("Continue? (Y/N)");
			answer = input.nextLine();			
		}
}