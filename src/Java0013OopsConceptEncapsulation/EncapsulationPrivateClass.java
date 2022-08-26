package Java0013OopsConceptEncapsulation;

/*In this example, we have created two classes EncapsulationPrivateClass and A2. 
 * EncapsulationPrivateClass class contains private data member and private method. 
 * We are accessing these private members from outside the class, so there is a compile-time error.
 * */

public class EncapsulationPrivateClass {
	public static void main(String args[]){  
		A2 obj=new A2();  
		System.out.println(obj.data); //Compile Time Error  
		obj.msg(); //Compile Time Error  
	}
}

class A2{  
	@SuppressWarnings("unused")
	private int data = 40;  
	private void msg(){System.out.println("Hello java");}  
}