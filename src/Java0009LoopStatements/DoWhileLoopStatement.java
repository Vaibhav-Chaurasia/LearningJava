package Java0009LoopStatements;

public class DoWhileLoopStatement {

	public static void main(String[] args) {

		//Do while example
		int i = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    

		do {    
			System.out.println(i);    
			i = i + 2;    
		}while(i <= 10); 


		//Do while example
		int j = 1;    

		do{    
			System.out.println(j);    
			j++;    
		}while(j <= 10);    



		//Do while infinite program
		do{  
			System.out.println("infinitive do while loop");  
		}while(true);
	}
}