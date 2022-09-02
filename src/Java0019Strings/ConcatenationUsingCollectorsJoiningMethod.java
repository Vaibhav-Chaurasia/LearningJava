package Java0019Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenationUsingCollectorsJoiningMethod {
	public static void main(String args[])  
	{  
		List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
		String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation  

		System.out.println(str.toString()); //Displays result  
	}
}

/*Here, a list of String array is declared. And a String object str stores the result of Collectors.joining() method.
 * */