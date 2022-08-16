package Java0017OopsConceptPolymorphism;

public class FinalVariableInitialization {

	final int speedlimit; //blank final variable  

	FinalVariableInitialization(){  
		speedlimit = 70;  
		System.out.println(speedlimit);  
	}  

	public static void main(String args[]){  
		new FinalVariableInitialization();  
	}  
}