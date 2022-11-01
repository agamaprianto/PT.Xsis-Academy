package day2;

import java.util.Scanner;

public class LatihanPerulangan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Berapa banyak perulangan yang diinginkan? ");
		//int n = input.nextInt();
		int n = 1;
		for(int i = 0; i <= 6; i++) {
			n = n * 2;
			System.out.print(" "+n);
			
			
		}

	}

}
