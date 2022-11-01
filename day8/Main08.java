package day8;

import java.util.Scanner;

public class Main08 {

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
					Case08.resolve1();
					break;
				case 2:
					Case08.resolve2();
					break;	
				case 3:
					Case08.resolve3();
					break;
				case 4:
					Case08.resolve4();
					break;	
				case 5:
					Case08.resolve5();
					break;	
				case 6:
					Case08.resolve6();
					break;	
//				case 7:
//					Case08.resolve7();
//					break;	
//				case 8:
//					Case08.resolve8();
//					break;
//				case 9:
//					Case08.resolve9();
//				case 10:
//					Case08.resolve10();
//					break;
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
