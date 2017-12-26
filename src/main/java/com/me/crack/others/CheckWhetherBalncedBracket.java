package com.me.crack.others;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CheckWhetherBalncedBracket {
	public static void main(String[] args) {

		System.out.println(isBalanced("{{[[(())]]}}"));
	}

	public static boolean isBalanced(String str) {
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		Stack<Character> s = new Stack<>();
		try {
			char[] arr = str.toCharArray();
			for (char c : arr) {
				if (c != '}' && c != ']' && c != ')')
					s.push(c);
				else if (s.pop() != map.get(c))
					return false;

			}
		} catch (Exception e) {
			return false;
		}
		return s.isEmpty();

	}
}
