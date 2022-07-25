package Java0022Miscellaneous;

public class DateTimeJavaUtilDate {
	
	
	public static void main(String[] args) {

		
		/*The java.util.Date class represents date and time in java. 
		It provides constructors and methods to deal with date and time in java.

		The java.util.Date class implements Serializable, Cloneable and Comparable<Date> interface. 
		It is inherited by java.sql.Date, java.sql.Time and java.sql.Timestamp interfaces.

		After Calendar class, most of the constructors and methods of java.util.Date class has been deprecated. 
		Here, we are not giving list of any deprecated constructor and method.*/
		java.util.Date date = new java.util.Date();  
		System.out.println(date);
		
		long millis = System.currentTimeMillis();  
		java.util.Date date1 = new java.util.Date(millis);  
		System.out.println(date1);
	}
}
