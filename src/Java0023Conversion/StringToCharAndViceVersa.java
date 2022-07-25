package Java0023Conversion;

public class StringToCharAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------String To Char And Char to String-----------------------------------*/
		/*------------------------------------------String To Char-----------------------------------------------*/
		//Java String to Char Example

		//Declaring String variable  
		String s = "hello";  
		char c = s.charAt(0); //returns h  
		System.out.println("1st character is: " + c);


		//example to convert all characters of a string into character.
		String s1 = "hello";    
		for(int i = 0; i < s.length(); i++){  
			char c1 = s1.charAt(i);  
			System.out.println("char at " + i + " index is: " + c1);  
		}
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Char To String-----------------------------------------------*/
		//String.valueOf() example
		char c2 = 'S';  
		String s2 = String.valueOf(c2);  
		System.out.println("String is: " + s2);


		//Character.toString() example
		char c3 = 'M';    
		String s3 = Character.toString(c3);  
		System.out.println("String is: " + s3);
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------String To Char And Char to String-----------------------------------*/
	}
}