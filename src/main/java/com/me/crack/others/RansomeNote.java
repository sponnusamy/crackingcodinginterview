package com.me.crack.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class RansomeNote {
	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public RansomeNote(String magazine, String note) {
		magazineMap = new HashMap<String, Integer>();
		noteMap = new HashMap<String, Integer>();
		String[] s1 = magazine.split("\\s");
		String[] s2 = note.split("\\s");
		for (String s : s1) {
			Integer i = magazineMap.get(s);
			magazineMap.put(s, i == null ? 0 : ++i);
		}
		for (String s : s2) {
			Integer i = noteMap.get(s);
			System.out.println(s+"="+i);
			noteMap.put(s, i == null ? 1 : ++i);
		}
	}

	public boolean solve() {
		for (Entry<String, Integer> e : noteMap.entrySet()) {
			if (magazineMap.get(e.getKey()) == null || magazineMap.get(e.getKey()) < e.getValue()) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Eat whitespace to beginning of next line
		scanner.nextLine();

		RansomeNote s = new RansomeNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		boolean answer = s.solve();
		if (answer)
			System.out.println("Yes");
		else
			System.out.println("No");

	}
}
