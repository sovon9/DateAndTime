package main.java.java8.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2024, 9, 24);
		LocalTime localtime = LocalTime.of(12, 00);
		
		// creating lcoal date time from local date and local time
		LocalDateTime localdatetime = LocalDateTime.of(date, localtime);
		System.out.println(localdatetime);
		
		/********************	parse from String	***********************/
		LocalDateTime dateTime = LocalDateTime.parse("2024-10-06T02:00");
		System.out.println(dateTime);
		
		/******************* get LocalDate, LocalTime from LocalDateTime	***********************/
		LocalDate localDate = dateTime.toLocalDate();
		LocalTime localTime = dateTime.toLocalTime();
		
		System.out.println("localDate: "+localDate+" localTime: "+localTime);
		/********************** date, month , year********************************/
		System.out.println("dateTime.getDayOfMonth()  "+dateTime.getDayOfMonth());
		
		System.out.println("dateTime.getYear()  "+dateTime.getYear());
		
		System.out.println("dateTime.getMonthValue()  "+dateTime.getMonthValue());
		
	}

}
