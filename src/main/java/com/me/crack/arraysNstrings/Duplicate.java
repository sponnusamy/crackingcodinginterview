package com.me.crack.arraysNstrings;

public class Duplicate {
	public static void main(String[] args) {
		System.out.println(hasDuplicate("aab") ? "Duplicate" : "Doesn't have Duplicate");
	}

	private static boolean hasDuplicate(String s) {
		boolean a[] = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			if (a[s.charAt(i) - 'a'])
				return true;
			a[s.charAt(i) - 'a'] = true;
		}

		return false;
	}
}
