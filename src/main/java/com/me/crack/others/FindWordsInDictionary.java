package com.me.crack.others;

import java.util.HashSet;
import java.util.Set;

public class FindWordsInDictionary {
	public static void main(String[] args) {
		HashSet<String> dic = new HashSet<>();
		char[] arr = new char[] { 'e', 'o', 'b', 'a', 'm', 'g', 'l' };
		dic.add("go");
		dic.add("bat");
		dic.add("me");
		dic.add("eat");
		dic.add("goal");
		dic.add("boy");
		dic.add("run");

		findWords("", new String(arr), dic);
	}

	private static void findWords(String prefix, String s, Set<String> dic) {
		int len = s.length();
		if (len == 0)
			return;
		if (dic.contains(prefix)) {
			// System.out.println(prefix);
		}
		 System.out.println(prefix);
		if (prefix.length() == s.length()) {
			System.out.println(prefix);
		}
		for (int i = 0; i < len; i++) {
			findWords(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, len), dic);
		}

	}
}
