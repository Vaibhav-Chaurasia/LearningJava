package Java0011OopsConceptObjectsAndClasses;

public class ThisKeywordNotUsedIfVariableDifferent {

	public static void main(String args[]){  
		Student4 s1 = new Student4(111,"ankit",5000f);  
		Student4 s2 = new Student4(112,"sumit",6000f);  
		
		s1.display();  
		s2.display();  
	}
}


class Student4{  
	int rollno;  
	String name;  
	float fee;  
	
	Student4(int r, String n, float f){  
		rollno = r;  
		name = n;  
		fee = f;  
	}  

	void display(){
		System.out.println(rollno + " " + name + " " + fee);
	}  
}
