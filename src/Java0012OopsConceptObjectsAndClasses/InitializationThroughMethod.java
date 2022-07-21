package Java0012OopsConceptObjectsAndClasses;

/*In this example, we are creating the two objects of Student class and initializing the value to these objects by 
 * invoking the insertRecord method. 
 * Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.*/
public class InitializationThroughMethod {
	int rollno;  
	String name;
	
	public static void main(String args[]){  
		InitializationThroughMethod s1 = new InitializationThroughMethod();  
		InitializationThroughMethod s2 = new InitializationThroughMethod();  

		s1.insertRecord(111,"Karan");  
		s2.insertRecord(222,"Aryan");  

		s1.displayInformation();  
		s2.displayInformation();  
	}

	void insertRecord(int r, String n){  
		rollno = r;  
		name = n;  
	}

	void displayInformation(){
		System.out.println(rollno+" "+name);
	}
}