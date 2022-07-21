package Java0019Strings;

public class MethodTrim {

	public static void main(String[] argvs) {

		/*--------------------------------------------------------------------------------------------------*/
		//Trim Method Example
		String s1 = "  hello string   ";  
		System.out.println(s1 + "javatpoint"); //without trim()  
		System.out.println(s1.trim() + "javatpoint"); //with trim()
		/*--------------------------------------------------------------------------------------------------*/



		/*--------------------------------------------------------------------------------------------------*/
		//removes all the trailing spaces so the length of the string also reduces.
		String s2 ="  hello java string   ";    
		System.out.println(s2.length());    
		System.out.println(s2); //Without trim()    
		String tr = s2.trim();    
		System.out.println(tr.length());    
		System.out.println(tr); //With trim()
		/*--------------------------------------------------------------------------------------------------*/



		/*--------------------------------------------------------------------------------------------------*/
		//The trim() can be used to check whether the string only contains white spaces or not.
		String str = " abc ";  

		if((str.trim()).length() > 0)  
		{  
			System.out.println("The string contains characters other than white spaces \n");  
		}  
		else  
		{  
			System.out.println("The string contains only white spaces \n");     
		}  

		str = "    ";  

		if((str.trim()).length() > 0)  
		{  
			System.out.println("The string contains characters other than white spaces \n");  
		}  
		else  
		{  
			System.out.println("The string contains only white spaces \n");     
		}
		/*--------------------------------------------------------------------------------------------------*/


		/*--------------------------------------------------------------------------------------------------*/
		//strings in Java are immutable; therefore, when the trim() method manipulates the string by 
		//trimming the whitespaces, it returns a new string. If the manipulation is not done by the 
		//trim() method, then the reference of the same string is returned.
		String str1 = " abc ";  

		if((str1.trim()).length() > 0)  
		{  
			System.out.println("The string contains characters other than white spaces \n");  
		}  
		else  
		{  
			System.out.println("The string contains only white spaces \n");     
		}  

		str1 = "    ";  

		if((str1.trim()).length() > 0)  
		{  
			System.out.println("The string contains characters other than white spaces \n");  
		}  
		else  
		{  
			System.out.println("The string contains only white spaces \n");     
		}
		/*--------------------------------------------------------------------------------------------------*/

	}

}
