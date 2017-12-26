package com.me.crack.others;

import java.util.ArrayList;
import java.util.List;

public class PrintConscutiveChars {
	public static void main(String[] args) {
		String ip = "ABCXYZACCD";
		List<String> list = find(ip);
		for (String s : list) {
			System.out.println(s);
		}

	}

	private static List<String> find(String ip) {
		String temp = "";
		List<String> res = new ArrayList<>();
		for (int i = 0; i < ip.length(); i++) {
			if (i > 0 && (ip.charAt(i) - ip.charAt(i - 1) == 1)) {
				temp += ip.charAt(i);
			} else {
				if (!temp.isEmpty())
					res.add(temp);
				temp = ip.charAt(i) + "";
			}
		}
		if (!temp.isEmpty())
			res.add(temp);
		return res;
	}
}
