package main.java.java8.DateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {

	public static void main(String[] args) {

		// Age - Calculation
		LocalDate birthdate = LocalDate.of(1997, Month.SEPTEMBER, 24);
		// current date
		LocalDate now =  LocalDate.now();
		// Age
		Period period = birthdate.until(now);
		System.out.println(period);
		
		System.out.println("Years: "+period.getYears()+" days: "+period.getDays()+" months: "+period.getMonths());
		
	}

}
