package Java0022Miscellaneous;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeGetCurrentDateTime {
	public static void main(String[] args) {

		/*Get Current Date and Time: java.time.format.DateTimeFormatter
		The LocalDateTime.now() method returns the instance of LocalDateTime class. 
		If we print the instance of LocalDateTime class, it prints the current date and time.*/
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));



		/*Get Current Date: java.time.LocalDate
		The LocalDate.now() method returns the instance of the LocalDate class.
		If we print the instance of the LocalDate class, it prints the current date.*/
		System.out.println(java.time.LocalDate.now());



		/*Get Current Time: java.time.LocalTime
		The LocalTime.now() method returns the instance of LocalTime class. 
		If we print the instance of LocalTime class, it prints the current time.*/
		System.out.println(java.time.LocalTime.now());



		/*Get Current Date & Time: java.time.LocalDateTime
		The LocalDateTime.now() method returns the instance of LocalDateTime class. 
		If we print the instance of LocalDateTime class, it prints the current date and time.*/
		System.out.println(java.time.LocalDateTime.now());



		/*Get Current Date & Time: java.time.Clock
		The Clock.systemUTC().instant() method returns the current date and time both.*/
		System.out.println(java.time.Clock.systemUTC().instant());



		/*Get Current Date & Time: java.util.Date
		By printing the instance of java.util.Date class, you can print the current date and time in Java. 
		There are two ways to do so.*/
		//1st way
		java.util.Date date = new java.util.Date();    
		System.out.println(date);
		
		
		//2nd way
		long millis = System.currentTimeMillis();  
	    java.util.Date date1 = new java.util.Date(millis);      
	    System.out.println(date1);
	}
}
