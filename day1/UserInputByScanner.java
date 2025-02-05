package com.celcom.day1;
import java.util.Scanner;
public class UserInputByScanner {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id ,name,salary");
		int eid = sc.nextInt();
   		String name = sc.next();
		double salary = sc.nextDouble();
		System.out.println("Employee id :" + eid);
		System.out.println("Name:" + name);
		System.out.println("Salary :" + salary);
		sc.close();
	}
}