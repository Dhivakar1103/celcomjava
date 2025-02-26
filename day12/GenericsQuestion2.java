package com.celcom.day12;

import java.util.Scanner;

public class GenericsQuestion2 {

	public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
		if (array1.length != array2.length) {
			return false;

		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array 1: ");
		int size1 = sc.nextInt();
		System.out.print("Enter the size of the array 2: ");
		int size2 = sc.nextInt();

		Integer[] arr1 = new Integer[size1];
		Integer[] arr2 = new Integer[size2];

		System.out.println("Enter elements for first array:");
		for (int i = 0; i < size1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("Enter elements for second array:");
		for (int i = 0; i < size2; i++) {
			arr2[i] = sc.nextInt();
		}

		boolean result = areArraysEqual(arr1, arr2);

		if (result) {
			System.out.println("Both arrays are equal.");
		} else {
			System.out.println("Arrays are not equal.");
		}

		sc.close();
	}
}
