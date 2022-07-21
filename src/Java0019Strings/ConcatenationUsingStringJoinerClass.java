package Java0019Strings;

import java.util.StringJoiner;

public class ConcatenationUsingStringJoinerClass {
	public static void main(String args[])  
	{  
		StringJoiner s = new StringJoiner(", ");   //StringeJoiner object  
		s.add("Hello");    //String 1   
		s.add("World");    //String 2  

		System.out.println(s.toString());  //Displays result  
	}
}

/*In the above code snippet, the StringJoiner object s is declared and the constructor StringJoiner() 
 * accepts a separator value. A separator is specified inside quotation marks. The add() method 
 * appends Strings passed as arguments.
 * */