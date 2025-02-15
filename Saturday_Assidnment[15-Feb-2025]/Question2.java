package com.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<Integer> elements = new ArrayList<>();
		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int n = sc.nextInt();
		System.out.println("Enter Elements of ArrayList");

		for (i = 0; i < n; i++) {
			elements.add(sc.nextInt());

		}
		Collections.sort(elements);
		System.out.println("Sorted ArrayList is : " + elements);

		sc.close();

	}

}
