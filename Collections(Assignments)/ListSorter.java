package com.collection.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorter {
	public static List<Integer> sortIntList(List<Integer> inputList) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(77);
		list.add(7);
		list.add(2);
		list.add(217);
		list.add(6);
		System.out.println("Before sorting:"+list);
		Collections.sort(list);
	    return list;
}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		System.out.println("AfterSorting:"+sortIntList(list));
	}
}