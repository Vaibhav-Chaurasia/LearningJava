//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.
package Java0012OopsConceptEncapsulation;

public class EncapsulationExample1 {
	public static void main(String[] args){  
		//creating instance of the encapsulated class  
		EncapsulationExample s = new EncapsulationExample();  
		
		//setting value in the name member  
		s.setName("vijay");  
		
		//getting value of the name member  
		System.out.println(s.getName());  
	}
}