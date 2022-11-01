package day3;

import java.lang.reflect.Array;

public class LatArray {

	public static void main(String[] args) {
		
		String[] batch279 = new String[10];
		
		int panjangArray = batch279.length;
		
		//isi array
		batch279[0] = "Denis";
		batch279[1] = "IBE";
		batch279[2] = "Satria";
		batch279[3] = "Cuday";
		batch279[4] = "Toriq";
		batch279[5] = "Talita";
		batch279[6] = "Rama";
		batch279[7] = "Tara";
		batch279[8] = "Agam";
		batch279[9] = "Batch279";
		
		batch279[3] = "angle";
		String namaPeserta = batch279[3];
		
		System.out.println("Panjang Array: "+panjangArray);
		
//		System.out.println(Array.toString(batch279));
		
		System.out.println(namaPeserta); //menaplikan isi array
		
//		int[] kumpulanAngka new int[5];
		
//		kumpulanAngka[0] = 5;
//		kumpulanAngka[1] = 10;
//		kumpulanAngka[2] = 15;
//		kumpulanAngka[3] = 20;
//		kumpulanAngka[4] = 25;
//		
//		int hasil = kumpulanAngka[0] + kumpulanAngka[4];
		
		String[] Challenge1 = new String[5];
		
		Challenge1[0] = "5";
		Challenge1[1] = "2";
		Challenge1[2] = "7";
		Challenge1[3] = "9";
		Challenge1[4] = "4";
		
		int hasil2 = Integer.parseInt(Challenge1[0]) + Integer.parseInt(Challenge1[4]);
		
		System.out.println(hasil2);
		
		int[] tempArr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			tempArr[i] = i+1;
		}
	//	System.out.println(Arrays.toString(tempArr));
				

	}

}
