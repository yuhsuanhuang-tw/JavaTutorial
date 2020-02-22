/**
 * @author Yu-Hsuan Huang
 * 
 * Learn how to convert the date time to Date class and Calendar class
 * y: Year
 * M: Month
 * d: Day of month
 * H: Hour in the day (0-23)	
 * h: Hour in am/pm for 12 hour format (1-12)
 * m: Minute in the hour
 * s: Second in the minute
 * S: Millisecond in the minute
 * 
 * Other: Please check in Javadoc https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
 */
package pers.sample.tutorial.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		try {
			//Date
			Date date = sdf.parse("19930331");
			System.out.println(date);
			System.out.println(date.getTime());
			
			
			//Calendar
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			System.out.println();
			System.out.println(date);
			System.out.println(date.getTime());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
}
