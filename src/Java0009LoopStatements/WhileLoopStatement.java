package Java0009LoopStatements;

public class WhileLoopStatement {

	public static void main(String[] args) {

		//while loop example
		int k = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		
		while(k <= 10) {    
			System.out.println(k);    
			k = k + 2;    
		}

		
		
		//while loop example 2
		int i = 1;  
		
		while(i <= 10){  
			System.out.println(i);  
			i++;  
		}

		

		//Infinite Loop
		while(true){    
			System.out.println("infinitive while loop");    
		}    
	}
}