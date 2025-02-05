package com.celcom.day2;

public class ArrayExample1 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50};
		int sum = 0;
		System.out.println("Array Length : " + arr.length);
		System.out.println("Array Elements : ");
		for(int i = 0; i < arr.length;i++) {
			sum += arr[i];
			System.out.println(arr[i]);
			
		}
		System.out.println("Sum of Array element is " + sum);
		for(int value: arr) {
			System.out.println(value);
		}
	}

}
