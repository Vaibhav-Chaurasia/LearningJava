package Java0017OopsConceptPolymorphism;

public class OverridingExample extends Vehicle1{
	
	/*In this example, we have defined the run method in the subclass as defined in the parent class 
	 * but it has some specific implementation. The name and parameter of the method are the same, 
	 * and there is IS-A relationship between the classes, so there is method overriding.
	 * */

	//defining the same method as in the parent class  
	void run(){
		System.out.println("Bike is running safely");
	}  

	public static void main(String args[]){  
		OverridingExample obj = new OverridingExample(); //creating object  
		obj.run(); //calling method  
	}

}

//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  
class Vehicle1{  
	
	//defining a method  
	void run(){
		System.out.println("Vehicle is running");
	}  
}