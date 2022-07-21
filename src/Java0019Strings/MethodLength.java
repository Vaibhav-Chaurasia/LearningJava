package Java0019Strings;

public class MethodLength {
	public static void main(String[] args) {

		/*------------------------------------------------------------------------------------------------------------*/
		//String Length example
		String s1 = "javatpoint";  
		String s2 = "python";  
		System.out.println("string length is: " + s1.length());//10 is the length of javatpoint string  
		System.out.println("string length is: " + s2.length());//6 is the length of python string
		/*------------------------------------------------------------------------------------------------------------*/



		/*------------------------------------------------------------------------------------------------------------*/
		//Since the length() method gives the total number of characters present in the string; 
		//therefore, one can also check whether the given string is empty or not.
		String str = "Javatpoint";  
		if(str.length() > 0) {  
			System.out.println("String is not empty and length is: " + str.length());  
		}  
		str = "";  
		if(str.length() == 0) {  
			System.out.println("String is empty now: " + str.length());  
		}
		/*------------------------------------------------------------------------------------------------------------*/



		/*------------------------------------------------------------------------------------------------------------*/
		//The length() method is also used to reverse the string.
		String str1 = "Welcome To JavaTpoint";  
		int size = str1.length();  

		System.out.println("Reverse of the string: " + "'" + str1 + "'" + " is");  

		for(int i = 0; i < size; i++)  
		{  
			// printing in reverse order  
			System.out.print(str1.charAt(str1.length() - i - 1));  
		}
		/*------------------------------------------------------------------------------------------------------------*/




		/*------------------------------------------------------------------------------------------------------------*/
		//The length() method can also be used to find only the white spaces present in the string.
		String str2 = " Welcome To JavaTpoint ";  
		int sizeWithWhiteSpaces = str2.length();  

		System.out.println("In the string: " + "'" + str2 + "'");  

		str2 = str2.replace(" ", "");  
		int sizeWithoutWhiteSpaces = str2.length();  

		// calculating the white spaces  
		int noOfWhieSpaces = sizeWithWhiteSpaces - sizeWithoutWhiteSpaces;  

		System.out.print("Total number of whitespaces present are: " + noOfWhieSpaces);
		/*------------------------------------------------------------------------------------------------------------*/
	}
}
