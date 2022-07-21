package Java0013OopsConceptEncapsulation;
import Java0013OopsConceptEncapsulation.*;

@SuppressWarnings("unused")
public class PackageUsingPackageName {
	public static void main(String args[]){  
		A obj = new A();  
		obj.msg();  
	}
}

class A{  
	public void msg(){
		System.out.println("Hello");
	}  
}