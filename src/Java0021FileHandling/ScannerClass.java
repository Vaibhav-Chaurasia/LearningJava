package Java0021FileHandling;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
 
		System.out.println("Please Enter Any String - ");
        String s = in.nextLine();
        System.out.println("You entered string " + s);
 
        System.out.println("Please Enter Any Number - ");
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
 
        System.out.println("Please Enter Any Decimal Number - ");
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}