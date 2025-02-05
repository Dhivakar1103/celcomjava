package com.celcom.day2;
import java.util.Scanner;
public class ArrayExample2 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0 , evenCount = 0, oddCount = 0;
		System.out.println("Initial value of an Array :");
		for (int index : arr) {
			System.out.println(index);
			
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values : ");
		for (int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[i]%2 == 0) {
				evenCount+=1;
				
			}
			else {
				oddCount+=1;
			}
		}
		
		
		System.out.println("Sum Array : " + sum);
		System.out.println("Even Count : " + evenCount);
		System.out.println("Odd count : " + oddCount);
		sc.close();
		
	}

}
