package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		do {
		
		System.out.print("Enter the number 1 : ");
		
		int num1= sc.nextInt();
		System.out.print("Enter the number 2 : ");
		
		int num2 = sc.nextInt();
		System.out.print("Enter the choice : 1 - Addition , 2 - Subraction , 3 - Multiply , 4 - Divide : ");
		
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Addition = " + (num1+num2));
		}
		else if(choice == 2){
			System.out.println("Subraction = " + (num1-num2));
		}
		else if(choice == 3){
			System.out.println("Multiplication = " + (num1*num2));
		}else if(choice == 4){
			System.out.println("Division = " + (num1/num2));
		}
		else {
			System.out.println("Quit");
		}
		System.out.println("Do want to continue or not");
		
		s = sc.next();
		}
		while(s.equals("continue"));
		sc.close();
		
	}

}
