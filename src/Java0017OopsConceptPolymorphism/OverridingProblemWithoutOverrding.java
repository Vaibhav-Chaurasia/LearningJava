package Java0017OopsConceptPolymorphism;

public class OverridingProblemWithoutOverrding extends Vehicle{

	public static void main(String args[]){  
		//creating an instance of child class  
		OverridingProblemWithoutOverrding obj = new OverridingProblemWithoutOverrding();  

		//calling the method with child class instance  
		obj.run();  
	}
}


//Java Program to demonstrate why we need method overriding  
//Here, we are calling the method of parent class with child  
//class object.  
//Creating a parent class  
class Vehicle{  
	void run(){
		System.out.println("Vehicle is running");
	}  
}

/*
 * Problem is that I have to provide a specific implementation of 
 * run() method in subclass that is why we use method overriding.
 */