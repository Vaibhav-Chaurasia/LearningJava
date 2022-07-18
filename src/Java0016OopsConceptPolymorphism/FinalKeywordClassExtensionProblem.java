package Java0016OopsConceptPolymorphism;

public class FinalKeywordClassExtensionProblem extends Bike1{
	
	void run(){
		System.out.println("running safely with 100kmph");
	}  

	public static void main(String args[]){  
		FinalKeywordClassExtensionProblem honda= new FinalKeywordClassExtensionProblem();  
		honda.run();  
	}
}

final class Bike1{}