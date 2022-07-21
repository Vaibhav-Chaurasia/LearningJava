package Java0019ExceptionalHandling;
/*In the following code, constructor of InvalidAgeException takes a string as an argument. 
 * This string is passed to constructor of parent class Exception using the super() method. 
 * Also the constructor of Exception class can be called without using a parameter and 
 * calling super() method is not mandatory.*/

//class that uses custom exception InvalidAgeException
public class CustomExceptionMessage {
	// method to check the age  
	static void validate (int age) throws InvalidAgeException{    
		if(age < 18){  

			// throw an object of user defined exception  
			throw new InvalidAgeException("age is not valid to vote");    
		}  
		else {   
			System.out.println("welcome to vote");   
		}   
	}    

	// main method  
	public static void main(String args[])  
	{  
		try  
		{  
			// calling the method   
			validate(13);  
		}  
		catch (InvalidAgeException ex)  
		{  
			System.out.println("Caught the exception");  

			// printing the message from InvalidAgeException object  
			System.out.println("Exception occured: " + ex);  
		}  

		System.out.println("rest of the code...");    
	}
}

//class representing custom exception  
@SuppressWarnings("serial")
class InvalidAgeException  extends Exception  
{  
	public InvalidAgeException (String str)  
	{  
		// calling the constructor of parent Exception  
		super(str);  
	}  
}