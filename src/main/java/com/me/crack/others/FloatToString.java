package com.me.crack.others;

public class FloatToString {
	public static void main(String[] args) {
		float f = 12121.34f;
		System.out.println(floatToString(f));
	}

	private static String floatToString(float f) {
		float mod = f % 1.0f;
		while (mod > 0) {
			f *= 10;
			mod = f % 1.0f;
		}
		int i = (int) f;
		StringBuilder s = new StringBuilder();
		int m = 0;
		while (i > 0) {
			m = i % 10;
			i = i / 10;
			s.append(m);
		}
		return s.reverse().toString();
	}
}
