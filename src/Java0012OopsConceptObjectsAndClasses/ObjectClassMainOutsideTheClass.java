package Java0012OopsConceptObjectsAndClasses;

//Java Program to demonstrate having the main method in   
//another class  
//Creating Student class.  
class ObjectClassMainOutsideTheClass{  
	int id;  
	String name;  
}

//Creating another class TestStudent1 which contains the main method  
class TestStudent1{  
	public static void main(String args[]){  
		ObjectClassMainOutsideTheClass s1 = new ObjectClassMainOutsideTheClass();  
		System.out.println(s1.id);  
		System.out.println(s1.name);  
	}  
}  