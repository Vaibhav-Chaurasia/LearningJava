package Java0021FileHandling;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String args[]){

		/*----------------------------------------------------------------------------------------*/
		/*Note: Before running the code, a text file named as "testout.txt" is required to be created. 
		 * After executing the above program, you will get a single character from the file which 
		 * is 87 (in byte form). To see the text, you need to convert it into character.
		 * */
		try{    
			FileInputStream fin = new FileInputStream("testout.txt");
			int i = fin.read();  

			System.out.print((char)i);    
			System.out.println("\n\n");

			fin.close();    
		}catch(Exception e){System.out.println(e);
		}
		/*----------------------------------------------------------------------------------------*/



		/*----------------------------------------------------------------------------------------*/
		//read all characters
		try{    
			FileInputStream fin = new FileInputStream("testout1.txt");    
			int i = 0;
			while((i = fin.read()) != -1){    
				System.out.print((char)i);    
			}    
			fin.close();    
		}catch(Exception e){
			System.out.println(e);
		}
		/*----------------------------------------------------------------------------------------*/
	}
}
