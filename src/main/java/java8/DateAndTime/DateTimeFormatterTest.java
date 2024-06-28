package main.java.java8.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {

	public static void main(String[] args) {

		LocalDate date = LocalDate.parse("2024-09-24"); // yyyy-MM-dd
		System.out.println("using general date format: "+date);
		
		/*
		 * Now if we want to get date in 24/09/2024 format then we have to use DateTimeFormatter
		 */
		//LocalDate fomattedDate = LocalDate.parse("24-09-1997"); // will throw exception as not as per default date format
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate formattedDate = LocalDate.parse("24-09-1997", dateFormatter);
		System.out.println("Formatter parsed date: "+formattedDate); 
		/*
		 * Output  1997-09-24 which is not formatted
		 */
		String format = formattedDate.format(dateFormatter);
		System.out.println("Formatted date: "+format);
		
		DateTimeFormatter datetimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime datetime = LocalDateTime.parse("24-09-1997 12:00:10", datetimeFormatter);
		System.out.println("Formatter parsed datetime: "+datetime);
		
		String dateandtime = datetime.format(datetimeFormatter);
		System.out.println("Formatted DateTime: "+dateandtime);
		
	}

}
