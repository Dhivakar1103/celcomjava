package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String s1 = "Java";
		System.out.println(s1.length());// 4
		
		System.out.println(s1.charAt(2));// v
		System.out.println(s1.toLowerCase());// java
		System.out.println(s1.toUpperCase());// JAVA
		
		System.out.println(s1.concat("World"));// Java World
		System.out.println(s1.replace('a', 'z')); // Jzvz
		
		System.out.println(s1.equals("java"));// False
		System.out.println(s1.equalsIgnoreCase("java"));// true
		System.out.println(s1.contains("av"));// true
		
		System.out.println(s1.startsWith("Ja"));// true
		System.out.println(s1.endsWith("va"));// True
		
		String s2 = "Java World";
		System.out.println(s2.substring(2, 7));// va Wo
		System.out.println(s2.substring(5));// World
	}

}
