package Java0003FirstProgram;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}


/*Parameters used in First Java Program
Let's see what is the meaning of class, public, static, void, main, String[], System.out.println().

- class - keyword is used to declare a class in Java.
- public - keyword is an access modifier that represents visibility. It means it is visible to all.
- static - is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method. So, it saves memory.
- void - is the return type of the method. It means it doesn't return any value.
- main - represents the starting point of the program.
- String[] args or String args[] - is used for command line argument. "https://lightrun.com/java/java-tutorial-java-command-line-arguments/"
Java command line arguments are arguments that are passed to your program via a terminal or shell command. They make your Java program more configurable by giving users or scripts running your software a way to specify input parameters at run time.
- System.out.println() - is used to print statement. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class.*/