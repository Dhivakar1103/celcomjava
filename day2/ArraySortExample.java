package com.celcom.day2;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 3, 8 ,9, 3};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Minimum value of an Array :" + arr[0]);
		System.out.println("Second minimum value of an Array :" + arr[1]);
		System.out.println("Maximum value of an Array : " + arr[arr.length - 1]);
		System.out.println("Second Maximum value of an Array : " + arr[arr.length - 2]);
		for(int i = arr.length - 1; i >=0 ; i--) {
			System.out.print(arr[i] + " ");
			
		}
	}

}
