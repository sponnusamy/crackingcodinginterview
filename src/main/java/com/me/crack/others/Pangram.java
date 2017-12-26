package com.me.crack.others;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine().toLowerCase();
		char[] s = line.toLowerCase().toCharArray();
		int ptn = 0;
		for (char c : s) {
			if (c >= 'a' && c <= 'z') {
				System.out.println(ptn);
				ptn |= 1 << c - 'a';
				System.out.println(ptn);
			}
		}
		System.out.println(1|1<<2);
		if (ptn + 1 == 1 << 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
		sc.close();
	}
}
