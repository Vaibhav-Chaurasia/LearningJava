package Java0005Variables;

public class VariablesConcepts {

	//static variable 
	static int m=100;

	public static void main(String[] args) {

		System.out.println(m);

		//instance variable
		int data=50;
		System.out.println(data);
	}

	public void method()  
	{    
		//local variable
		int n=90;
		System.out.println(n);
		System.out.println(m);
	}
}
