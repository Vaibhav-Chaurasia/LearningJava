package Java0020ExceptionalHandling;

import java.io.IOException;

/*In case we handle the exception, the code will be executed fine whether exception occurs during the program or not.
 * */
public class ThrowsHandleExceptionUsingTryCatchBlock {
	public static void main(String args[]){  
		try{  
			M m = new M();  
			m.method();  
		}catch(Exception e){
			System.out.println("exception handled");
		}     

		System.out.println("normal flow...");  
	}
}

class M{  
	void method()throws IOException{  
		throw new IOException("device error");  
	}  
}