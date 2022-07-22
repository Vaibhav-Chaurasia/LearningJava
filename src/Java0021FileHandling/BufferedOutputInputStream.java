package Java0021FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputInputStream {

	/*--------------------------------------------------------------------------------------------------------------*/
	/*we are writing the textual information in the BufferedOutputStream object which is 
	 * connected to the FileOutputStream object. The flush() flushes the data of one stream and send it 
	 * into another. It is required if you have connected the one stream with another.*/

	//Buffer Output i.e. writing file
	public static void main(String args[])throws Exception{    
		FileOutputStream fout=new FileOutputStream("testout.txt");    
		BufferedOutputStream bout=new BufferedOutputStream(fout);    

		String s="Welcome to javaTpoint.";    
		byte b[]=s.getBytes();    
		bout.write(b);    
		bout.flush();    
		bout.close();    
		fout.close();    

		System.out.println("success");
		/*--------------------------------------------------------------------------------------------------------------*/

		/*--------------------------------------------------------------------------------------------------------------*/
		//Buffer Input i.e. reading file
		try{    
			FileInputStream fin=new FileInputStream("testout.txt");    
			BufferedInputStream bin=new BufferedInputStream(fin);    
			int i;    
			while((i=bin.read())!=-1){    
				System.out.print((char)i);    
			}    
			bin.close();    
			fin.close();    
		}catch(Exception e){
			System.out.println(e);
		}
		/*--------------------------------------------------------------------------------------------------------------*/
	}
}
