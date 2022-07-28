package Java0008DecisionMakingStatements;

public class NestedIfStatement {

	public static void main(String[] args) {

		//Nested If Statement
		String address = "Delhi, India";

		if(address.endsWith("India")) {

			if(address.contains("Meerut")) {
				System.out.println("Your city is Meerut");    
			}

			else if(address.contains("Noida")) {
				System.out.println("Your city is Noida");    
			}

			else {
				System.out.println(address.split(",")[0]);    
			}
		}

		else {
			System.out.println("You are not living in India");    
		}



		//Nested If Statement
		int age = 20;
		int weight = 80;

		//applying condition on age and weight  
		if(age >= 18){
			if(weight>50){
				System.out.println("You are eligible to donate blood");  
			}    
		}





		//Creating two variables for age and weight    
		int agee = 25;    
		int weightt = 48;      
		
		//applying condition on age and weight    
		if(agee >= 18){      
			if(weightt > 50){    
				System.out.println("You are eligible to donate blood");    
			} 
			
			else{  
				System.out.println("You are not eligible to donate blood");    
			}  
		} 
		
		else{  
			System.out.println("Age must be less than 18");  
		}  
	}
}
