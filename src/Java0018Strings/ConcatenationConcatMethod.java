package Java0018Strings;

public class ConcatenationConcatMethod {
	public static void main(String args[]){

		/*--------------------------------------------------------------------------------------------*/
		//Concatenate two strings
		String s1 = "Sachin ";  
		String s2 = "Tendulkar";  
		String s3 = s1.concat(s2);  

		System.out.println(s3); //Sachin Tendulkar
		/*--------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------*/
		//Concatenate multiple strings
		String str1 = "Hello";  
		String str2 = "Javatpoint";  
		String str3 = "Reader";  

		// Concatenating one string   
		String str4 = str1.concat(str2);          
		System.out.println(str4);  

		// Concatenating multiple strings  
		String str5 = str1.concat(str2).concat(str3);  
		System.out.println(str5);
		/*--------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------*/
		//concatenating spaces and special chars to the string object. 
		//It is done using the chaining of the concat() method.

		String str6 = "Hello";  
		String str7 = "Javatpoint";  
		String str8 = "Reader";  

		// Concatenating Space among strings  
		String str9 = str6.concat(" ").concat(str7).concat(" ").concat(str8);  
		System.out.println(str9);         

		// Concatenating Special Chars        
		String str10 = str1.concat("!!!");  
		System.out.println(str10);         

		String str11 = str1.concat("@").concat(str7);  
		System.out.println(str11);
		/*--------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------*/
		// A Java program that shows how to add   
		// a string at the beginning of another string
		String str = "Country";  

		// we have added the string "India is my" before the String str;  
		// Also, observe that a string literal can also invoke the concat() method  
		String s = "India is my ".concat(str);  

		// displaying the string  
		System.out.println(s);
		/*--------------------------------------------------------------------------------------------*/
	}
}