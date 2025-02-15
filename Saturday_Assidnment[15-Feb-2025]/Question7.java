package com.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Question7 {

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
		System.out.println("Enter the starting position : ");
		int Start = sc.nextInt();
		if(Start>=0 && Start < n) {
			System.out.println("From the Starting Index : Range 0 to " + (n-1));
			for(int j =Start;j<list.size();j++) {
				System.out.println(list.get(j));
			}
			
		}
		else {
			System.out.println("Enter the valid Starting position ");
		}
		
		
		
	}

}
