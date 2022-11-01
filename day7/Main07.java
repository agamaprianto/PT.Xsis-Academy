package day7;

import java.util.Scanner;


public class Main07 {
	
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
				Case07.resolve1();
				break;
			case 2:
				Case07.resolve2();
				break;	
			case 3:
				Case07.resolve3();
				break;
			case 4:
				Case07.resolve4();
				break;	
			case 5:
				Case07.resolve5();
				break;	
			case 6:
				Case07.resolve6();
				break;	
//			case 7:
//				Case07.resolve7();
//				break;	
//			case 8:
//				Case07.resolve8();
//				break;
//			case 9:
//				Case07.resolve9();
//			case 10:
//				Case07.resolve10();
//				break;
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