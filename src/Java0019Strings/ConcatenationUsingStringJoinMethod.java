package Java0019Strings;

public class ConcatenationUsingStringJoinMethod {
	/* Driver Code */  
	public static void main(String args[])  
	{
		/*-------------------------------------------------------------------------------------------------*/
		String s1 = new String("Hello");    //String 1  
		String s2 = new String(" World");    //String 2  
		String s = String.join("", s1, s2);   //String 3 to store the result  

		System.out.println(s.toString());  //Displays result
		/*In the above code snippet, the String object s stores the result of 
		 * String.join("",s1,s2) method. A separator is specified inside quotation marks 
		 * followed by the String objects or array of String objects.
		 */
		/*-------------------------------------------------------------------------------------------------*/

		/*-------------------------------------------------------------------------------------------------*/
		//Join Example
		String joinString1 = String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);
		/*-------------------------------------------------------------------------------------------------*/


		/*-------------------------------------------------------------------------------------------------*/
		// delimiter to format the string as we did in the below example to show the date and time
		String date = String.join("/","25","06","2018");    
		System.out.print(date);    
		String time = String.join(":", "12", "10", "10");  
		System.out.println(" " + time);
		/*-------------------------------------------------------------------------------------------------*/



		/*-------------------------------------------------------------------------------------------------*/
		//If the elements that have to be attached with the delimiter have some strings, in which a 
		//few of them are null, then the null elements are treated as a normal string, 
		//and we do not get any exception or error.
		String str = null;  

		// one of the element is null however it will be treated as normal string  
		str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
		System.out.println(str);

		/*-------------------------------------------------------------------------------------------------*/

		/*-------------------------------------------------------------------------------------------------*/
		//In the case of using null as a delimiter, we get the null pointer exception.
		@SuppressWarnings("unused")
		String str2 = null;  
		str2 = String.join(null, "abc", "bcd", "apple");  
		System.out.println(str);
		/*-------------------------------------------------------------------------------------------------*/


		/*-------------------------------------------------------------------------------------------------*/
		//However, if the elements that have to be attached with the delimiter are null then, 
		//we get the ambiguity. It is because there are two join() methods, and null is acceptable 
		//for both types of the join() method.
		String str1 = null;  
		str1 = String.join("India", null);  
		System.out.println(str1);
		/*-------------------------------------------------------------------------------------------------*/
	}
}