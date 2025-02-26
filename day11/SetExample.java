package com.celcom.day11;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        set.add("new");
        set.add(3);
        set.add("York");
        set.add("N");

        System.out.println("Elements in set:");
        for (Object element : set) {
            System.out.println(element);
        }

        Set<String> set1 = new HashSet<>();
        set1.add("O");
        set1.add("N");
        set1.add("E");

        System.out.println("Set 1: " + set);
        System.out.println("Set 2: " + set1);
        System.out.println("Set contains 3: " + set.contains(3));
        System.out.println("Set contains all elements of Set 2: " + set.containsAll(set1));
        System.out.println("Hash Code of Set: " + set.hashCode());
        System.out.println("Size of the Set: " + set.size());

        set.retainAll(set1);
        System.out.println("Retained elements: " + set);

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
