package com.me.crack.others;

public class Intersection {
	public static void main(String[] args) {
		int a[] = new int[] { 2, 3, 4, 5 };
		int b[] = new int[] { 5, 7,8, 9 };
		findIntersection(a,b);
	}

	private static void findIntersection(int a[], int b[]) {
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			} else if (a[i] < b[j])
				i++;
			else
				j++;
		}

	}
}
