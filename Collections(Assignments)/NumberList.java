package com.collection.programs;

import java.util.Arrays;
import java.util.Scanner;

public class NumberList {
	static String getNumberList(String numberList) {
		String str ="";
        if(numberList == null) {
            return null;
        }
        String[] array = (numberList.replaceAll("-", ",").split(","));
        int[] numbers = new int[array.length];
        for(int i = 0;i < array.length;i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(numbers);
        for(int i = numbers[0];i <= numbers[numbers.length-1]; i++) {
            str += i+",";
        }
        return str.substring(0, str.length()-1);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number list: ");
	        String list = sc.next(); 
	        System.out.println(getNumberList(list));
	}
}