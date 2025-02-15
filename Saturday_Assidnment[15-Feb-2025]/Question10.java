package com.Assignment3;

import java.util.LinkedList;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements");
		int n = sc.nextInt();
		LinkedList<Object> list = new LinkedList<>();
		System.out.println("Enter the elements for LinkedList : " );
		for (i = 0; i < n; i++) {
			list.add(sc.next());

		}
		
		
		LinkedList<Object> copyList = new LinkedList<>();
		copyList.addAll(list);
		System.out.println("Original List : " +list);
		System.out.println("Copied List : "+copyList);
	}

}
