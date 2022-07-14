package Java0011OopsConcepts;

public class ObjectClassInitializationThroughReference {


	int id;  
	String name;  
}

class TestStudent3{  
	public static void main(String args[]){  
		//Creating objects  
		ObjectClassInitializationThroughReference s1=new ObjectClassInitializationThroughReference();  
		ObjectClassInitializationThroughReference s2=new ObjectClassInitializationThroughReference();  
		
		//Initializing objects  
		s1.id=101;  
		s1.name="Sonoo";  
		s2.id=102;  
		s2.name="Amit";  
		
		//Printing data  
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);  
	} 
}