package Java0006Constants;

import java.util.Scanner;

public class Constants {

	public static final double PRICE = 234.90;
	private static final double RATE = 20.1; 
	
	public static void main(String[] args)  
	{  
		int unit;  
		double total_bill;
		
		System.out.print("Enter the number of units you have used: ");  
		
		Scanner sc = new Scanner(System.in);  
		unit = sc.nextInt();  
		total_bill = PRICE * unit * RATE;  
		
		System.out.println("The total amount you have to deposit is: "+total_bill);
		sc.close();
	}
}