package Java0009LoopStatements;

public class ForLoopStatements {

	public static void main(String[] args) {
		
		//Code of Java for loop  
		for(int i = 1; i <= 10; i++){  
			System.out.println(i);  
		}

		//For loop example
		int sum = 0;  
		
		for(int j = 1; j <= 10; j++) {  
			sum = sum + j;  
		}  
		
		System.out.println("The sum of first 10 natural numbers is " + sum);



		//Nested For Loop
		//loop of i  
		for(int i = 1; i <= 3; i++){  
			
			//loop of j  
			for(int j = 1;j <= 3;j++){  
				System.out.println(i+" "+j);  
			} //end of i  
		} //end of j



		//Pyramid example
		for(int i = 1; i <= 5; i++){  
			for(int j = 1; j <= i; j++){  
				System.out.print("* ");  
			}  
			System.out.println(); //new line  
		}



		//Pyramid example
		int term = 6;  
		
		for(int i = 1; i <= term; i++){  
			for(int j = term; j >= i; j--){  
				System.out.print("* ");  
			}  
			System.out.println(); //new line  
		}


		//Using no condition in for loop i.e. infinite
		for(;;){  
			System.out.println("infinitive loop");  
		}  
	}

}
