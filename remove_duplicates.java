package Strings;

import java.util.Scanner;

public class remove_duplicates {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		System.out.println(duplicates(s1));
		s.close();
	}

	public static String duplicates(String s) {
		String a = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				a = a + s.charAt(i);
			}
		}
		a = a + s.charAt(s.length() - 1);
		return a;
	}
}
