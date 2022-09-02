package Java0019Strings;

public class MethodReplace {
	public static void main(String[] args) {

		/*--------------------------------------------------------------------------------------------------*/
		//Java String replace(char old, char new) method
		String s1 = "javatpoint is a very good website";  
		String replaceString = s1.replace('a', 'e');//replaces all occurrences of 'a' to 'e'  

		System.out.println(replaceString); 
		/*--------------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------------*/
		//Java String replace(CharSequence target, CharSequence replacement) method
		String s2 = "my name is Juan my name is java";  
		String replaceString1 = s2.replace("is", "was");//replaces all occurrences of "is" to "was"  

		System.out.println(replaceString1);
		/*--------------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------------*/
		//Java String replace(char old, char new) method
		String str = "oooooo-hhhh-oooooo";  
		String rs = str.replace("h","s"); // Replace 'h' with 's'  
		System.out.println(rs);  

		rs = rs.replace("s","h"); // Replace 's' with 'h'  
		System.out.println(rs); 
		/*--------------------------------------------------------------------------------------------------*/



		/*--------------------------------------------------------------------------------------------------*/
		//Java String replace(char old, char new) method
		String str1 = "For learning Java, JavaTpoint is a very good site.";  
		@SuppressWarnings("unused")
		int size = str1.length();  

		System.out.println(str1);  
		String target = null;  

		// replacing null with JavaTpoint. Hence, the NullPointerException is raised.  
		str1 = str1.replace(target, "JavaTpoint ");  

		System.out.println(str1); 
		/*--------------------------------------------------------------------------------------------------*/
	}
}