package Java0022Miscellaneous;

import java.util.Calendar;
import java.util.TimeZone;

public class DateTimeTimeZone {

	public static void main(String[] args) {

		/*Java TimeZone class represents a time zone offset, and also figures out daylight savings. 
		 * It inherits the Object class.
		 */

		//Java TimeZone class Example: getAvailableIDs()
		String[] id = TimeZone.getAvailableIDs();        
		System.out.println("In TimeZone class available Ids are: ");  
		for (int i=0; i<id.length; i++){  
			System.out.println(id[i]);  
		}



		//Java TimeZone class Example: getOffset()
		TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");   
		System.out.println("The Offset value of TimeZone: " +   
				zone.getOffset(Calendar.ZONE_OFFSET));



		//Java TimeZone class Example: getID()
		TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");       
		System.out.println("Value of ID is: " + timezone.getID());



		//Java TimeZone class Example: getDisplayName()
		TimeZone zone1 = TimeZone.getDefault();  
		String name = zone1.getDisplayName();         
		System.out.println("Display name for default time zone: " + name);



		//Java TimeZone class Example: getDefault()
		TimeZone zone2 = TimeZone.getDefault();     
		System.out.println("The ID of the default TimeZone is: " + zone2.getID());



		//Java TimeZone class Example: setID()
		TimeZone tz = TimeZone.getDefault();  

		// setting the time zone ID  
		tz.setID("GMT + 07:01");  

		// checking for the time zone ID  
		System.out.println("The Time zone ID is: " + tz.getID());
	}

}
