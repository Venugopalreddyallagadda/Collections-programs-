package com.collection.programs;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;


public class MonthPrinter {
	
	public static void getMonthCalender() {
		YearMonth ym = YearMonth.of(2021, 04);
		 String firstDay = ym.atDay(1).getDayOfWeek().name();
		 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		 System.out.println();
		 System.out.println("First Day of the Month:"+firstDay);
	 	 System.out.println("Last Day of the Month:"+lastDay);
		 System.out.println();
	}
	public static void main(String[] args) {
		getMonthCalender();
		    
			}
}
