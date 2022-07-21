package Java0019Strings;

public class MethodIsEmpty {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*-----------------------------------------------------------------------------------------------*/
		//Is Empty Example
		String s1="";  
		String s2="javatpoint";  

		System.out.println(s1.isEmpty());  
		System.out.println(s2.isEmpty());
		/*-----------------------------------------------------------------------------------------------*/



		/*-----------------------------------------------------------------------------------------------*/
		//Is Empty Example using if else statement using or operator
		String s3="";    
		String s4="Javatpoint";             

		// Either length is zero or isEmpty is true  
		if(s3.length() == 0 || s3.isEmpty())  
			System.out.println("String s3 is empty");  

		else 
			System.out.println("s3");        

		if(s4.length() == 0 || s4.isEmpty())  
			System.out.println("String s4 is empty");  

		else 
			System.out.println(s4);
		/*-----------------------------------------------------------------------------------------------*/


		/*-----------------------------------------------------------------------------------------------*/
		//Blank Strings
		//Blank strings are those strings that contain only white spaces. The isEmpty() method comes in 
		//very handy to check for the blank strings.
		// a blank string  
		String str = "     ";  
		int size = str.length();  

		// trim the white spaces and after that  
		// if the string results in the empty string   
		// then the string is blank; otherwise, not.  
		if(size == 0)  
		{  
			System.out.println("The string is empty. \n");  
		}  
		else if(size > 0 && str.trim().isEmpty())  
		{  
			System.out.println("The string is blank. \n");  
		}  
		else  
		{  
			System.out.println("The string is not blank. \n");  
		}  

		str = " Welcome to JavaTpoint.  ";  
		size = str.length();  
		
		if(size == 0)  
		{  
			System.out.println("The string is empty. \n");  
		}  
		
		if(size > 0 && str.trim().isEmpty())  
		{  
			System.out.println("The string is blank. \n");  
		}  
		else  
		{  
			System.out.println("The string is not blank. \n");  
		}
		/*-----------------------------------------------------------------------------------------------*/



		/*-----------------------------------------------------------------------------------------------*/
		//Empty Vs. Null Strings
		//Here, we can use the == operator to check for the null strings.
		String str1 = null;  
		if(str1.isEmpty())  
		{  
			System.out.println("The string is null.");  
		}  
		else  
		{  
			System.out.println("The string is not null.");  
		}
		/*-----------------------------------------------------------------------------------------------*/
	}
}