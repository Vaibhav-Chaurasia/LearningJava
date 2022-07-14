package Java0011OopsConcepts;

public class ObjectClassMainOutsideTheClass {
	int id;  
	String name;  
}


class TestStudent1{  
	public static void main(String args[]){  
		ObjectClassMainOutsideTheClass s1=new ObjectClassMainOutsideTheClass();  
		System.out.println(s1.id);  
		System.out.println(s1.name);  
	}
}