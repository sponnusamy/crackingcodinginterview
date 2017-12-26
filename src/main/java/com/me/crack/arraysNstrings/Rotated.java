package com.me.crack.arraysNstrings;

public class Rotated {
	public static void main(String[] args) {
		String s = "erbottlewat";
		System.out.println(isRotated(s,"waterbottle") ? "Rotated" : "Not Rotated");
	}

	private static boolean isRotated(String s,String s2) {
		StringBuilder s1 = new StringBuilder(s);
		s1.append(s);
		return s1.toString().contains(s2);
	}
}
