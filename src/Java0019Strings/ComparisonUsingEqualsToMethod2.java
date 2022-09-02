package Java0019Strings;

import java.util.ArrayList;

public class ComparisonUsingEqualsToMethod2 {
	@SuppressWarnings({ "unlikely-arg-type", "deprecation" })
	public static void main(String args[]){

		/*--------------------------------------------------------------------------------------*/
		//String equals method example
		String s1 = "Sachin";  
		String s2 = "SACHIN";  

		System.out.println(s1.equals(s2)); //false  
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		/*--------------------------------------------------------------------------------------*/

		/*--------------------------------------------------------------------------------------*/
		//The equals() method compares two strings and can be used in if-else control structure.

		String s3 = "javatpoint";    
		String s4 = "javatpoint";    
		String s5 = "Javatpoint";  

		System.out.println(s3.equals(s4)); //True because content is same    

		if (s1.equals(s5)) {  
			System.out.println("both strings are equal");  
		}
		else 
			System.out.println("both strings are unequal");
		/*--------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------*/
		//The equals method using for each loop
		String str1 = "Mukesh";   

		ArrayList<String> list = new ArrayList<>();  
		list.add("Ravi");   
		list.add("Mukesh");  
		list.add("Ramesh");  
		list.add("Ajay");  

		for (String str : list) {  
			if (str.equals(str1)) {  
				System.out.println("Mukesh is present");  
			}  
		}
		/*--------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------*/
		//The internal implementation of the equals() method shows that one can pass the reference 
		//of any object in the parameter of the method.
		String str2 = "a";  
		String str3 = "123";  
		String str4 = "45.89";  
		String str5 = "false";  

		
		Character c = new Character('a');  

		Integer i = new Integer(123);  

		Float f = new Float(45.89);  
		Boolean b = new Boolean(false);  

		//reference of the Character object is passed  
		System.out.println(str2.equals(c));  

		//reference of the Integer object is passed  
		System.out.println(str3.equals(i));  

		//reference of the Float object is passed  
		System.out.println(str4.equals(f));  

		//reference of the Boolean object is passed  
		System.out.println(str5.equals(b));  

		//the above print statements show a false value because  
		//we are comparing a String with different data types  
		//To achieve the true value, we have to convert   
		//the different data types into the string using the toString() method  
		System.out.println(str2.equals(c.toString()));  
		System.out.println(str3.equals(i.toString()));  
		System.out.println(str4.equals(f.toString()));  
		System.out.println(str5.equals(b.toString()));
		/*--------------------------------------------------------------------------------------*/
	}
}