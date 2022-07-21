package Java0020ExceptionalHandling;

public class ExceptionPropagationHandled {
	void m(){  
		@SuppressWarnings("unused")
		int data=50/0;  
	}  

	void n(){  
		m();  
	}  

	void p(){  
		try{  
			n();  
		}catch(Exception e){
			System.out.println("exception handled");
		}  
	}  

	public static void main(String args[]){  
		ExceptionPropagationHandled obj=new ExceptionPropagationHandled();  
		obj.p();  
		System.out.println("normal flow...");  
	}
}

/*
 * exception occurs in the m() method where it is not handled, 
 * so it is propagated to the previous n() method where it is not handled, 
 * again it is propagated to the p() method where exception is handled.

 * Exception can be handled in any method in call stack either in the main() method, p() method, n() method or m() method.
 */