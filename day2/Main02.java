package day2;

import java.util.Scanner;

public class Main02 {

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
					case02.resolve1();
					break;
				
				case 2:
					case02.resolve2();
					break;
				
				case 3:
					case02.resolve3();
					break;
				
				case 4:
					case02.resolve4();
					break;
				
				case 5:
					case02.resolve5();
					break;
					
				case 6:
					case02.resolve6();
					break;
					
				case 7:
					case02.resolve7();
					break;
					
				case 8:
					case02.resolve8();
					break;
					
				case 9:
					case02.resolve9();
					break;
					
				case 10:
					case02.resolve10();
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


