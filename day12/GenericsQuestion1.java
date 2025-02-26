package com.celcom.day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a generic method that takes two lists of the same type and merges them into a single list. 
//This method should alternate the elements of each list
class Merge<T> {
	private List<T> list1;
	private List<T> list2;

	public Merge(List<T> list1, List<T> list2) {
		this.list1 = list1;
		this.list2 = list2;

	}

	public List<T> mergeList() {
		List<T> merged = new ArrayList<>();
		int size1 = list1.size();
		int size2 = list2.size();
		int total = size1+size2;
		
		for (int i=0;i<total;i++) {
			if(size1>0) {
				merged.add(list1.get(i));
				size1--;
			}
			if(size2>0) {
				merged.add(list2.get(i));
				size2--;
			}
			
		}
		return merged;
	}

	
}

public class GenericsQuestion1<T> {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the List 1 : ");
		int size = sc.nextInt();
		List<Integer> list1 = new ArrayList<>();
		System.out.println("Enter the elements for List 1 : ");
		for (int i = 0; i < size; i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("Enter the size of the List 2 : ");

		int size1 = sc.nextInt();
		List<Integer> list2 = new ArrayList<>();
		System.out.println("Enter the elements for List 2 : ");
		for (int i = 0; i < size1; i++) {
			list2.add(sc.nextInt());
		}
		Merge<Integer>  ListMerged = new Merge<>(list1,list2);
		List<Integer> newList = ListMerged.mergeList();
		
		System.out.println("Merged List"+newList);
	}

}
