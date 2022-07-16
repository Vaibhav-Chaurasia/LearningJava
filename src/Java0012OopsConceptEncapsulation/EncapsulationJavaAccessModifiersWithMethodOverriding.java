package Java0012OopsConceptEncapsulation;

public class EncapsulationJavaAccessModifiersWithMethodOverriding extends A6{

	void msg(){
		System.out.println("Hello java");
	}//C.T.Error  

	public static void main(String args[]){  
		EncapsulationJavaAccessModifiersWithMethodOverriding obj=new EncapsulationJavaAccessModifiersWithMethodOverriding();  
		obj.msg();  
	}
}

class A6{  
	protected void msg(){
		System.out.println("Hello java");
	}  
}

/*
 *If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
 */