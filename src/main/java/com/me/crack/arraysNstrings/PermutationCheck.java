package com.me.crack.arraysNstrings;

public class PermutationCheck {
	public static void main(String[] args) {
		System.out.println(isPermutationCheck("abc", "bb") ? "Permutation" : "Not Permuation");
	}

	private static boolean isPermutationCheck(String s1, String s2) {
		int a[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i) - 'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			a[s2.charAt(i) - 'a']--;
		}

		for (int i : a) {
			if (i < 0) {
				return false;
			}
		}
		return true;
	}
}
