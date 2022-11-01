package day2;

import java.util.Scanner;

public class Case01 {
	//Pulsa 
	public static void resolve1( ) {
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Pulsa=");
		int pulsa = input.nextInt();
		int poin = 0; 
		
		
		if (pulsa >= 100000) {
			poin = 800;
		} else if (pulsa >= 50000) {
			poin = 400;
		} else if (pulsa >= 25000) {
			poin = 200;
		} else if (pulsa >= 10000) {
			poin = 80;
		} else {
			poin = 0;
		} 
		
		System.out.println("Pulsa=" +pulsa);
		System.out.println("Poin:" + poin);		
	}
 
	//Poin Pulsa
	public static void resolve2( ) {
		Scanner input = new Scanner(System.in);
		
		int pulsa,poin1=0,poin2=0,poin3=0,totalpoin;
		
		System.out.println("Beli Pulsa:");
		pulsa = input.nextInt();
		
		if (pulsa <= 10000) {
			poin1 = 0;
		
		} else if (pulsa <= 60000) {
			poin1 = 0;
			poin2 = (int)(pulsa - 10000)/1000;
	
		} else {
			poin1 = 0;
			poin2 = (int)(30000 - 10000)/1000;
			poin3 = (int)(pulsa - 30000)/1000*2;
		}
		
		totalpoin = poin1 + poin2 + poin3;
		System.out.println("Pulsa:"+ pulsa);
		System.out.println("total poin:"+ totalpoin);
			
			
		
			
		}
	
	//Grab
	public static void resolve3( ) {
		Scanner input = new Scanner(System.in);
		
		int belanja=0,jarak=0,ongkir=0,hargaDiskon=0;
		double diskon = 0;
		String promo = " ";
		
		System.out.println("Belanja:");
		belanja = input.nextInt();
		
		System.out.println("Jarak:");
		jarak = input.nextInt();
		
		System.out.println("Masukan Promo:");
		promo = input.nextLine();
		
		if (promo.equals("JKTOVO")) {
			if (belanja >= 30000) {
			diskon = 40;
			
			} else { 
			diskon = 0;
			}
			
		} else {
			diskon =  0;
		
		if (jarak >= 5) {
			ongkir = 5000 +(jarak - 5)*1000;
		
		} else {
			ongkir = 5000;
		}

		hargaDiskon = (int) (belanja * diskon);
		
		if (hargaDiskon > 30000) {
			hargaDiskon = 30000;
		}
	}
}
		
	// Shopee
	public static void resolve4( ) {
		Scanner input = new Scanner(System.in);

		int Belanja, OngkosKirim, DiskonOngkir, DiskonBelanja, TotalBelanja;
		
		System.out.println("Belanja:");
		Belanja = input.nextInt();
		
		System.out.println("Ongkos Kirim:");
		OngkosKirim = input.nextInt();
		
		if (Belanja >= 100000) {
			DiskonOngkir = 10000;
			DiskonBelanja = 20000;
			
		} else if (Belanja >= 50000) {
			DiskonOngkir = 10000;
			DiskonBelanja = 10000;
		
		} else if (Belanja >= 30000) {
			DiskonOngkir = 5000;
			DiskonBelanja = 5000;
		
		} else {
			DiskonOngkir =0;
			DiskonBelanja =0;
		}
		
		TotalBelanja = Belanja + OngkosKirim - DiskonOngkir - DiskonBelanja;
		
		System.out.println("Belanja:" +Belanja);
		System.out.println("Ongkos Kirim:" +OngkosKirim);
		System.out.println("Diskon Ongkir:" +DiskonOngkir);
		System.out.println("Diskon Belanja:" +DiskonBelanja);
		System.out.println("Total Belanja:" +TotalBelanja);
	}
}	
			

//int pulsa; 
//pulsa = input.nextInt();
//String poin = "";
////int poin;
//
//System.out.println("Pulsa:"+pulsa);
////System.out.println("Poin:" +poin);
//
//
//if (pulsa >= 10000) {
//	//poin = 80;
//	System.out.println("Poin:50"+poin);
//} else if (pulsa >= 25000) {
//	//poin = 200;
//	System.out.println("Poin:200"+poin);
//} else if (pulsa >= 50000) {
//	//poin = 400;
//	System.out.println("Poin:400"+poin);
//} else if (pulsa >= 100000) {
//	//poin = 800;
//	System.out.println("Poin:800"+poin);
//}

// System.out.println("Poin:" +poin);

//		String nama = input.nextLine(); //input utk tipe data string
		
//		System.out.println("Nama Anda Adalah:"+nama);
		
		//input utk tipe data int
//		System.out.println("Masukkan Nilai X = "); 
//		int x = input.nextInt();
		
//		System.out.println("Masukkan Nilai Y = ");
//		int y = input.nextInt();
		
//		System.out.println("Hasil dari nilai X & Y = " + (x - y));\
		
//		String nilaiA = input.nextLine();
//		String nilaiB = input.nextLine();
//		
//		int hasil = Integer.parseInt(nilaiA)+Integer.parseInt(nilaiB);		
//		System.out.println("Hasil = "+hasil);
		
		
	
		
		
		//		int x = input.nextInt();
		
//		System.out.println("Masukkan Nilai X = "); 
//		int y = input.nextInt();
		
		
			
		


