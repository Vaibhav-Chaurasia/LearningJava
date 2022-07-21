package Java0012OopsConceptObjectsAndClasses;


/*In this example, we have created a Student class which has two data members id and name. 
 * We are creating the object of the Student class by new keyword and printing the object's value.*/

//Java Program to illustrate how to define a class and fields 
public class ObjectClassStudentClassExample {

	//defining fields  
	int id;//field or data member or instance variable  
	
	String name;  
	
	//creating main method inside the Student class  
	public static void main(String args[]){  
		//Creating an object or instance  
		ObjectClassStudentClassExample s1 = new ObjectClassStudentClassExample();//creating an object of Student  
		
		//Printing values of the object  
		System.out.println(s1.id);//accessing member through reference variable  
		System.out.println(s1.name);  
	}
}
