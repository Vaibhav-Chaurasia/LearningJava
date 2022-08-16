package Java0017OopsConceptPolymorphism;

public class FinalStaticVariableInitialization {
	static final int data;//static blank final variable  
	
	static{ 
		data = 50;
	}  

	public static void main(String args[]){  
		System.out.println(FinalStaticVariableInitialization.data);  
	}
}