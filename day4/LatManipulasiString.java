package day4;

import java.util.Arrays;
import java.util.Scanner;


public class LatManipulasiString {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		
		
		String nama = "Satria Ramadhan Putra";
//		System.out.println(nama);
//		nama = in.nextLine();		
		String[] pecahKalimat = nama.split(" "); //split = untuk memecah kalimat jadi kata 
		
		char[] pecahKataPertama = pecahKalimat[0].toCharArray();
//		pecahKataPertama[5] = 'o';
		
		char[] pecahKataKedua = pecahKalimat[1].toCharArray();
		pecahKataKedua[7] = 'i';
		
		char[] pecahKataKetiga = pecahKalimat[2].toCharArray();
		pecahKataKetiga[4] = 'i';
		
//		int s = pecahKata[0];
//		System.out.println(s);
		System.out.println(Arrays.toString(pecahKalimat));
		System.out.println(Arrays.toString(pecahKataPertama));
		System.out.println(Arrays.toString(pecahKataKedua));
		System.out.println(Arrays.toString(pecahKataKetiga));
		
//		for (int i = 0; i < pecahKata.length; i++) {
//			System.out.println(pecahKata[i]);
		}
	}

