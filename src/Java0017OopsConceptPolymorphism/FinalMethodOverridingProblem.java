package Java0017OopsConceptPolymorphism;

public class FinalMethodOverridingProblem extends Bike{
	void run(){
		System.out.println("running safely with 100kmph");
	}  

	public static void main(String args[]){  
		FinalMethodOverridingProblem honda = new FinalMethodOverridingProblem();  
		honda.run();  
	}
}

class Bike{  
	final void run(){
		System.out.println("running");
	}  
}