package main.java.java8.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {

		LocalDate date = LocalDate.of(2024, 9, 24);
		LocalTime localtime = LocalTime.of(12, 00);
		
		// creating lcoal date time from local date and local time
		LocalDateTime localdatetime = LocalDateTime.of(date, localtime);
		// creating zoned date time from local date and zone id
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localdatetime, ZoneId.of("Asia/Kolkata"));
		// OR ZonedDateTime.of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone)
		ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2024,9,24,11,30,10,00, ZoneId.of("Asia/Kolkata"));
		
		System.out.println("ZonedDatetime: "+zonedDateTime);
		
		ZonedDateTime americatime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println("America current datetime now: "+americatime);
		
		/********************	parse from String	***********************/
		ZonedDateTime zonedDateTimeOfAmerica = ZonedDateTime.parse("2024-10-06T02:00-07:00[America/Los_Angeles]");
		System.out.println(zonedDateTimeOfAmerica);
		
		/******************* get LocalDate, LocalTime from LocalDateTime	***********************/
		LocalDate localDate = zonedDateTimeOfAmerica.toLocalDate();
		LocalTime localTime = zonedDateTimeOfAmerica.toLocalTime();
		
		System.out.println("localDate: "+localDate+" localTime: "+localTime);
		/********************** date, month , year********************************/
		System.out.println("zonedDateTimeOfAmerica.getDayOfMonth()  "+zonedDateTimeOfAmerica.getDayOfMonth());
		
		System.out.println("zonedDateTimeOfAmerica.getYear()  "+zonedDateTimeOfAmerica.getYear());
		
		System.out.println("zonedDateTimeOfAmerica.getMonthValue()  "+zonedDateTimeOfAmerica.getMonthValue());
		
	}

}
