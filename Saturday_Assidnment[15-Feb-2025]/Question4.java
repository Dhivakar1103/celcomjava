package com.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int n = sc.nextInt();
		ArrayList<Integer> elements = new ArrayList<>(n);
		System.out.println("Enter Elements of ArrayList");
		
		for (i = 0; i < n; i++) {
			elements.add(sc.nextInt());

		}
		Collections.reverse(elements);
		System.out.println("Reversed ArrayList : " + elements);
		sc.close();

	}

}
