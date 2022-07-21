package Java0019Strings;

public class ConcatenationUsingStringBuilderClass {
	/* Driver Code */  
	public static void main(String args[])  
	{  
		StringBuilder s1 = new StringBuilder("Hello"); //String 1  
		StringBuilder s2 = new StringBuilder(" World"); //String 2  
		StringBuilder s = s1.append(s2); //String 3 to store the result  
		
		System.out.println(s.toString()); //Displays result  
	}
}

/*In the above code snippet, s1, s2 and s are declared as objects of StringBuilder class. 
 * s stores the result of concatenation of s1 and s2 using append() method.*/