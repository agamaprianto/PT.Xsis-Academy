package day1;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (1 < 5) {
//			System.out.println(Hello);		
//			System.out.println(World);
//			System.out.println(Batch);
//			System.out.println(279);
			}
		
		
		Scanner input = new Scanner(System.in);
		int nilaiAgam = input.nextInt();
		String grade = "";
		System.out.println("Nilai=" +nilaiAgam);
		
		
		if (nilaiAgam >=90) {
			grade = "A";
		} else if (nilaiAgam >= 80) {
			grade = "B";
		} else if (nilaiAgam >= 70) {
			grade = "C";
		} else if (nilaiAgam >= 60) {
			grade = "D";
		} else {
			grade = "E";
		}
		
		System.out.println("Grade:" + grade);
		
		
		String username ="XsisAcademy";
		String password = "Batch278";
				
		
		if (username.equals("XsisAcademy")) {
			
			if (password.equals("Batch279")) {
				System.out.print("login Berhasil");
				
			} else { 
				System.out.print("Password Salah");	
			}
		} else {
		System.out.print("username tidak ditemukan");
				
		}
		}
				
			
			//	System.out.println("username=" +nilaiAgam);
			//	System.out.println("password:" + grade);
						
						
		
				
				
				
			
		

}


