package Java0012OopsConceptObjectsAndClasses;

public class StaticMethodExample2 {

	public static void main(String args[]){  
		Student1.change(); //calling change method  

		//creating objects  
		Student1 s1 = new Student1(111,"Karan");  
		Student1 s2 = new Student1(222,"Aryan");  
		Student1 s3 = new Student1(333,"Sonoo");  

		//calling display method  
		s1.display();  
		s2.display();  
		s3.display();  
	}
}


//Java Program to demonstrate the use of a static method.  
class Student1{  
	int rollno;  
	String name;  
	static String college = "ITS";  

	//static method to change the value of static variable  
	static void change(){  
		college = "BBDIT";  
	}  

	//constructor to initialize the variable  
	Student1(int r, String n){  
		rollno = r;  
		name = n;  
	}  

	//method to display values  
	void display(){
		System.out.println(rollno + " " + name + " " + college);
	}  
}