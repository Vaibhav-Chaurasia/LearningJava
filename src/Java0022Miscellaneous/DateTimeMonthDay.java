package Java0022Miscellaneous;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class DateTimeMonthDay {

	public static void main(String[] args) {
		
		/*Java MonthDay class is an immutable date-time object that represents the combination of a month and day-of-month.
		 * It inherits Object class and implements the Comparable interface.*/
		
		//Java MonthDay Class Example
		MonthDay month = MonthDay.now();  
	    LocalDate date = month.atYear(1994);  
	    System.out.println(date);
	    
	    
	    //Java MonthDay Class Example: isValidYear()
	    MonthDay month1 = MonthDay.now();  
	    boolean b = month1.isValidYear(2012);  
	    System.out.println(b);
	    
	    
	    //Java MonthDay Class Example: get()
	    MonthDay month2 = MonthDay.now();  
	    long n = month2.get(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(n);
	    
	    
	    //Java MonthDay Class Example: range()
	    MonthDay month3 = MonthDay.now();  
	    ValueRange r1 = month3.range(ChronoField.MONTH_OF_YEAR);  
	    System.out.println(r1);  
	    ValueRange r2 = month3.range(ChronoField.DAY_OF_MONTH);  
	    System.out.println(r2);
	}
}
