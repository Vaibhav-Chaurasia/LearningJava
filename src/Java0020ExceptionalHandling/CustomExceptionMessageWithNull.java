package Java0020ExceptionalHandling;

//class that uses custom exception MyCustomException
public class CustomExceptionMessageWithNull {

	public static void main(String args[])  
	{  
		try {  
			// throw an object of user defined exception  
			throw new MyCustomException();  
		}  
		catch (MyCustomException ex) {  
			System.out.println("Caught the exception");  
			System.out.println(ex.getMessage());  
		}  

		System.out.println("rest of the code...");    
	}
}

@SuppressWarnings("serial")
//class representing custom exception  
class MyCustomException extends Exception {  

}