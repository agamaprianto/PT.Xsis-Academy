package pretest;

import java.util.Scanner;
public class main {


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
						case11.resolve1();
						break;
					case 2:
						case11.resolve2();
						break;	
					case 3:
						case11.resolve3();
						break;
					case 4:
						case11.resolve4();
						break;	
					case 5:
						case11.resolve5();
						break;	
					case 6:
						case11.resolve6();
						break;	
					case 7:
						case11.resolve7();
						break;	
					case 8:
						case11.resolve8();
						break;
					case 9:
						case11.resolve9();
					case 10:
						case11.resolve10();
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
