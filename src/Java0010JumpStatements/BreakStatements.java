package Java0010JumpStatements;

public class BreakStatements {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Break statement example
		for(int i = 0; i <= 10; i++) {  
			System.out.println(i);  
			if(i == 6) {  
				break;  
			}  
		}  



		//Break statement example
		a:    
			for(int i = 0; i <= 10; i++) {    
				b:    
					for(int j = 0; j <= 15; j++) {    
						c:    
							for (int k = 0; k <= 20; k++) {    
								System.out.println(k);    
								if(k == 5) {    
									break a;    
								}    
							}    
					}    

			}    




		//Break statement in for loop  
		for(int i = 1; i <= 10; i++){  
			if(i == 5){  
				//breaking the loop  
				break;  
			}  
			System.out.println(i);  
		}



		//Break statement in nested for loop   
		for(int i = 1; i <= 3; i++){    
			//inner loop  
			for(int j = 1; j <= 3; j++){    
				if(i == 2 && j == 2){    
					//using break statement inside the inner loop  
					break;    
				}    
				System.out.println(i + " " + j);
			}    
		} 



		//Break statement with Labelled for loop
		aa:  
			for(int i = 1; i <= 3; i++){    
				bb:  
					for(int j = 1; j <= 3; j++){    
						if(i == 2 && j == 2){    
							//using break statement with label  
							break aa;    
						}    
						System.out.println(i + " " + j);   
					}    
			}




		//Break statement with while loop  
		int i = 1;  
		while(i <= 10){  
			if(i == 5){  
				//using break statement  
				i++;  
				break;//it will break the loop  
			}  
			System.out.println(i);  
			i++;  
		}



		//Break statement with do while loop
		//declaring variable  
		int j = 1;  
		//do-while loop  
		do{  
			if(j == 5){  
				//using break statement  
				j++;  
				break;//it will break the loop  
			}  
			System.out.println(i);  
			j++;  
		}while(j <= 10);



		//Break statement in Switch Statement
		int num = 2;

		switch (num){
		case 0:
			System.out.println("number is 0");
			break;

		case 1:
			System.out.println("number is 1");
			break;

		default:
			System.out.println(num);
		}
	}
}