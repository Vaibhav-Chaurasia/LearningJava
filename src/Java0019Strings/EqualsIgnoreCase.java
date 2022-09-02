package Java0019Strings;

import java.util.ArrayList;

public class EqualsIgnoreCase {

	/*
	 * The Java String class equalsIgnoreCase() method compares the two given strings on the 
	 * basis of the content of the string irrespective of the case (lower and upper) of the string. 
	 * It is just like the equals() method but doesn't check the case sensitivity. 
	 * If any character is not matched, it returns false, else returns true.
	 * */

	public static void main(String args[]){
		
		/*------------------------------------------Simple Example-------------------------------------------*/
		String s1 = "javatpoint";  
		String s2 = "javatpoint";  
		String s3 = "JAVATPOINT";  
		String s4 = "python";  
		
		System.out.println(s1.equalsIgnoreCase(s2)); //true because content and case both are same  
		System.out.println(s1.equalsIgnoreCase(s3)); //true because case is ignored  
		System.out.println(s1.equalsIgnoreCase(s4)); //false because content is not same
		/*----------------------------------------------------------------------------------------------------*/


		
		/*------------------------------------------Array Example---------------------------------------------*/
		String str1 = "Mukesh Kumar";  
		ArrayList<String> list = new ArrayList<>();  
		list.add("Mohan");   
		list.add("Mukesh");  
		list.add("RAVI");  
		list.add("MuKesH kuMar");  
		list.add("Suresh");  
		
		for (String str : list) {  
			if (str.equalsIgnoreCase(str1)) {  
				System.out.println("Mukesh kumar is present");  
			}
		}
		/*-----------------------------------------------------------------------------------------------------*/
	}
}