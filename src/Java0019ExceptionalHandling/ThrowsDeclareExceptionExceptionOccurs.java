package Java0019ExceptionalHandling;

import java.io.IOException;

/*In case we declare the exception, if exception does not occur, the code will be executed fine.*/
public class ThrowsDeclareExceptionExceptionOccurs {

	public static void main(String args[])throws IOException{//declare exception  
		M1 m = new M1();  
		m.method();  

		System.out.println("normal flow...");  
	}
}

class M1{  
	void method()throws IOException{  
		System.out.println("device operation performed");  
	}  
}