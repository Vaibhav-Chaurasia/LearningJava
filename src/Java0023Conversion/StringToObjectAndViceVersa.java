package Java0023Conversion;

public class StringToObjectAndViceVersa {

	public static void main(String[] args) throws ClassNotFoundException {

		/*--------------------------------------String To Object And Object to String-----------------------------------*/
		/*------------------------------------------String To Object-----------------------------------------------*/
		//Java String to Object Example

		//Declaring String variable  
		String s = "hello";  
		Object obj = s;  
		System.out.println(obj); 


		//Java String to Class object Example
		@SuppressWarnings("rawtypes")
		Class c = Class.forName("java.lang.String");  
		System.out.println("class name: " + c.getName());  
		System.out.println("super class name: " + c.getSuperclass().getName()); 
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Object To String-----------------------------------------------*/
		//String.valueOf() example
		StringToObjectAndViceVersa e = new StringToObjectAndViceVersa();  
		String s1 = e.toString();  
		String s2 = String.valueOf(e);  
		System.out.println(s1);  
		System.out.println(s2);  




		//Java Object to String Example: Converting StringBuilder
		String s3 = "hello";  
		StringBuilder sb = new StringBuilder(s3);  
		sb.reverse();  
		String rev = sb.toString(); //converting StringBuilder to String  
		System.out.println("String is: " + s3);  
		System.out.println("Reverse String is: " + rev);


		//Real Example to check palindrome
		String s4 = "nitin";  
		StringBuilder sb1 = new StringBuilder(s4);  
		sb1.reverse();  
		String rev1 = sb1.toString(); //converting StringBuilder to String  
		if(s4.equals(rev1)){  
			System.out.println("Palindrome String");  
		}

		else{  
			System.out.println("Not Palindrome String");
			/*----------------------------------------------------------------------------------------------------------*/
			/*--------------------------------------String To Object And Object to String-----------------------------------*/
		}
	}
}