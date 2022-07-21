package Java0017OopsConceptPolymorphism;

public class FinalVariableAssignedTwiceProblem {
	
	/*There is a final variable speedlimit, we are going to change the value of this variable, 
	 * but It can't be changed because final variable once assigned a value can never be changed.
	 * */
	
	final int speedlimit = 90;//final variable  
	
	void run(){  
		speedlimit = 400;  
	}  
	
	public static void main(String args[]){  
		FinalVariableAssignedTwiceProblem obj = new  FinalVariableAssignedTwiceProblem();  
		obj.run();  
	}
}