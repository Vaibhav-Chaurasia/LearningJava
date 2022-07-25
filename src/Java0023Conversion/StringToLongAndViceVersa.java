package Java0023Conversion;

public class StringToLongAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------String To Long And Long to String-----------------------------------*/
		/*------------------------------------------String To Long-----------------------------------------------*/
		//Java String to long Example

		//Declaring String variable  
		String s = "9990449935";  
		long l = Long.parseLong(s);  
		System.out.println(l);		
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Long To String-----------------------------------------------*/
		//String.valueOf() example
		long i = 9993939399L;  
		String s1 = String.valueOf(i);  
		System.out.println(s1);


		//Long.toString() example
		String s2 = Long.toString(i);  
		System.out.println(s2); 
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------String To Long And Long to String-----------------------------------*/
	}
}