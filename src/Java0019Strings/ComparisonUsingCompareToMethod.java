package Java0019Strings;

import java.util.ArrayList;
import java.util.Collections;

public class ComparisonUsingCompareToMethod {
	@SuppressWarnings("null")
	public static void main(String args[]){

		/*---------------------------------------------------------------------------------------------*/
		//CompareTo method simple
		String s1 = "Sachin";  
		String s2 = "Sachin";  
		String s3 = "Ratan";  

		System.out.println(s1.compareTo(s2)); //0  
		System.out.println(s1.compareTo(s3)); //1 (because s1 > s3 and formula is s1-s3)  
		System.out.println(s3.compareTo(s1)); //-1 (because s3 < s1 and formula is s3-s1)
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		/*Java String compareTo(): empty string
		If first string is an empty string, the method returns a negative
		If second string is an empty string, the method returns a positive number that is the length of the first string.*/
		String s4 = "hello";  
		String s5 = "";  
		String s6 = "me";  
		System.out.println(s4.compareTo(s5));  
		System.out.println(s5.compareTo(s6));
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		/*Java String compareTo(): case sensitive
		 input string in uppercase

		 Suppose, a string having letters in uppercase, and the second string having the letters in lowercase. 
		 On comparing these two string, if the outcome is 0, then the compareTo() method does not consider 
		 the case sensitiveness of characters; otherwise, the method considers 
		 the case sensitiveness of characters.
		 */
		String st1 = new String("INDIA IS MY COUNTRY");  

		// input string in lowercase  
		String st2 = new String("india is my country");  

		System.out.println(st1.compareTo(st2));
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		//Java String compareTo(): NullPointerException
		//The NullPointerException is thrown when a null object invokes the compareTo() method.
		String str = null;  

		// null is invoking the compareTo method. Hence, the NullPointerException  
		// will be raised  
		int no =  str.compareTo("India is my country.");  

		System.out.println(no);
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		//To Implement Class exception please comment the Null Pointer Exception code.
		//Java String compareTo(): ClassCastException
		//The ClassCastException is thrown when objects of incompatible types get compared.
		Players ronaldo = new Players("Ronaldo");  
		Players sachin = new Players("Sachin");  
		Players messi = new Players("Messi");  

		ArrayList<Players> al = new ArrayList<>();  

		al.add(ronaldo);  
		al.add(sachin);  
		al.add(messi);  

		// performing binary search on the list al  
		Collections.binarySearch(al, "Sehwag", null);  
	}
	/*-------------------------------------------------------------------------------------------------*/

}


//Java String compareTo(): ClassCastException
//The ClassCastException is thrown when objects of incompatible types get compared.
class Players   
{  

	@SuppressWarnings("unused")
	private String name;  

	// constructor of the class  
	public Players(String str)  
	{  
		name = str;  
	}
}