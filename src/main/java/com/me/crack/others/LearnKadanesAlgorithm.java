package com.me.crack.others;

public class LearnKadanesAlgorithm {
	public static void main(String[] args) {
		int a[] = new int[] { -2, -3, 4, 5, -1, -3 };
		//int start = 0, end = 0;
		int max_ending_here = 0, max_ending_sofar = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
		/*	if (max_ending_here == 0) {
				start = i;
			}*/
			max_ending_here = max_ending_here + a[i];
			/*if (max_ending_sofar < max_ending_here) {
				end = i;
			}*/

			max_ending_sofar = max_ending_sofar > max_ending_here ? max_ending_sofar : max_ending_here;
			max_ending_here = max_ending_here > 0 ? max_ending_here : 0;
		}
		System.out.println(max_ending_sofar);
		//for (int i = start ; i <= end; i++) {
		//	System.out.println(a[i]);
		//}
	}
}
