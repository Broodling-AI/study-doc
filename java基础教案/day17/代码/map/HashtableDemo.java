package com.zgjy.map;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "heloo");
		hashMap.put(null, "123");
		hashMap.put(2, null);
		System.out.println(hashMap);
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "heloo");
		hashtable.put(null, "123");
		hashtable.put(2, null);
		System.out.println(hashtable);

	}

}
