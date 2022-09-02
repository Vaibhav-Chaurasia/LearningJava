package Java0019Strings;

public class MethodContains {

	public static void main(String[] args) {
		/*---------------------------------------------------------------------------------------------------*/
		//String contains() Method 
		String name = "what do you know about me";  
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));
		/*---------------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------------*/
		//The contains() method searches case-sensitive char sequence. If the argument is not case sensitive, 
		//it returns false.
		String str = "Hello Javatpoint readers";  
		boolean isContains = str.contains("Javatpoint");  
		System.out.println(isContains);  
		
		// Case Sensitive  
		System.out.println(str.contains("javatpoint")); // false
		/*---------------------------------------------------------------------------------------------------*/



		/*---------------------------------------------------------------------------------------------------*/
		//The contains() method is helpful to find a char-sequence in the string. 
		//We can use it in the control structure to produce the search-based result.
		String str1 = "To learn Java visit Javatpoint.com";        

		if(str1.contains("Javatpoint.com")) {  
			System.out.println("This string contains javatpoint.com");  
		}
		else  
			System.out.println("Result not found");
		/*---------------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------------*/
		//The contains() method raises the NullPointerException
		//when one passes null in the parameter of the method
		String str2 = "Welcome to JavaTpoint!";  

		// comparing a string to null  
		if(str2.contains(null))  
		{  
			System.out.println("Inside the if block");  
		}  
		else
		{  
			System.out.println("Inside the else block");  
		}
		/*---------------------------------------------------------------------------------------------------*/
	}
}