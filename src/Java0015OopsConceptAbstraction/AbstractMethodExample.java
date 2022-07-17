package Java0015OopsConceptAbstraction;

public class AbstractMethodExample extends Bike{
	
	/*Bike is an abstract class that contains only one abstract method run. 
	 * Its implementation is provided by the AbstractMethodExample class.
	 * */

	void run(){
		System.out.println("running safely");
	}  

	public static void main(String args[]){  
		Bike obj = new AbstractMethodExample();  
		obj.run();  
	}

}

abstract class Bike{  
	abstract void run();  
}