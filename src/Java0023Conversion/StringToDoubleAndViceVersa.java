package Java0023Conversion;

public class StringToDoubleAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------String To Double And Double to String-----------------------------------*/
		/*------------------------------------------String To Double-----------------------------------------------*/
		//Java String to Double Example

		//Declaring String variable  
		@SuppressWarnings("unused")
		String s = "23.6";  
		double d = Double.parseDouble("23.6");  
		System.out.println(d);	
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Double To String-----------------------------------------------*/
		//String.valueOf() example
		double d1 = 12.3;  
		String s1 = String.valueOf(d1);  
		System.out.println(s1);


		//Double.toString() example
		double d2 = 89.7;  
		String s2 = Double.toString(d2);  
		System.out.println(s2);
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------String To Double And Double to String-----------------------------------*/
	}
}