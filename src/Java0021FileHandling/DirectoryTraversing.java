package Java0021FileHandling;

import java.io.File;

public class DirectoryTraversing {
	// Method 1
	// To display fies
	public static void displayFiles(File[] files)
	{
		// Traversing through the files array
		for (File filename : files) {
			// If a sub directory is found,
			// print the name of the sub directory
			if (filename.isDirectory()) {
				System.out.println("Directory: "
						+ filename.getName());

				// and call the displayFiles function
				// recursively to list files present
				// in sub directory
				displayFiles(filename.listFiles());
			}

			// Printing the file name present in given path
			else {
				// Getting the file name
				System.out.println("File: "
						+ filename.getName());
			}
		}
	}


	// Main driver method
	public static void main(String[] args)
	{
		// Storing the name of files and directories
		// in an array of File type
		File[] files = new File("D:\\Personal\\Study\\Java\\LearningJava\\").listFiles();

		// Calling method 1 to
		// display files
		displayFiles(files);
	}
}