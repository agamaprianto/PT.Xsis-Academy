package day8;

import java.util.HashSet;
import java.util.Scanner;

public class Case08 {
	// No 4
	public static void resolve1() {
		Scanner input = new Scanner(System.in);
		String sinyal = input.next();

		String sos = "SOS";
		int jumlah = 0;

		for (int i = 0; i < sinyal.length(); i++) {
			if (sinyal.charAt(i) != sos.charAt(i % 3))
				jumlah++;
		}
		System.out.println(jumlah);
	}

	// No 1
	public static void resolve2() {
		Scanner input = new Scanner(System.in);
		String s = input.next();

		int text = 1;
		for (int i = 0; i < s.length(); i++) {
			String letter = Character.toString(s.charAt(i));
			if (letter == letter.toUpperCase()) {
				text++;
			}
		}
		System.out.println(text);
	}

	// No 5
	public static void resolve3() {
		Scanner sc = new Scanner(System.in);
		char[] c = new char[] { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			int l = c.length;
			int count = 0;
			int j = 0;
			try {
				for (int i = 0; i < c.length; i++) {
					while (j <= s.length()) {
						if (s.charAt(j) == c[i]) {
							count++;
							j++;
							break;
						}
						j++;
					}
				}
				System.out.println(count == l ? "YES" : "NO");
			} catch (Exception e) {
				System.out.println("NO");
			}
		}
	}

	// No 3
	public static void resolve4() {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String s = in.next();
		int r = in.nextInt();

		String out = "";

		char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[] b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (!Character.isLetter(c)) {
				out += c;
			}

			for (int j = 0; j < a.length; j++) {

				if (c == a[j]) {
					out += a[(j + r) % a.length];
				}
				if (c == b[j]) {
					out += b[(j + r) % a.length];
				}

			}

		}
		
		System.out.println(out);
	}
	
	//No 6
	public static void resolve5() {
		Scanner input = new Scanner(System.in);
	    String s = input.nextLine();
	    s = s.toLowerCase();
	   
	    HashSet<Integer> h = new HashSet<Integer>();
	    
	    for (int i = 0; i < s.length(); i++) {
	        if(s.charAt(i)!=' '){
	            int put = (int)s.charAt(i);
	            h.add(put);
	        }
	    }
	    if(h.size()==26)
	        System.out.println("pangram");
	    else
	        System.out.println("not pangram");
	}
	
	//No 7
	public static void resolve6() {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String subString = "";
		boolean isValid = false;
		for (int i = 1; i <= s.length() / 2; i++) {
			subString = s.substring(0, i);
			Long num = Long.parseLong(subString);
			String validString = subString;
			
			while (validString.length() < s.length()) {
				validString += Long.toString(++num);
			}
			if (s.equals(validString)) {
				isValid = true;
				break;
			}

		}
		System.out.println(isValid ? "YES " + subString : "NO");
	}
	
	//No 9
	public static void resolve7() {
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		
		int[] temp = new int[26];
	    for(int i=0,j=0;i<s1.length() || j<s2.length();i++,j++) {            
	        if(i<s1.length())                
	            temp[s1.charAt(i)-'a']++;            
	        if(j<s2.length())                
	            temp[s2.charAt(j)-'a']--;        
	    }           
	    int count=0;        
	    for(int i=0;i<26;i++)            
	        count+=Math.abs(temp[i]);        
	    System.out.println(count);;
	}
}
