package day1;

public class DataType {
	
	public static void main(String[]args) {
		
		int nilaiX = 10;
		int nilaiY = 20;
		double nilaiZ = 2.5;
		
		int hasil = nilaiX + nilaiY + (int)nilaiZ;
		// (int)nilaiZ = merubah nilai double jadi boolean
		
		System.out.println(hasil);
		
		String nilaiA = "30";
		String nilaiB = "50";
		
		int hasil2 = Integer.parseInt(nilaiA)+Integer.parseInt(nilaiB); 
		// ubah nilai string menjadi int
		System.out.println(hasil2);
		
		
	}

}
	
