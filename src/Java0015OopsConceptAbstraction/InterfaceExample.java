package Java0015OopsConceptAbstraction;

public class InterfaceExample implements printable{
	public void print(){
		System.out.println("Hello");
	}  

	public static void main(String args[]){  
		InterfaceExample obj = new InterfaceExample();  
		obj.print();
	}
}

interface printable{  
	void print();
}