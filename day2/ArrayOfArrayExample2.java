package com.celcom.day2;

public class ArrayOfArrayExample2 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		int a1[] = {1, 2, 3};
		arr[0] = a1;
		arr[1] = new int[] {4 ,5, 6};
		arr[2] = new int[] {7, 8, 9};
		for (int i = 0 ;i< arr.length ;i++) {
			for(int j = 0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	
		

	}

}
