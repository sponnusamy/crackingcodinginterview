package com.me.crack.others;

public class Permutation {
	public static void main(String[] args) {
		permutation("abcd");
	}

	public static void permutation(String str) {
		permutation1("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	private static void permutation1(String prefix, String str) {
		
		int n = str.length();
		if (n == 0){
			System.out.println(prefix);
		//	System.out.println("----");
		}
		else {
			for (int i = 0; i < n; i++) {
				//prefix = prefix + str.substring(0, 1);
				String newStr = str.substring(1, n);
				permutation1(prefix + str.substring(0, 1), newStr);
				str =  str.substring(n-1, n) +str.substring(0, n-1) ;
				
			}
		}
	}
}
