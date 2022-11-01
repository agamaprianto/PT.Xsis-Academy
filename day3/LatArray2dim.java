package day3;

import java.util.Scanner;

public class LatArray2dim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int i,j,n1,n2,angka=0;
		
		System.out.println("n1:");
		n1 = input.nextInt();
			
		System.out.println("n2:");
		n2 = input.nextInt();
		
		int[][] arr = new int [3][n2];
		
		for ( i = 0; i < arr.length; ++i) {
		      for( j = 0; j < arr[i].length; ++j) {
		        System.out.println(arr[i][j]);
		      }
		}
		
//		String[] batch279 = new String[10];
//		
//		int panjangArray = batch279.length;
//		System.out.println("Masukkan jumlah deret: ");
//		int n = in.nextInt();
//		int[] X = new int[n];
//		int x = 1;
//		c
//		for (int i = 0; i < n; i++) {
//			X[i] = x;
//			System.out.print(X[i] + "  ");
//			x = x + 1;
//		}
	}
}
		
		
		
		
		
		
		
		
		
		
		//mencari panjang dari kolom
//		int[][] tempArray2Dim = new int [3][4];
//		
//		int panjangArray = tempArray2Dim[0].length;
//		
//		System.out.println(Arrays.toString);
//		
//
//	}
//
//}

