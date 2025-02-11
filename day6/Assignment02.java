package com.celcom.day6;

import java.util.Scanner;

class NoVowelException extends Exception {
	String str;

	public NoVowelException(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return "Vowel is not present in " + str;
	}
}

public class Assignment02 {

	static boolean isVowel(char ch) {
		String str = "aeiouAEIOU";
		return (str.indexOf(ch) != -1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");

		String str = sc.next();
		boolean flag = false;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (isVowel(a)) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(str + ": It contains vowel");
		} else {
			try {
				throw new NoVowelException(str);
			} catch (NoVowelException e) {
				System.out.println(e);
			}
		}
	}

}
