package com.me.crack.others;

public class LargestBooleanMatrix {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1 } };
		boolean[][] visited = new boolean[arr.length][arr[0].length];

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1 & !visited[i][j]) {
					int count = count(i, j, arr, visited);
					if (count > max)
						max = count;
				}
			}
		}

		System.out.println(max);
	}

	private static int count(int i, int j, int[][] arr, boolean visited[][]) {

		if (i < 0 || j < 0 || i > arr.length || j >= arr.length) {
			return 0;
		}
		if (arr[i][j] == 0 || visited[i][j])
			return 0;
		visited[i][j] = true;
		int count = 1;
		count += count(i, j + 1, arr, visited);
		count += count(i, j - 1, arr, visited);

		count += count(i + 1, j, arr, visited);
		count += count(i + 1, j + 1, arr, visited);
		count += count(i + 1, j - 1, arr, visited);

		count += count(i - 1, j - 1, arr, visited);
		count += count(i - 1, j, arr, visited);
		count += count(i - 1, j + 1, arr, visited);

		return count;

	}
}
