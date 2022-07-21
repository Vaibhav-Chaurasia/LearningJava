package Java0013OopsConceptEncapsulation;

/*Role of Private Constructor
If you make any class constructor private, you cannot create the instance of that class from outside the class. 
 */

public class EncapsulationPrivateConstructor {
	public static void main(String args[]){  
		A3 obj=new A3();//Compile Time Error  
	}
}

class A3{  
	private A3(){

	}//private constructor  

	void msg(){
		System.out.println("Hello java");
	}  
}