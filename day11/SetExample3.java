package com.celcom.day11;

import java.util.Set;
import java.util.TreeSet;

public class SetExample3 {

	public static void main(String[] args)throws NullPointerException {
		
		Set <Object> set = new TreeSet<>();
		set.add("Dhivakar");
		try{
			set.add(null);
		}catch(NullPointerException e){
			System.out.println("It throws NullPointerException");
		}
		set.add("Ramesh");
		set.add("Preet");

		System.out.println("Elements in set:");
		for (Object element : set) {
			System.out.println(element);
		}

		Set<String> set1 = new TreeSet<>();
		set1.add("Mani");
		set1.add("Shervin ");
		set1.add("Ramesh");

		System.out.println("Set 1: " + set);
		System.out.println("Set 2: " + set1);
		System.out.println("Set contains Preet: " + set.contains("Preet"));
		System.out.println("Set contains all elements of Set 2: " + set.containsAll(set1));
		System.out.println("Hash Code of Set: " + set.hashCode());
		System.out.println("Size of the Set: " + set.size());

		set.retainAll(set1);
		

		System.out.println("Elements after retain operation:");
		for (Object element : set) {
			System.out.println(element);
		}

		set.addAll(set1);
		System.out.println("Set after adding elements from Set 2: " + set);

		set.removeAll(set1);
		set.clear();
		System.out.println("Final Set (after clearing): " + set);
	}

}
