package Java0019ExceptionalHandling;

public class TryCatchExampleWithExceptionHandling {
	public static void main(String args[]){  
		try{  
			//code that may raise exception  
			@SuppressWarnings("unused")
			int data = 100/0;  
		} catch(ArithmeticException e){
			System.out.println(e);
		}  

		//rest code of the program   
		System.out.println("rest of the code...");  
	}
}