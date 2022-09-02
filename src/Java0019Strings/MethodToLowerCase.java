package Java0019Strings;

import java.util.Locale;

public class MethodToLowerCase {

	public static void main(String[] args) {

		/*-------------------------------------------------------------------------------------------*/
		//To Lower Case example
		String s1 = "JAVATPOINT HELLO stRIng";  
		String s1lower = s1.toLowerCase();  
		System.out.println(s1lower);
		/*-------------------------------------------------------------------------------------------*/



		/*-------------------------------------------------------------------------------------------*/
		//Java String toLowerCase(Locale locale) Method
		//This method allows us to pass locale too for the various langauges.
		String s = "JAVATPOINT HELLO stRIng";    
		String eng = s.toLowerCase(Locale.ENGLISH);  
		System.out.println(eng);  
		String turkish = s.toLowerCase(Locale.forLanguageTag("tr")); //It shows i without dot  
		System.out.println(turkish);
		/*-------------------------------------------------------------------------------------------*/
	}
}