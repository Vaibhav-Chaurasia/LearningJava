package Java0018Strings;

public class MethodReplaceAll {

	public static void main(String[] args) {

		/*--------------------------------------------------------------------------------------------------*/
		//Java String replaceAll() example: replace character
		String s1 = "javatpoint is a very good website";  
		String replaceString = s1.replaceAll("a", "e");//replaces all occurrences of "a" to "e"  

		System.out.println(replaceString);
		/*--------------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------------*/
		//replace all the occurrences of a single word or set of words.
		String s2 = "My name is Juan. My name is Bob. My name is Sonoo.";  
		String replaceString1 = s2.replaceAll("is", "was");//replaces all occurrences of "is" to "was"  

		System.out.println(replaceString1);
		/*--------------------------------------------------------------------------------------------------*/




		/*--------------------------------------------------------------------------------------------------*/
		//Java String replaceAll() example: remove white spaces
		String s3 = "My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString2 = s3.replaceAll("\\s","");  

		System.out.println(replaceString2); 
		/*--------------------------------------------------------------------------------------------------*/




		/*--------------------------------------------------------------------------------------------------*/
		//The replaceAll() method can also be used to insert spaces between characters.
		// input string  
		String str = "JavaTpoint";  
		System.out.println(str);  

		String regex = "";  
		// adding a white space before and after every character of the input string.  
		str = str.replaceAll(regex, " ");  

		System.out.println(str);
		/*--------------------------------------------------------------------------------------------------*/




		/*--------------------------------------------------------------------------------------------------*/
		//The replaceAll() method throws the PatternSyntaxException when there is an improper regular expression.

		// input string  
		String str1 = "For learning Java, JavaTpoint is a very good site.";  

		System.out.println(str1);  

		String regex1 = "\\"; // the regular expression is not valid.  

		// invoking the replaceAll() method raises the PatternSyntaxException  
		str1 = str1.replaceAll(regex1, "JavaTpoint ");  

		System.out.println(str1); 
		/*--------------------------------------------------------------------------------------------------*/




		/*--------------------------------------------------------------------------------------------------*/
		//Even the null regular expression is also not accepted by the replaceAll() method as the 
		//NullPointerException is raised.

		// input string  
		String str2 = "JavaTpoint";  
		System.out.println(str2);  

		String regex2 = null; // regular expression is null  

		str2 = str2.replaceAll(regex2, " ");  

		System.out.println(str2); 
		/*--------------------------------------------------------------------------------------------------*/
	}
}