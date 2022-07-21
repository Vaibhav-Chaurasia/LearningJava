package Java0017OopsConceptPolymorphism;

public class FinalParameterVariableInitializationProblem {
	int cube(final int n){  
		n = n + 2;//can't be changed as n is final  
		n * n * n;  
	}

	public static void main(String args[]){  
		FinalParameterVariableInitializationProblem b = new FinalParameterVariableInitializationProblem();  
		b.cube(5);  
	}
}
