package main.java.java8.DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DurationTest {

	public static void main(String[] args) {

		/*
		 *  this is just for demonstration, it's recommended to use System.nanoTime() for actual method execution
		 *  time calculation
		 */
		Instant startTime = Instant.now();
		Arrays.sort(new int[] {2,6,5,2,8,0,4,1,5,8,9,53,2,6,8,943,2,678,34,123,436,7});
		Instant endTime = Instant.now();
		
		System.out.println("Duration of the sort in miliseconds: "+Duration.between(startTime, endTime).toMillis());
		
		// recommended approach
		long sTime = System.currentTimeMillis();
		for(int i=0; i<100; i++)
		{
			List<Integer> list = Stream.iterate(0, s->s+9).limit(500).collect(Collectors.toList());
			Collections.sort(list);
		}
		long eTime = System.currentTimeMillis();
		long time = eTime-sTime;
		System.out.println(time);
		
	}

}
