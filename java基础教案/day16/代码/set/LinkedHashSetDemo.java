package com.zgjy.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> hashSet = new LinkedHashSet<>();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("Hello");
		hashSet.add("234");
		hashSet.add("Ð¡Äñ");
		hashSet.add("123");
		System.out.println(hashSet);

	}

}
