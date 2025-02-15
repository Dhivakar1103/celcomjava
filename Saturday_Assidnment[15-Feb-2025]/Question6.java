package com.Assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Question6 {

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
		Iterator <Object> ele = list.iterator();
		System.out.println("Entered LinkedList Elements : " );
		while (ele.hasNext()) {
			System.out.println(ele.next());
		}
		

	}

}
