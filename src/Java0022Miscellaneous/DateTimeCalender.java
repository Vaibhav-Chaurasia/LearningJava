package Java0022Miscellaneous;

import java.util.Calendar;

public class DateTimeCalender {

	public static void main(String[] args) {

		/*Java Calendar class is an abstract class that provides methods for converting date 
		between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc. 
		It inherits Object class and implements the Comparable interface.*/

		//Java Calendar Class Example
		Calendar calendar = Calendar.getInstance();  
		System.out.println("The current date is : " + calendar.getTime());  
		calendar.add(Calendar.DATE, -15);  
		System.out.println("15 days ago: " + calendar.getTime());  
		calendar.add(Calendar.MONTH, 4);  
		System.out.println("4 months later: " + calendar.getTime());  
		calendar.add(Calendar.YEAR, 2);  
		System.out.println("2 years later: " + calendar.getTime());



		//Java Calendar Class Example: get()
		Calendar calendar1 = Calendar.getInstance();  
		System.out.println("At present Calendar's Year: " + calendar1.get(Calendar.YEAR));  
		System.out.println("At present Calendar's Day: " + calendar1.get(Calendar.DATE));



		//Java Calendar Class Example: getInstance()
		Calendar calendar2 = Calendar.getInstance();  
		System.out.print("At present Date And Time Is: " + calendar2.getTime());



		//Java Calendar Class Example: getMaximum()
		Calendar calendar3 = Calendar.getInstance();  
		int maximum = calendar3.getMaximum(Calendar.DAY_OF_WEEK);  
		System.out.println("Maximum number of days in week: " + maximum);  
		maximum = calendar3.getMaximum(Calendar.WEEK_OF_YEAR);  
		System.out.println("Maximum number of weeks in year: " + maximum);



		//Java Calendar Class Example: getMinimum()
		Calendar cal = Calendar.getInstance();  
		int maximum1 = cal.getMinimum(Calendar.DAY_OF_WEEK);  
		System.out.println("Minimum number of days in week: " + maximum1);  
		maximum1 = cal.getMinimum(Calendar.WEEK_OF_YEAR);  
		System.out.println("Minimum number of weeks in year: " + maximum1);
	}
}