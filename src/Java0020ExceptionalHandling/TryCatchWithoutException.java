package Java0020ExceptionalHandling;

public class TryCatchWithoutException {
	
	public static void main(String[] args) {  
		@SuppressWarnings("unused")
		int data=50/0; //may throw exception   

		System.out.println("rest of the code");  

	}
}

/*As displayed in the above example, the rest of the code is not executed 
 * (in such case, the rest of the code statement is not printed).

There might be 100 lines of code after the exception. If the exception is not handled, 
all the code below the exception won't be executed.*/