package com.celcom.day4;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		int i, j;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		for (i = 1; i <= a / 2; i++) {
			for (j = 1; j <= a / 2; j++) {
				if (i * j == a) {
					if (j == i + 1) {
						flag = true;
						if (true) {
							break;

						}

					}

				}

			}
		}
		if (flag == true) {
			System.out.println("Number is Pronic");
		} else {
			System.out.println("Number is not pronic");
		}
		sc.close();
	}

}
