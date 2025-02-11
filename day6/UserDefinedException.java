package com.celcom.day6;
import java.util.Scanner;


class InvalidAge extends Exception{
	int age;
	InvalidAge (int age){
		this.age = age;
	}
	public String toString() {
		return age + " - Invalid Age for vote";
	}
	
}
public class UserDefinedException {

	public static void main(String[] args) {
		System.out.println("Enter your age : ");
		int age = new Scanner(System.in).nextInt();
		if (age > 18) {
			System.out.println("Welcome To Vote");
		}
		else {
			try {
				throw new InvalidAge(age);
			
			}catch(InvalidAge e){
				System.out.println(e);
				
			}
		}
		
		
	}

}
