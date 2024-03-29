package Java0021FileHandling;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputInputStream {
	public static void main(String args[])throws Exception{

		/*--------------------------------------------------------------------------------------------------------------*/
		//ByteArrayOutputStream class to write common data into 2 files: f1.txt and f2.txt.
		//Byte Array Output stream i.e. writing to file.
		FileOutputStream fout1 = new FileOutputStream("f1.txt");    
		FileOutputStream fout2 = new FileOutputStream("f2.txt");    

		ByteArrayOutputStream bout = new ByteArrayOutputStream();    
		bout.write(65);    
		bout.writeTo(fout1);    
		bout.writeTo(fout2);    

		bout.flush();    
		bout.close(); //has no effect    
		System.out.println("Success...");    
		/*--------------------------------------------------------------------------------------------------------------*/




		/*--------------------------------------------------------------------------------------------------------------*/
		byte[] buf = { 35, 36, 37, 38 };  

		// Create the new byte array input stream  
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
		int k = 0;  
		while ((k = byt.read()) != -1) {  
			//Conversion of a byte into character  
			char ch = (char) k;  
			System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
		}
		/*--------------------------------------------------------------------------------------------------------------*/
	}
}
