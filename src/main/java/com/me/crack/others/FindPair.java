package com.me.crack.others;

import java.util.HashMap;

public class FindPair {
	public static void main(String[] args) {
		int a[] = new int[] { -1, 2, 3, 5, 6, 10, 4, 9 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		int x = 8;
		for (int i : a) {

			if (hm.get(x - i) != null) {
				System.out.println("Pair:" + i + "," + (x - i));
			}
			if (hm.get(i) != null) {
				hm.put(i, hm.get(i) + 1);
			} else {
				hm.put(i, 1);
			}
		}
	}
}
