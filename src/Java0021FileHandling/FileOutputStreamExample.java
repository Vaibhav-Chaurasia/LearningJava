package Java0021FileHandling;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]){
		
		/*----------------------------------------------------------------------------------------*/
		//The content of a text file testout.txt is set with the data A.
		try{    
			FileOutputStream fout = new FileOutputStream("testout.txt");	
			fout.write(65);    
			fout.close();    
			
			System.out.println("success...");    
		}catch(Exception e){
			System.out.println(e);
		}
		/*----------------------------------------------------------------------------------------*/

		
		
		/*----------------------------------------------------------------------------------------*/
		//The content of a text file testout.txt is set with the data Welcome to javaTpoint.
		try{    
			FileOutputStream fout = new FileOutputStream("testout1.txt");    
			String s = "Welcome to javaTpoint.";    
			byte b[] = s.getBytes(); //converting string into byte array    
			fout.write(b);    
			fout.close();    
			
			System.out.println("success...");    
		}catch(Exception e){
			System.out.println(e);
		}
		/*----------------------------------------------------------------------------------------*/
	}
}