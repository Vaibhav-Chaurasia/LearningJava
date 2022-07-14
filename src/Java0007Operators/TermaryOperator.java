package Java0007Operators;

public class TermaryOperator {

	public static void main(String[] args) {
		int a=2;  
		int b=5;  
		int min=(a < b) ? a : b;  
		System.out.println(min);

		int x=10;  
		int y=5;  
		int minimum=(x < y) ? x : y;  
		System.out.println(minimum);


		int number=13;
		String output = (number % 2 == 0)?"even number":"odd number";    
		System.out.println(output);  
	}

}
