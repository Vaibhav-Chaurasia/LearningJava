package Java0010JumpStatements;

public class ContinueStatement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//Continue statement in for loop
		for(int i = 0; i <= 2; i++) {  

			for (int j = i; j <= 5; j++) {  

				if(j == 4) {  
					continue;  
				}  
				System.out.println(j);  
			}  
		}



		//Continue statement in for loop
		for(int i = 1; i <= 10; i++){  
			if(i == 5){  
				//using continue statement  
				continue;//it will skip the rest statement  
			}  
			System.out.println(i);  
		} 



		//Continue statement in Nested for loop
		for(int i = 1; i <= 3; i++){    
			//inner loop  
			for(int j = 1; j <= 3; j++){    
				if(i == 2 && j == 2){    
					//using continue statement inside inner loop  
					continue;    
				}    
				System.out.println(i+" "+j);    
			}    
		}


		
		//Continue statement in Labelled for loop
		aa:  
			for(int i = 1; i <= 3; i++){    
				bb:  
					for(int j = 1; j <= 3; j++){    
						if(i == 2 && j == 2){    
							//using continue statement with label  
							continue aa;    
						}    
						System.out.println(i+" "+j);    
					}    
			}


		
		
		//Continue statement in while loop
		int i = 1;  
		while(i <= 10){  
			if(i == 5){  
				//using continue statement  
				i++;  
				continue;//it will skip the rest statement  
			}  
			System.out.println(i);  
			i++;  
		}



		//Continue statement in do while loop
		int j = 1;  
		//do-while loop  
		do{  
			if(j == 5){  
				//using continue statement  
				j++;  
				continue;//it will skip the rest statement  
			}  
			System.out.println(j);  
			j++;  
		}while(j <= 10);
	}

}
