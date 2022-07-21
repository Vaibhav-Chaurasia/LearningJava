package Java0020ExceptionalHandling;

/*Let's consider the following example where we declare final variable age. Once declared it cannot be modified.*/
public class FFinalVariableDeclarationTwiceExample {
	
	//declaring final variable  
	final int age = 18;  
	void display() {  

		// reassigning value to age variable   
		// gives compile time error  
		age = 55;  
	}  

	public static void main(String[] args) {  
		FFinalVariableDeclarationTwiceExample obj = new FFinalVariableDeclarationTwiceExample();  
		
		// gives compile time error  
		obj.display();  
	}
}

/*Similarly, we can declare the methods and classes final using the final keyword.*/