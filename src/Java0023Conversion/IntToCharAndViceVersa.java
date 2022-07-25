package Java0023Conversion;

public class IntToCharAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------Int To Char And Char to Int-----------------------------------*/
		/*------------------------------------------Int To Char-----------------------------------------------*/
		//Java Int to Char Example

		//Declaring Int variable  
		int a = 65;  
		@SuppressWarnings("unused")
		char c = (char)a;  
		System.out.println(a);


		/*But if you store 1, it will store ASCII character of given number which is start of heading which is not printable. 
		 * So it will not print anything on the console.
		 */
		int a1 = 1;    
		char c1 = (char)a1;    
		System.out.println(c1);
		
		
		/*If you add '0' with int variable, it will return actual value in the char variable. 
		 * The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which is equal to 1. 
		 * The ASCII character of 49 is 1.*/
		int a2 = 1;    
		char c2 = (char)(a2 + '0');    
		System.out.println(c2);
		
		
		/*If you store integer value in a single quote, it will store actual character in char variable.*/
		int a3 = '1';    
		char c3 = (char)a3;    
		System.out.println(c3);
		
		
		
		//Java int to char Example: Character.forDigit()
		//To get the actual value, you can also use Character.forDigit() method.
		int REDIX = 10; //redix 10 is for decimal number, for hexa use redix 16  
		int a4 = 1;    
		char c4 = Character.forDigit(a4, REDIX);    
		System.out.println(c4);
		
		
		
		//To get the hexa value, use redix 16 in Character.forDigit() method.
		int REDIX1 = 16; //redix 16 is for Hexadecimal value  
		int a5 = 10;    
		char c5 = Character.forDigit(a5, REDIX1);    
		System.out.println(c5);
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Char To Int-----------------------------------------------*/
		//Java char to int Example: Get ASCII value
		char c6 = 'a';  
		char c7='1';  
		int a6 = c6;  
		int b = c7;  
		System.out.println(a6);  
		System.out.println(b);

		
		//Java char to int Example: Character.getNumericValue()
		char c8 = '1';  
		int a8 = Character.getNumericValue(c8);  
		System.out.println(a8);
		
		
		//Java char to int Example: String.valueOf()
		char c9 = '1';  
		int a9 = Integer.parseInt(String.valueOf(c9));  
		System.out.println(a9);
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------Int To Char And Char to Int-----------------------------------*/
	}
}