package day9;

import java.util.Random;
import java.util.Scanner;

public class Case09 {

	public static void resolve1() {
		Scanner input = new Scanner(System.in);

		Random tebak = new Random();
		int tebakInt = tebak.nextInt(10); // acak tebak dari 0-9
		int poin = 0;
		int taruhan = 0;
		String pilihan;
		
		System.out.println("Poin: ");
		poin = input.nextInt();

		System.out.println("Taruhan: ");
		taruhan = input.nextInt();
		input.nextLine();
		
		System.out.println("Tebak(U/D): ");
		String tebakAngka = input.nextLine();
		
		if (tebakInt > 5) {
			if (tebakAngka.equals("U")) {
				pilihan = "You Win";
				poin = poin + taruhan;

			} else if (tebakAngka.equals("D")) {
				pilihan = "You Lose";
				poin = poin - taruhan;
			}
		} else if (tebakInt < 5) {
			if (tebakAngka.equals("U")) {
			pilihan = "You Win";
			poin = poin + taruhan;
		} else if (tebakAngka.equals("D")) {
			pilihan = "You Lose";
			poin = poin - taruhan;
		}
		}
	System.out.println(tebakInt);
//	System.out.println(pilihan);	
	System.out.println("Poin saat ini: " +poin);

	}

	// No 4
	public static void resolve2() {
		Scanner input = new Scanner(System.in);
		long x = input.nextInt();
		long hasil = 1;

		for (long i = 1; i <= x; i++) {
			hasil = hasil * i;
		}
		System.out.println(x + "! = " + hasil);
	}
	
	//No 2
	public static void resolve3() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Keranjang1: ");
		String Keranjang1 = input.nextLine();
		
		System.out.println("Keranjang2: ");
		String Keranjang2 = input.nextLine();
		
		System.out.println("Keranjang3: ");
		String Keranjang3 = input.nextLine();
		
		System.out.println("Keranjang yang dibawa: ");
		int KeranjangBawa = input.nextInt();
		
		int total = 0;
		int[] Keranjang = new int[3];
		
		if (Keranjang1.equalsIgnoreCase("kosong")) {
			Keranjang[0] = 0;
		}
		else {
			Keranjang[0] = Integer.parseInt(Keranjang1);
		}
		
		if (Keranjang2.equalsIgnoreCase("kosong")) {
			Keranjang[1] = 0;
		}
		else {
			Keranjang[1] = Integer.parseInt(Keranjang2);
		}
		if (Keranjang3.equalsIgnoreCase("kosong")) {
			Keranjang[2] = 0;
		}
		else {
			Keranjang[2] = Integer.parseInt(Keranjang3);
		}
		
		for (int i = 0; i < 3; i++) {
			total += Keranjang[i];

		}
		if (KeranjangBawa == 0) {
			System.out.println("sisa buah: " + total);
		}
		else {
		System.out.println("sisa buah: " + (total - Keranjang[KeranjangBawa - 1]));
		}
	}
	// No 5
	public static void resolve4() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("laki dewasa: ");
		int laki = input.nextInt();
		
		System.out.println("wanita dewasa: ");
		int wanita = input.nextInt();
		
		System.out.println("anak-anak: ");
		int anak = input.nextInt();
		
		System.out.println("bayi: ");
		int bayi = input.nextInt();
		
		int bajuLaki = laki * 1;
		int bajuWanita = wanita * 2;
		int bajuAnak = anak * 3;
		int bajuBayi = bayi * 5;
		int total = bajuLaki + bajuWanita + bajuAnak + bajuBayi;
		
		if (total > 10 && total %2 == 1) {
			bajuWanita = wanita * 1;
			total += bajuWanita;
		}
		System.out.println(total + "baju");
		
		
	}
	
}
