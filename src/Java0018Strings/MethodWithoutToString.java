package Java0018Strings;

public class MethodWithoutToString {
	int rollno;  
	String name;  
	String city;  

	MethodWithoutToString(int rollno, String name, String city){  
		this.rollno = rollno;  
		this.name = name;  
		this.city = city;  
	}  

	public static void main(String args[]){  
		MethodWithoutToString s1 = new MethodWithoutToString(101, "Raj", "lucknow");  
		MethodWithoutToString s2 = new MethodWithoutToString(102, "Vijay", "ghaziabad");  

		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()  
	}
}

/*printing s1 and s2 prints the hashcode values of the objects but 
 * I want to print the values of these objects. Since Java compiler 
 * internally calls toString() method, overriding this method will 
 * return the specified values.*/