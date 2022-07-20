package Java0018Strings;

public class MethodWithToString {
	int rollno;  
	String name;  
	String city;  

	MethodWithToString(int rollno, String name, String city){  
		this.rollno = rollno;  
		this.name = name;  
		this.city = city;  
	}  

	public String toString(){//overriding the toString() method  
		return rollno + " " + name + " " + city;  
	}  

	public static void main(String args[]){  
		MethodWithToString s1 = new MethodWithToString(101, "Raj", "lucknow");  
		MethodWithToString s2 = new MethodWithToString(102, "Vijay", "ghaziabad");  

		System.out.println(s1);//compiler writes here s1.toString()  
		System.out.println(s2);//compiler writes here s2.toString()  
	}
}

/*Java compiler internally calls toString() method, overriding this method will 
 * return the specified values of s1 and s2 objects of Student class.*/