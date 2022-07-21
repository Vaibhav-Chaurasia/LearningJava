package Java0020ExceptionalHandling;

import java.io.IOException;

/*In case we declare the exception and if exception occurs.*/
public class ThrowsDeclareExceptionNoExceptionOccurs {

	public static void main(String args[])throws IOException{//declare exception  
		M2 m = new M2();  
		m.method();  

		System.out.println("normal flow...");  
	}
}

class M2{  
	void method()throws IOException{  
		throw new IOException("device error");  
	}  
}