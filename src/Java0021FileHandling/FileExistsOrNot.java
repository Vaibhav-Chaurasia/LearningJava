package Java0021FileHandling;

import java.io.File;
import java.io.IOException;

public class FileExistsOrNot {
	public static void main(String[] args) {  

		try {  
			File file = new File("javaFile123.txt");  
			
			if (file.createNewFile()) {  
				System.out.println("New File is created!");  
			} 
			
			else {  
				System.out.println("File already exists.");  
			}  
		} catch (IOException e) {  
			e.printStackTrace();  
		}
	}
}