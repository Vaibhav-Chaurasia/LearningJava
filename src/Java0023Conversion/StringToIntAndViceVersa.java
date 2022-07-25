package Java0023Conversion;

public class StringToIntAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------String To Int And Int to String-----------------------------------*/
		/*------------------------------------------String To Int-----------------------------------------------*/
		//Java String to int Example: Integer.parseInt()

		//Declaring String variable  
		String s = "200";  

		//Converting String into int using Integer.parseInt()  
		int i = Integer.parseInt(s);  

		//Printing value of i  
		System.out.println(i);
		System.out.println(s + 100); //200100, because "200"+100, here + is a string concatenation operator  
		System.out.println(i + 100); //300, because 200+100, here + is a binary plus operator


		//converting String into Integer using Integer.valueOf() method  
		Integer i1 = Integer.valueOf(s);  
		System.out.println(i1);


		//Java Program to demonstrate the case of NumberFormatException
		//		String s1 = "hello";  
		//		i = Integer.parseInt(s1);  
		//		System.out.println(i);
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Int To String-----------------------------------------------*/
		int i2 = 200;  

		//String.valueOf() example
		String s1 = String.valueOf(i2);
		System.out.println(i2 + 100); //300 because + is binary plus operator  
		System.out.println(s1 + 100); //200100 because + is string concatenation operator


		//Integer.toString() example
		String s2 = Integer.toString(i2);  
		System.out.println(i2 + 100); //300 because + is binary plus operator  
		System.out.println(s2 + 100); //200100 because + is string concatenation operator

		
		//String.format()
		String s3 = String.format("%d",i2);  
		System.out.println(s3);
		
		String s4=String.format("%d",i2);  
		System.out.println(s4);
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------String To Int And Int to String-----------------------------------*/
	}
}