package Java0008DecisionMakingStatements;

public class ifElseStatement {

	public static void main(String[] args) {

		//If-Else example
		int x = 10;  
		int y = 12;  
		if(x + y < 10) {  
			System.out.println("x + y is less than 10");  
		}   

		else {  
			System.out.println("x + y is greater than 20");  
		}


		//Program to check even or odd.
		int number=13;  

		//Check if the number is divisible by 2 or not  
		if(number % 2 == 0){  
			System.out.println("even number");  
		}

		else{  
			System.out.println("odd number");  
		}


		//Leap year program
		int year=2020;    

		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){  
			System.out.println("LEAP YEAR");  
		}  
		else{  
			System.out.println("COMMON YEAR");  
		}  
	}
}
