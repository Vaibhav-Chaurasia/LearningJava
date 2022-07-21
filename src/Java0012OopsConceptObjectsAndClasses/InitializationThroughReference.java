package Java0012OopsConceptObjectsAndClasses;

public class InitializationThroughReference {
	
	int id;  
	String name;
	
	public static void main(String args[]){  
		//Creating objects  
		InitializationThroughReference s1 = new InitializationThroughReference();  
		InitializationThroughReference s2 = new InitializationThroughReference();  
		
		//Initializing objects  
		s1.id = 101;  
		s1.name = "Sonoo";  
		
		s2.id = 102;  
		s2.name = "Amit";  
		
		//Printing data  
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);  
	}
}