package Java0019Strings;

public class ConcatenationUsingStringFormatMethod {
	/* Driver Code */  
	public static void main(String args[])  
	{  
		String s1 = new String("Hello"); //String 1  
		String s2 = new String(" World"); //String 2  
		String s = String.format("%s%s", s1, s2); //String 3 to store the result  
		
		System.out.println(s.toString()); //Displays result  
	}
}

/*Here, the String objects s is assigned the concatenated result of Strings 
 * s1 and s2 using String.format() method. format() accepts parameters as 
 * format specifier followed by String objects or values.
 */