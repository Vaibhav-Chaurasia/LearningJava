package Java0023Conversion;

public class StringToFloatAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------String To Float And Float to String-----------------------------------*/
		/*------------------------------------------String To Float-----------------------------------------------*/
		//Java String to Float Example

		//Declaring String variable  
		@SuppressWarnings("unused")
		String s = "23.6";  
		float f = Float.parseFloat("23.6");  
		System.out.println(f);		
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Float To String-----------------------------------------------*/
		//String.valueOf() example
		float f1 = 12.3F; //F is the suffix for float  
		String s1 = String.valueOf(f1);  
		System.out.println(s1);


		//float.toString() example
		float f2 = 89.7F;  
		String s2 = Float.toString(f2);  
		System.out.println(s2);
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------String To Float And Float to String-----------------------------------*/
	}
}