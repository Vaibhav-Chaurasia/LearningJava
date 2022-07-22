package Java0021FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriterReader {
	public static void main(String[] args) throws Exception {
		
		/*--------------------------------------------------------------------------------------------------------------*/
		//Buffer writer class
		FileWriter writer = new FileWriter("testout.txt");  
		BufferedWriter buffer = new BufferedWriter(writer);  
		buffer.write("Welcome to javaTpoint.");  
		buffer.close();  
		System.out.println("Success");
		/*--------------------------------------------------------------------------------------------------------------*/
		
		


		/*--------------------------------------------------------------------------------------------------------------*/
		//Buffer reader class
		FileReader fr=new FileReader("testout.txt");    
		BufferedReader br=new BufferedReader(fr);    

		int i;    
		while((i=br.read()) != -1){  
			System.out.print((char)i);  
		}  
		br.close();    
		fr.close();
		/*--------------------------------------------------------------------------------------------------------------*/
	}
}
