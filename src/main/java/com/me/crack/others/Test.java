package com.me.crack.others;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Optional;

public class Test {
	int printRepeating(int arr[], int size, Optional<String> testStr) {
		int prev = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == prev) {
				return arr[i];
			}
			prev = arr[i];
		}

		if (arr[arr.length - 1] == arr[arr.length - 3]) {
			return arr[arr.length - 1];
		} else if (arr[arr.length - 2] == arr[arr.length - 4]) {
			return arr[arr.length - 2];
		}
		return -1;
	}

	/* Driver program to test the above function */
	public static void main(String[] args) {
		long t = new Date().getTime();
		for (int i = 0; i < 3200; i++) {
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(t - (i * 60 * 1000));
			System.out.println(String.format(
					"27.4.13.169 - - [%s +0530] \"GET /proxylb1-ext-ap-southeast-1.videoplaza.io/proxy/tracker/v2?aid=e623f784-1d33-47c5-a91d-6e0a08992152&cf=short_form&dcid=c5600434-868e-4f82-9f80-95341d08b562&e=16&pid=1460103678517&s=7612&sid=73b844c2-005a-4692-9116-274074a30d34&t=UserAnonymous,CTYPE_SPORT_LIVE,CNAME_KABADDI,CRIPL003,CLANGUAGE_ENGLISH,CNAME_4705,CTITLE_DAI_TEST_STREAM,CID_2001486052,CNEW_ISNEW_N,CGENRE_CRICKET&tid=8a862ebd-fd62-11e5-bffb-06734a628477&tt=m HTTP/1.1\" 200 279 \"TERMINATED_BY_AKAMAI\" \"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.110 Safari/537.36\" \"-\"",
					new SimpleDateFormat("dd/MMM/yyyy:HH:mm:ss").format(c.getTime())));
		}

	}
}
