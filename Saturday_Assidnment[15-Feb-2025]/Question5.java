package com.Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int n = sc.nextInt();
		ArrayList<Object> elements = new ArrayList<>(n);
		System.out.println("Enter Elements of ArrayList");

		for (i = 0; i < n; i++) {
			elements.add(sc.next());

		}
		for (int j = 0; j < n; j++) {
			System.out.println(" Index of an element  " + j + " : " + elements.get(j));
		}

	}

}
