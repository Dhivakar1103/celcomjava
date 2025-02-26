package com.celcom.day11;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(4, "RoseMilk");
		hashMap.put(1, "Chocolates");
		hashMap.put(2, "MilkShake");
		hashMap.put(3, "Pizza");
		
		hashMap.put(5, "Pizza");
		System.out.println(hashMap);
//		System.out.println("HashMap Elements:");
//		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
//
//		System.out.println("Get Value by Key : " + hashMap.get(1));
//
//		System.out.println("Contains Key (1): " + hashMap.containsKey(1));
//
//		System.out.println("Contains Value (Pizza): " + hashMap.containsValue("Pizza"));
//
//		hashMap.remove(3);
//		System.out.println("After Removing Key 3: " + hashMap);
//
//		hashMap.replace(2, "Vanilla Shake");
//		System.out.println("After Replacing Key 2: " + hashMap);
//
//		System.out.println("All Keys: " + hashMap.keySet());
//		Map<Integer, String> newMap = new HashMap<>();
//		newMap.put(6, "Biriyani");
//		newMap.putAll(hashMap);
//		newMap.put(null	, null);
//		newMap.put(8, null);
//
//		
//		System.out.println("After PutAll to newMap" + newMap);
//		System.out.println("Hash Code: " + hashMap.hashCode());
//		System.out.println("All Values: " + hashMap.values());
//
//		System.out.println("All Entries: " + hashMap.entrySet());
//
//		System.out.println("Is Map Empty? " + hashMap.isEmpty());
//		System.out.println("Map Size: " + hashMap.size());
//
//		hashMap.merge(4, "UpdatedRoseMilk", (oldValue, newValue) -> oldValue + " & " + newValue);
//		System.out.println("After Merging Key 4: " + hashMap);
//
//		Map<Integer, String> clonedMap = new HashMap<>(hashMap);
//		System.out.println("Cloned Map: " + clonedMap);
//
//		hashMap.clear();
//		System.out.println("After Clearing Map: " + hashMap);
	}
}
