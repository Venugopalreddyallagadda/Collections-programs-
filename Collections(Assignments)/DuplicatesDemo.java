package com.collection.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DuplicatesDemo {
	public static void getDuplicatesList() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(33,45,67,89,33,47,89,45));
        System.out.println("Numbers :"+Arrays.asList(33,45,67,89,33,47,89,45));
          HashSet<Integer> set1 = new HashSet<>();
          HashSet<Integer> set2 = new HashSet<>();
          for (Integer p : arr) {
             if(!set1.add(p)) {
                set2.add(p);
             }
          }
          
          System.out.println("Duplicate are " + set2);
    }
	
	public static void main(String[] args) {
		getDuplicatesList();
		
	    
	}
}
