package Java0016OopsConceptAbstraction;

public class InterfaceMultipleInterfaceExample implements Printable1, Showable{
	public void print(){
		System.out.println("Hello");
	}

	public void show(){
		System.out.println("Welcome");
	}  

	public static void main(String args[]){  
		InterfaceMultipleInterfaceExample obj = new InterfaceMultipleInterfaceExample();  
		obj.print();  
		obj.show();  
	}
}


interface Printable1{  
	void print();  
}

interface Showable{  
	void show();  
}