package com.celcom.day12;
import java.util.regex.*;

public class RegularExpression {

	public static void main(String[] args) {
		String regex = "\\d{3}-\\d{2}-\\d{4}"; 
		Pattern pattern = Pattern.compile(regex);

	}

}
