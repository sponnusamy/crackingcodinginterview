package com.me.crack.others;

public class SameArray {
	public static void main(String[] args) {
		int a[] = new int[] { 1, 1, 2, 2 };
		int b[] = new int[] { 3, 3, 4, 4 };
		System.out.println(haveSameNumbers(a, b));
	}

	public static boolean haveSameNumbers(int[] arrA, int[] arrB) {
		if (arrA.length != arrB.length)
			return false;
		// empty arrays have the same numbers, none
		if (arrA.length == 0 && arrB.length == 0)
			return true;
		int acc1 = arrA[0];
		int acc2 = arrB[0];
		for (int i = 1; i < arrA.length; i++) {
			acc1 = acc1 ^ arrA[i] ;
			acc2 = acc2 ^ arrB[i];
		}
		System.out.println(acc1);
		System.out.println(acc2);
		return acc1 == acc2;
	}
}
