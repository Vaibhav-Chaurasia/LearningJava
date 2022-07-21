package Java0016OopsConceptAbstraction;

public class InterfaceInheritanceExample implements Showable3{
	public void print(){
		System.out.println("Hello");
	}

	public void show(){
		System.out.println("Welcome");
	}  

	public static void main(String args[]){  
		InterfaceInheritanceExample obj = new InterfaceInheritanceExample();  
		
		obj.print();  
		obj.show();  
	}
}

interface Printable3{  
	void print();  
}

interface Showable3 extends Printable3{  
	void show();
}