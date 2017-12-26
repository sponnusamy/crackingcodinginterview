package com.me.crack.arraysNstrings;

public class CompressString {
	public static void main(String[] args) {
		String s = "aaabbccd";
		StringBuilder a = new StringBuilder();
		char last = s.charAt(0);
		int count = 1;
		char c = last;
		for (int i = 1; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == last) {
				count++;
			} else {
				a.append(last);
				a.append(count);
				count = 1;
			}
			last = c;
		}
		a.append(last);
		a.append(count);
		System.out.println(a);
	}
}
