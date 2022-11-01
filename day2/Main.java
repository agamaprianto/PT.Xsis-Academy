package day2;

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
					Case01.resolve1();
					break;
				
				case 2:
					Case01.resolve2();
					break;
				
				case 3:
					Case01.resolve3();
					break;
				
				case 4:
					Case01.resolve4();
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

//2 inputan dengan tipe data string


