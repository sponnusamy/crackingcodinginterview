package com.me.crack.arraysNstrings;


public class ReplaceSpaces {
	public static void main(String[] args) {
		System.out.println(replaceSpaces("Mr John Smith   ".toCharArray()));
		StringBuilder sb = new StringBuilder();
		sb.append("test");
		sb.append("test");
	}

	private static String replaceSpaces(char[] array) {
		int count = 0;
		int newLength = array.length + array.length * 2;
		char[] newArray = new char[newLength];

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				newArray[count++] = '%';
				newArray[count++] = '2';
				newArray[count++] = '0';
			} else {
				newArray[count++] = array[i];
			}
		}
		String newString1 = new String(newArray);

		return newString1;
	}
}
