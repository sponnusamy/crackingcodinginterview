package com.me.crack.arraysNstrings;

public class MakeZeros {
	public static void main(String str[]) {
		int a[][] = new int[][] { { 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 0, 1, 0, 1, 1 } };
		int r[][] = new int[][] { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 } };
		makeZeros1(a);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(i + "," + j + "==>" + a[i][j]);
				if (a[i][j] != r[i][j]) {
					System.out.println("Failed");
					return;
				}
			}
		}

		System.out.println("Success");
	}

	private static void makeZeros1(int a[][]) {
		boolean[] row = new boolean[a.length];
		boolean[] col = new boolean[a[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (row[i] || col[j]) {
					a[i][j] = 0;
				}
			}
		}

	}

	private static void makeZeros(int a[][]) {
		boolean firstRowContainsZero = false, firstColContainsZero = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i][0] == 0) {
				firstColContainsZero = true;
				break;
			}
		}

		for (int j = 0; j < a[0].length; j++) {
			if (a[0][j] == 0) {
				firstRowContainsZero = true;
				break;
			}
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				if (a[i][j] == 0) {
					a[i][0] = 0;
					a[0][j] = 0;
					break;
				}
			}
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a[i].length; j++) {
				if (a[0][j] == 0 || a[i][0] == 0)
					a[i][j] = 0;
			}
		}

		if (firstRowContainsZero) {
			for (int i = 0; i < a[0].length; i++) {
				a[0][i] = 0;
			}
		}

		if (firstColContainsZero) {
			for (int j = 0; j < a.length; j++) {
				a[j][0] = 0;
			}
		}
	}
}
