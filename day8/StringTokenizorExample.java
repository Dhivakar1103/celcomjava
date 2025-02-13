package com.celcom.day8;

import java.util.StringTokenizer;

public class StringTokenizorExample {

	public static void main(String[] args) {
		String s1 = "Welcome To Java Programming";
		StringTokenizer st = new StringTokenizer(s1, "");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
			
		}
	}

}
