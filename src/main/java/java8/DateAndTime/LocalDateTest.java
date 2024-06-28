package main.java.java8.DateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

	public static void main(String[] args) {

		 LocalDate date = LocalDate.now();
		 System.out.println("current date: "+date);
		
		 LocalDate localDate = LocalDate.of(2024, Month.SEPTEMBER, 24);
		 System.out.println("localDate of: "+localDate);
		 
		 /****************** plusMonth  *****************/
		 LocalDate plusDays = localDate.plusDays(10);
		 System.out.println("plusDays: "+plusDays);
		 LocalDate plusMonths = localDate.plusMonths(12);
		 System.out.println("plusMonths "+plusMonths);
		 LocalDate plusYears = localDate.plusYears(1);
		 System.out.println("plusYears: "+plusYears);
		 
		 /********************	get date, month , year	*****************/
		 System.out.println("*****	get date, month , year	****");
		 System.out.println("date: "+localDate.getDayOfMonth()+" month: "+localDate.getMonthValue()+" year: "+localDate.getYear());
		 
		 System.out.println("localDate.getMonth() returns month enum: "+localDate.getMonth());
		 
		 System.out.println("localDate.getDayOfMonth(): "+localDate.getDayOfMonth());
		 System.out.println("localDate.getDayOfYear(): "+localDate.getDayOfYear());
		 System.out.println("localDate.getDayOfWeek(): "+localDate.getDayOfWeek());
		 
		 System.out.println("Length of the current month: "+localDate.lengthOfMonth());
		 
		 System.out.println("isLEapyear: "+localDate.isLeapYear());
		 /************************	parse date from String	************************/
		 System.out.println("******	parse date from String	*******");
		 LocalDate parsedDate = LocalDate.parse("2024-09-24"); // yyyy-Mm-dd
		 System.out.println(localDate);
		 
	}

}
