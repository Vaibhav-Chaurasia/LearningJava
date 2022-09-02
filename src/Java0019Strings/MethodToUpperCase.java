package Java0019Strings;

import java.util.Locale;

public class MethodToUpperCase {

	public static void main(String[] args) {

		/*--------------------------------------------------------------------------------------------------*/
		//To Upper Case Example
		String s1 = "hello string";  
		String s1upper = s1.toUpperCase();  
		System.out.println(s1upper);
		/*--------------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------------*/
		//Java String toUpperCase(Locale locale) Method
		String s = "hello string";    
		String turkish = s.toUpperCase(Locale.forLanguageTag("tr"));  
		String english = s.toUpperCase(Locale.forLanguageTag("en"));  
		System.out.println(turkish); //will print '?' instead of I in console but in actual will print I with dot. 
		System.out.println(english);
		/*--------------------------------------------------------------------------------------------------*/
	}
}
