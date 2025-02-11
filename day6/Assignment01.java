package com.celcom.day6;

import java.util.Scanner;

class DuplicateNumber extends Exception {
	int a ;
	DuplicateNumber (int a){
		this.a = a;
	}
	public String toString() {
		return a + " It is duplicate";
	}
	

}

public class Assignment01 {

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			int temp = a[i];
			for (int j = 0; j < i; j++) {

				try {
					if (temp == a[j]) {
						throw new DuplicateNumber (a[j]);
					}
				} catch (Exception e) {
					System.out.println(e);

				}

			}

		}

	}

}
