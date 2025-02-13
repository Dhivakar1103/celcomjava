package com.celcom.day8;
//Strings are immutable like array

// StringBuffer are mutable object

public class StringExample3 {

	public static void main(String[] args) {
		String s1 = "Java";
		s1 = s1.concat(" World");
		s1 = s1.toUpperCase();
		System.out.println(s1);
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" World ");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb1.append(" World");
		System.out.println(sb1);

	}

}
