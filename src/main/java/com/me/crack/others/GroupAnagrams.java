package com.me.crack.others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] strArr = new String[] { "banana", "nabnaa", "race", "care", "hello", "abc", "bac", "milk", "kilm" };

		HashMap<String, String> map = new HashMap<>();
		HashMap<String, String> res = new HashMap<>();
		for (String s : strArr) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String s1 = new String(c);
			if (map.get(s1) != null) {
				res.put(map.get(s1), s);
			} else {
				res.put(s, "");
				map.put(new String(c), s);
			}
		}

		for (Entry<String, String> e : res.entrySet()) {
			System.out.println(e.getKey() + "," + e.getValue());

		}
	}

}
