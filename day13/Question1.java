package com.celcom.day13;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Functions fc = new Functions();
		Scanner sc =new Scanner (System.in);
		while(true){
			System.out.println("Enter a choice : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				fc.newCus();
				break;
			case 2:
				fc.viewCus();
				break;
			case 3 :
				fc.deposit();
				break;
			case 4 :
				fc.withdraw();
				break;
			case 5 :
				fc.deletecus();
				break;
			case 6 :
				System.exit(0);
			
				
			}
			
		}
		

	}

}
