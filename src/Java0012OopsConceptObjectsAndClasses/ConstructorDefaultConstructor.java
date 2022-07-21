package Java0012OopsConceptObjectsAndClasses;

public class ConstructorDefaultConstructor {
	
	/*In this example, we are creating the no-arg constructor in the Bike class.
	 * It will be invoked at the time of object creation.*/

	@SuppressWarnings("unused")
	public static void main(String args[]){  
		//calling a default constructor  
		Bike1 b = new Bike1();  
	}
}

class Bike1{  
	//creating a default constructor  
	Bike1(){
		System.out.println("Bike is created");
	}
}