package Java0023Conversion;

public class StringToBooleanAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------String To Boolean And Boolean to String-----------------------------------*/
		/*------------------------------------------String To Boolean-----------------------------------------------*/
		//Java String to Boolean Example

		//Declaring String variable  
		String s1 = "true";  
		String s2 = "TRue";  
		String s3 = "ok";  
		boolean b1 = Boolean.parseBoolean(s1);  
		boolean b2 = Boolean.parseBoolean(s2);  
		boolean b3 = Boolean.parseBoolean(s3);  
		System.out.println(b1);  
		System.out.println(b2);  
		System.out.println(b3); 


		//Java String to Boolean Example: Boolean.valueOf()
		b1 = Boolean.valueOf(s1);    
		b2 = Boolean.valueOf(s2);    
		b3 = Boolean.valueOf(s3);    
		System.out.println(b1);    
		System.out.println(b2);    
		System.out.println(b3);
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Boolean To String-----------------------------------------------*/
		//String.valueOf() example
		boolean b4 = true;  
		boolean b5 = false;  
		String s4 = String.valueOf(b4);  
		String s5 = String.valueOf(b5);
		System.out.println(s4);
		System.out.println(s5);




		//Boolean.toString() example
		s4 = Boolean.toString(b4);  
		s5 = Boolean.toString(b5);  
		System.out.println(s4);  
		System.out.println(s5);
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------String To Boolean And Boolean to String-----------------------------------*/
	}
}