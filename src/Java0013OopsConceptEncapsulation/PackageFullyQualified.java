package Java0013OopsConceptEncapsulation;

public class PackageFullyQualified {

	public static void main(String args[]){  
		Java0013OopsConceptEncapsulation.A1 obj = new Java0013OopsConceptEncapsulation.A1();//using fully qualified name  
		obj.msg();  
	}

}


class A1{  
	public void msg(){
		System.out.println("Hello");
	}  
}