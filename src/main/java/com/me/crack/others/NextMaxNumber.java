package com.me.crack.others;

public class NextMaxNumber {
	public static void main(String[] args) {
		int N = 534976;
		// Identify d
		int d = -1;
		int pos = -1;
		char[] s = (N + "").toCharArray();
		int n = s.length;
		for (int i = n - 1; i > 0; i--) {
			if (s[i] > s[i - 1]) {
				d = Integer.parseInt(s[i - 1] + "");
				pos = i - 1;
				break;
			}

		}
		if (d == -1) {
			System.out.println("Not possible");
			return;
		}
		int max = Integer.parseInt(s[pos + 1] + "");
		int maxPos = -1;
		for (int i = pos; i < n; i++) {
			if (s[i] > d && max < s[i]) {
				max = Integer.parseInt(s[i] + "");
				maxPos = i;
			}
		}

		System.out.println(max);
		System.out.println(maxPos);

		// Swap
		s[pos] = (max + "").charAt(0);
		s[maxPos] = (d + "").charAt(0);
		
		//Sort
		
	}
}
