package Java0012OopsConceptObjectsAndClasses;

public class ConstructorDefaultConstWithDefaultValues {
	
	/*Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor. 
	 * Here 0 and null values are provided by default constructor.*/

	int id;  
	String name;  

	//method to display the value of id and name  
	void display(){
		System.out.println(id + " " + name);
	}  

	public static void main(String args[]){  
		//creating objects  
		ConstructorDefaultConstWithDefaultValues s1 = new ConstructorDefaultConstWithDefaultValues();  
		ConstructorDefaultConstWithDefaultValues s2 = new ConstructorDefaultConstWithDefaultValues();  

		//displaying values of the object  
		s1.display();  
		s2.display();  
	}
}