package Java0022Miscellaneous;

import java.time.LocalDate;
import java.time.Year;

public class DateTimeGetYear {
	
	public static void main(String[] args) {
		
		/*Java Year class is an immutable date-time object that represents a year.
		It inherits the Object class and implements the Comparable interface.*/
		
		//Java Year Example: now()
		Year y = Year.now();  
	    System.out.println(y);
	    
	    
	    //Java Year Example: atDay()
	    Year y1 = Year.of(2017);  
	    LocalDate l = y1.atDay(123);  
	    System.out.println(l);
	    
	    
	    //Java Year Example: length()
	    Year year = Year.of(2017);  
	    System.out.println(year.length());
	    
	    
	    //Java Year Example: isLeap()
	    Year year1 = Year.of(2016);  
	    System.out.println(year1.isLeap());
	}

}
