package com.celcom.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CyberCrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number : ");
		int n = sc.nextInt();
		int transactions[] = new int[n];
		System.out.println("Enter the number : ");
		for (int i = 0; i < n; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the solen Heist amount : ");
		int solenAmount = sc.nextInt();
		int sum =0;

		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sum =0;
			result.clear();
			
			for (int j = i ; j <n ; j++) {
				if(sum<solenAmount) {
				sum += transactions[j];
				result.add(transactions[j]);
				}
				else {
					break;
				}
			if(sum==solenAmount) {
				System.out.println(result);
			}

		}

	}

}}
