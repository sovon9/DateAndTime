package main.java.java8.DateAndTime;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {

		 LocalTime time = LocalTime.now();
		 System.out.println("current time: "+time);
		 
		 System.out.println("getHour: "+time.getHour());
		 System.out.println("getMinute: "+time.getMinute());
		 System.out.println("getSecond: "+time.getSecond());
		 
		 /*************** LocalTime.Of	*****************/
		 LocalTime localTime = LocalTime.of(8, 10, 20); // HH mm ss
		 System.out.println("localTime: "+localTime);
	}

}
