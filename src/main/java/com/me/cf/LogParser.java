package com.me.cf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class LogParser {
	public static void main(String[] args) {
		String[] logs = new String[] { "2017-08-11T17:07:46,2017-08-11T17:08:00,10,10",
				"2017-08-12T17:07:00,2017-08-12T17:07:46,1004,23000" };
		int[] r = logParse(logs);
		for (int t : r) {
			System.out.println(t);
			System.out.println(new Date(t));
		}

	}

	static int[] logParse(String[] logs) {

		Function<String, Integer> time = (String s) -> {
			try {
				return (int) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(s).getTime() / 1000);
			} catch (ParseException e) {
			}
			return 0;
		};
		Function<String, Double> toLong = s -> Double.valueOf(s);
		List<String> list = Arrays.asList(logs);
		double prev = Long.MAX_VALUE;
		int r[] = new int[2];
		for (String log : list) {
			String l[] = log.split(",");
			int start = time.apply(l[0]);
			int end = time.apply(l[1]);
			double calc = toLong.apply(l[3]) / (toLong.apply(l[2]) * (end - start));

			if (calc < prev) {
				r[0] = start;
				r[1] = end;
			}
			prev = calc;
		}
		return r;
	}
}
