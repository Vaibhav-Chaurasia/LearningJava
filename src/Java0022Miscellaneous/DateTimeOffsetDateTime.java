package Java0022Miscellaneous;

import java.time.OffsetDateTime;

public class DateTimeOffsetDateTime {
	
	public static void main(String[] args) {
		
		/*OffsetDateTime class is used to store the date and time fields, to a precision of nanoseconds.*/
		
		//Java OffsetDateTime Class Example: getDayOfMonth()
		OffsetDateTime offsetDT = OffsetDateTime.now();  
        System.out.println(offsetDT.getDayOfMonth());
        
        
        //Java OffsetDateTime Class Example: getDayOfYear()
        OffsetDateTime offsetDT1 = OffsetDateTime.now();  
        System.out.println(offsetDT1.getDayOfYear());
        
        
        //Java OffsetDateTime Class Example: getDayOfWeek()
        OffsetDateTime offsetDT2 = OffsetDateTime.now();  
        System.out.println(offsetDT2.getDayOfWeek());
        
        
        //Java OffsetDateTime Class Example: toLocalDate()
        OffsetDateTime offsetDT3 = OffsetDateTime.now();  
        System.out.println(offsetDT3.toLocalDate());
        
        
        //Java OffsetDateTime Class Example: minusDays()
        OffsetDateTime offset = OffsetDateTime.now();  
        OffsetDateTime value =  offset.minusDays(240);  
        System.out.println(value);
        
        
        //Java OffsetDateTime Class Example: plusDays()
        OffsetDateTime offset1 = OffsetDateTime.now();  
        OffsetDateTime value1 =  offset1.plusDays(240);  
        System.out.println(value1);
	}

}
