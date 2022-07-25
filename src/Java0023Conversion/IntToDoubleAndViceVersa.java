package Java0023Conversion;

public class IntToDoubleAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------Int To Double And Double to Int-----------------------------------*/
		/*------------------------------------------Int To Double-----------------------------------------------*/
		//Java Int to Double Example

		//Declaring Int variable  
		int i = 200;  
		double d = i;  
		System.out.println(d);


		//Java Int to Double Example: Double.valueOf()
		int i1 = 100;  
		Double d1 = new Double(i1); //first way  
		Double d2 = Double.valueOf(i1); //second way  
		System.out.println(d1);  
		System.out.println(d2);
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Double To Int-----------------------------------------------*/
		double d3 = 10.5;  
		int i2 = (int)d3;  
		System.out.println(i2);



		//intValue() example
		Double d4 = new Double(10.5);  
		int i3 = d4.intValue();  
		System.out.println(i3); 
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------Int To Double And Double to Int-----------------------------------*/
	}
}