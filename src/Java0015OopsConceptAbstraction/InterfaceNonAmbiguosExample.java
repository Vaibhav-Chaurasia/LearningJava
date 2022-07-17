package Java0015OopsConceptAbstraction;

public class InterfaceNonAmbiguosExample implements Printable2, Showable2 {
	public void print(){
		System.out.println("Hello");
	}  

	public static void main(String args[]){  
		InterfaceNonAmbiguosExample obj = new InterfaceNonAmbiguosExample();  
		obj.print();  
	}
}

interface Printable2{  
	void print();  
}

interface Showable2{  
	void print();  
}

/*
 * As you can see in the above example, Printable and Showable interface have same methods 
 * but its implementation is provided by class InterfaceNonAmbiguosExample, so there is no ambiguity.
 */