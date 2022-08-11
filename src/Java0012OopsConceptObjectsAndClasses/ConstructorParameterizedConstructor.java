package Java0012OopsConceptObjectsAndClasses;

public class ConstructorParameterizedConstructor {

	int id;  
	String name;

	//creating a parameterized constructor  
	ConstructorParameterizedConstructor(int i, String n){  
		id = i;  
		name = n;  
	}

	//method to display the values  
	void display(){
		System.out.println(id + " " + name);
	}  

	public static void main(String args[]){  
		//creating objects and passing values  
		ConstructorParameterizedConstructor s1 = new ConstructorParameterizedConstructor(111, "Karan");  
		ConstructorParameterizedConstructor s2 = new ConstructorParameterizedConstructor(222, "Aryan");  

		//calling method to display the values of object  
		s1.display();  
		s2.display();  
	}
}