package Java0019Strings;

import java.util.Arrays;

public class SubstringUsingSplitMethod {
	public static void main(String args[])  
	{    
		String text = new String("Hello, My name is Sachin");  

		/* Splits the sentence by the delimeter passed as an argument */  
		String[] sentences = text.split("\\.");  
		System.out.println(Arrays.toString(sentences));  
	}
}

/* we have used the split() method. It accepts an argument \\. 
 * that checks a in the sentence and splits the string into another string. 
 * It is stored in an array of String objects sentences.*/