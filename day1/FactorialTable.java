package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int a = sc.nextInt();
		int fact = 1;
		for(int i = 1;i<=a ; i++) {
			fact = fact* i;
			System.out.println("Factorial of " + i + " is " + fact);
		}
		System.out.println("The factorial for the given number is " + fact);
		
		sc.close();

	}

}
