package Java0023Conversion;

public class IntToLongAndViceVersa {

	public static void main(String[] args) {

		/*--------------------------------------Int To Long And Long to Int-----------------------------------*/
		/*------------------------------------------Int To Long-----------------------------------------------*/
		//Java Int to Long Example

		//Declaring Int variable  
		int i = 200;  
		long l = i;  
		System.out.println(l); 


		//Java Int to Long Example: Long.valueOf()
		int i1 = 100;  
		Long l1 = new Long(i1); //first way  
		Long l2 = Long.valueOf(i1); //second way  
		System.out.println(l1);  
		System.out.println(l2);
		/*----------------------------------------------------------------------------------------------------------*/


		/*------------------------------------------Long To Int-----------------------------------------------*/
		long l3 = 500;  
		int i2 = (int)l3;  
		System.out.println(i2);



		//intValue() example
		Long l4 = new Long(10);  
		int i3 = l4.intValue();  
		System.out.println(i3); 
		/*----------------------------------------------------------------------------------------------------------*/
		/*--------------------------------------Int To Long And Long to Int-----------------------------------*/
	}
}