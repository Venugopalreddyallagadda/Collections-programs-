package com.collection.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayToMap {

	public static Map<Integer, String> convertToMap(String[] names) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		for (int i = 0; i < names.length; i++) {
			m.put(i + 1, names[i]);
		}
		return m;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		String[] names = new String[sc.nextInt()];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter name" + (i + 1));
			names[i] = sc.next();
		}
		if (names.length == 0) {
			System.out.println("null");
		} else {
			Map<Integer, String> m = convertToMap(names);
			for (Map.Entry<Integer, String> x : m.entrySet()) {
				System.out.println(x.getKey() + " " + x.getValue());
			}
		}
	}
}
