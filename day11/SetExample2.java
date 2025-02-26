
package com.celcom.day11;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		Set<Object> set = new LinkedHashSet<>();
		set.add("Dhivakar");
		set.add(null);
		set.add("Ramesh");
		set.add("Preet");

		System.out.println("Elements in set:");
		for (Object element : set) {
			System.out.println(element);
		}

		Set<String> set1 = new LinkedHashSet<>();
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

		set.remove(3);
		set.addAll(set1);
		System.out.println("Set after adding elements from Set 2: " + set);

		set.removeAll(set1);
		set.clear();
		System.out.println("Final Set (after clearing): " + set);
	}
}
