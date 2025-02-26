package com.celcom.day11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put(4, "RoseMilk");
		linkedHashMap.put(1, "Chocolates");
		linkedHashMap.put(2, "MilkShake");
		linkedHashMap.put(3, "Pizza");
		linkedHashMap.put(5, "Pizza");
		System.out.println(linkedHashMap);
//		System.out.println("LinkedHashMap Elements:");
//		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
//
//		System.out.println("Get Value by Key : " + linkedHashMap.get(1));
//
//		System.out.println("Contains Key (1): " + linkedHashMap.containsKey(1));
//
//		System.out.println("Contains Value (Pizza): " + linkedHashMap.containsValue("Pizza"));
//
//		linkedHashMap.remove(3);
//		System.out.println("After Removing Key 3: " + linkedHashMap);
//
//		linkedHashMap.replace(2, "Vanilla Shake");
//		System.out.println("After Replacing Key 2: " + linkedHashMap);
//
//		System.out.println("All Keys: " + linkedHashMap.keySet());
//		Map<Integer, String> newMap = new LinkedHashMap<>();
//		newMap.put(6, "Biriyani");
//		newMap.putAll(linkedHashMap);
//		newMap.put(null, null);
//		newMap.put(8, null);
//		System.out.println("After PutAll to newMap" + newMap);
//		System.out.println("Hash Code: " + linkedHashMap.hashCode());
//		System.out.println("All Values: " + linkedHashMap.values());
//
//		System.out.println("All Entries: " + linkedHashMap.entrySet());
//
//		System.out.println("Is Map Empty? " + linkedHashMap.isEmpty());
//		System.out.println("Map Size: " + linkedHashMap.size());
//
//		linkedHashMap.merge(4, "UpdatedRoseMilk", (oldValue, newValue) -> oldValue + " & " + newValue);
//		System.out.println("After Merging Key 4: " + linkedHashMap);
//
//		Map<Integer, String> clonedMap = new HashMap<>(linkedHashMap);
//		System.out.println("Cloned Map: " + clonedMap);
//
//		linkedHashMap.clear();
//		System.out.println("After Clearing Map: " + linkedHashMap);
	}

}
